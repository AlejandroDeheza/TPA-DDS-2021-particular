package excepciones;

public class PersonaInvalidaException extends RuntimeException {
  public PersonaInvalidaException(String s) {
    super("Los datos no se pueden ingresar porque: " + s);
  }
}
