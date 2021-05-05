package dominio;

import java.util.List;

public class DuenioMascota extends Usuario{

  private Persona duenioMascota;
  private List<Mascota> mascotas;

  public DuenioMascota(String usuario, String contrasenia, Persona duenioMascota, List<Mascota> mascotas){
    super(usuario, contrasenia);
    this.duenioMascota = duenioMascota;
    this.mascotas = mascotas;
  }
}
