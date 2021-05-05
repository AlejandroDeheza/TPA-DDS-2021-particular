package dominio;

import java.util.List;

public class RepositorioCaracteristicas {
  //capaz haga falta tratar esta clase como un singleton

  private List<Caracteristica> caracteristicas;

  //La idea es que este metodo solo sea usado por el administrador
  public void agregarCaracteristica(Caracteristica caracteristica){
    this.caracteristicas.add(caracteristica);
  }

  //lo mismo que la anterior
  public void eliminarCaracteristica(Caracteristica caracteristica){
    this.caracteristicas.remove(caracteristica);
  }

  //La idea es que en el front nos pidan esto para poder completar las caracteristicas de una mascota
  //cuando se este registrando
  public List<Caracteristica> getCaracteristicas() {
    return this.caracteristicas;
  }
}
