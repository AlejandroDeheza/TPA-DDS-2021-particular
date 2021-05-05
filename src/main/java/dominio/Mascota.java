package dominio;

import java.time.LocalDate;
import java.util.List;

public class Mascota {

  private TipoMascota tipoMascota;
  private String nombre;
  private String apodo;
  private LocalDate fechaDeNacimientoAproximada;
  private Boolean esMacho;
  private String descripcionFisica;
  private List<Foto> fotos;
  private List<Caracteristica> caracteristicas;

  public Mascota(TipoMascota tipoMascota, String nombre, String apodo, LocalDate fechaDeNacimientoAproximada,
                 Boolean esMacho, String descripcionFisica, List<Foto> fotos, List<Caracteristica> caracteristicas){
    this.tipoMascota = tipoMascota;
    this.nombre = nombre;
    this.apodo = apodo;
    this.fechaDeNacimientoAproximada = fechaDeNacimientoAproximada;
    this.esMacho = esMacho;
    this.descripcionFisica = descripcionFisica;
    this.fotos = fotos;
    this.caracteristicas = caracteristicas;
  }

  public Integer calcularEdadAproximada(){
    return 0;
    //TODO
  }
}
