package dominio;

import java.util.List;

public class Voluntario extends Usuario{

  public Voluntario(String usuario, String contrasenia){
    super(usuario, contrasenia);
  }

  public List<InformeMascotaEncontrada> obtenerInformesMascotasEncontradasDeUltimos10Dias(){
    return new RepositorioInformesMascotasEncontradas().ListarMascotasEncontradasEnUltimos10Dias();
  }

  public void confirmarAvisoAlDuenio(InformeMascotaEncontrada informeAProcesar){
    new RepositorioInformesMascotasEncontradas().eliminarInforme(informeAProcesar);
  }
}
