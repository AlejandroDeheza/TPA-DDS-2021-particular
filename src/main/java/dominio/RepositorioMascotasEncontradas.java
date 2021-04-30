package dominio;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioMascotasEncontradas {

  private List<MascotaEncontrada> mascotasEncontradas;

  private List<MascotaEncontrada> ListarMascotasEncontradasEnUltimosDias(Integer dias){
    return this.mascotasEncontradas.stream().filter(
        mascota -> mascota.getFechaEncuentro().isAfter(LocalDate.now().minusDays(dias))
    ).collect(Collectors.toList());
  }

  public List<MascotaEncontrada> ListarMascotasEncontradasEnUltimos10Dias(){
    return ListarMascotasEncontradasEnUltimosDias(10);
  }
}
