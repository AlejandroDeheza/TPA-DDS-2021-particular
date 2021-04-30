package dominio;

import excepciones.MascotaEncontradaInvalidaException;

import java.time.LocalDate;
import java.util.List;

public class MascotaEncontrada {

  private List<Foto> fotos;
  private String descripcionEstadoActual;
  private Ubicacion ubicacion;         //buscar como se comunican apis de mapas

  private LocalDate fechaEncuentro;

  public MascotaEncontrada(List<Foto> fotos, String descripcionEstadoActual, Ubicacion ubicacion){

    if(fotos == null || fotos.isEmpty()){
      throw new MascotaEncontradaInvalidaException("Falta ingresar al menos una foto de la mascota encontrada");
    }
    this.fotos = fotos;
    this.descripcionEstadoActual = descripcionEstadoActual;
    this.ubicacion = ubicacion;
  }



  public LocalDate getFechaEncuentro() {
    return fechaEncuentro;
  }
}
