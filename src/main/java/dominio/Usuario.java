package dominio;

public abstract class Usuario {

  private String usuario;
  private String contrasenia;

  public Usuario(String usuario, String contrasenia){

    this.validarContrasenia(contrasenia);
    this.usuario = usuario;
    this.contrasenia = contrasenia;
  }

  private void validarContrasenia(String contrasenia){
    ValidadorContraseniasComunes validador = new ValidadorContraseniasComunes();
    validador.validar(contrasenia);
  }
}
