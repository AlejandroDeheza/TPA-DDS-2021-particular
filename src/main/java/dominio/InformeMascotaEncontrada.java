package dominio;

import excepciones.InformeMascotaEncontradaInvalidaException;

import java.time.LocalDate;
import java.util.List;

public class InformeMascotaEncontrada {

  private DuenioMascota duenioMascota;   //suponiendo que en el QR de la chapita esta este dato
                                          // asi el voluntario sabe a quien avisar mirando el informe
  private List<Foto> fotos;
  private String descripcionEstadoActual;
  private Ubicacion lugarDeEncuentro;
  private Persona rescatista;
  private String direccionRescatista;
  private LocalDate fechaDeEncuentro;

  public InformeMascotaEncontrada(DuenioMascota duenioMascota, List<Foto> fotos, String descripcionEstadoActual,
                                  Ubicacion lugarDeEncuentro, Persona rescatista, String direccionRescatista,
                                  LocalDate fechaDeEncuentro){

    this.validarInforme(fotos);

    this.duenioMascota = duenioMascota;
    this.fotos = fotos;
    this.descripcionEstadoActual = descripcionEstadoActual;
    this.lugarDeEncuentro = lugarDeEncuentro;
    this.rescatista = rescatista;
    this.direccionRescatista = direccionRescatista;
    this.fechaDeEncuentro = fechaDeEncuentro;

    this.agregarInformeAlRepositorio();
  }


  private void validarInforme(List<Foto> fotos) {
    if(fotos == null || fotos.isEmpty()){
      throw new InformeMascotaEncontradaInvalidaException("Falta ingresar al menos una foto de la mascota encontrada");
    }
  }

  private void agregarInformeAlRepositorio() {
    new RepositorioInformesMascotasEncontradas().agregarInforme(this);
  }

  public LocalDate getFechaDeEncuentro() {
    return fechaDeEncuentro;
  }
}
