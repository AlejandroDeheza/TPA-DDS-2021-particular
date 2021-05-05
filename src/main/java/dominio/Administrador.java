package dominio;

public class Administrador extends Usuario{

  public Administrador(String usuario, String contrasenia){
    super(usuario, contrasenia);
  }

  public void agregarCaracteristica(Caracteristica caracteristica){
    new RepositorioCaracteristicas().agregarCaracteristica(caracteristica);
    //obviemos por ahora el "new"
    //en realidad supongo que el repositorio deberia ser un singleton
  }

  public void eliminarCaracteristica(Caracteristica caracteristica){
    new RepositorioCaracteristicas().eliminarCaracteristica(caracteristica);
  }
}
