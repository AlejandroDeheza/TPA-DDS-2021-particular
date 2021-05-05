package dominio;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioInformesMascotasEncontradas {

  private List<InformeMascotaEncontrada> informesMascotasEncontradas;



  public List<InformeMascotaEncontrada> ListarMascotasEncontradasEnUltimos10Dias(){
    return ListarMascotasEncontradasEnUltimosDias(10);
  }

  private List<InformeMascotaEncontrada> ListarMascotasEncontradasEnUltimosDias(Integer dias){
    return this.informesMascotasEncontradas.stream().filter(
        mascota -> mascota.getFechaDeEncuentro().isAfter(LocalDate.now().minusDays(dias))
    ).collect(Collectors.toList());
  }


  public void agregarInforme(InformeMascotaEncontrada informeAProcesar){
    this.informesMascotasEncontradas.add(informeAProcesar);
  }

  public void eliminarInforme(InformeMascotaEncontrada informeAProcesar){
    this.informesMascotasEncontradas.remove(informeAProcesar);
  }
}
