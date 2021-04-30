package excepciones;

public class PersonaInvalidaException extends RuntimeException {
  public PersonaInvalidaException(String s) {
    super("La persona es invalida porque: " + s);
  }
}
