package dominio;

import java.time.LocalDate;
import java.util.List;

public class DuenioMascota extends Persona{

  List<Mascota> mascotas;

  public DuenioMascota(String nombre, String apellido, LocalDate fechaNacimiento, TipoDocumento tipoDocumento,
                       Long numeroDocumento, List<Mascota> mascotas, Integer telefono, String email){

    super(nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, telefono, email);
    this.mascotas = mascotas;
  }
}
