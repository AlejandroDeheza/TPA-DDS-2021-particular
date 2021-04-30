package dominio;

import java.time.LocalDate;

public class Rescatista extends Persona{

  private String direccion;

  public Rescatista(String nombre, String apellido, LocalDate fechaNacimiento, TipoDocumento tipoDocumento,
                    Long numeroDocumento, String direccion, Integer telefono, String email){

    super(nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, telefono, email);
    this.direccion = direccion;
  }
}
