package dominio;

import java.util.List;

public class Mascota {

  TipoMascota tipoMascota;      //permite agregar mas tipos a futuro. un loro por ejemplo?
  String nombre;
  String apodo;
  Integer edadAproximada;
  Boolean esMacho;
  String descripcionFisica;
  List<Foto> fotos;        // clase Foto??
  List<Caracteristica> caracteristicas;//en la interfaz grafica el administrador puede
                                      //modificar que Caracteristicas poner en la lista antes de pasar la lista
                                      //por el constructor de Mascota

  Mascota(TipoMascota tipoMascota, String nombre, String apodo, Integer edadAproximada, Boolean esMacho,
          String descripcionFisica, List<Foto> fotos, List<Caracteristica> caracteristicas){
    this.tipoMascota = tipoMascota;
    this.nombre = nombre;
    this.apodo = apodo;
    this.edadAproximada = edadAproximada;
    this.esMacho = esMacho;
    this.descripcionFisica = descripcionFisica;
    this.fotos = fotos;
    this.caracteristicas = caracteristicas;
  }
}
