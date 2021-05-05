package dominio;

import excepciones.PersonaInvalidaException;

import java.time.LocalDate;

public class Persona {

  private String nombre;
  private String apellido;
  private LocalDate fechaNacimiento;
  private TipoDocumento tipoDocumento;
  private String numeroDocumento;
  private Integer telefono;
  private String email;

  public Persona(String nombre, String apellido, LocalDate fechaNacimiento, TipoDocumento tipoDocumento,
                 String numeroDocumento, Integer telefono, String email){

    this.validarPersona(nombre, apellido, telefono, email);

    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.telefono = telefono;
    this.email = email;
  }

  private void validarPersona(String nombre, String apellido, Integer telefono, String email){
    if((nombre == null || apellido == null) && telefono == null && email == null){
      throw new PersonaInvalidaException(
          "Debe ingresar como minimo uno de los siguientes campos: <nombre y apellido>, <telefono> o <email>");
    }
  }
}
