package dominio;

public class UsuarioDuenioMascota extends Usuario{
  private DuenioMascota duenioMascota;

  public UsuarioDuenioMascota(String usuario, String contrasenia, DuenioMascota duenioMascota){
    super(usuario, contrasenia);
    this.duenioMascota = duenioMascota;
  }
}
