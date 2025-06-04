package ve.edu.ucab.lab.javafx;

/**
 * Clase utilitaria que sirve como punto de entrada para la aplicación JavaFX.
 * No debe ser instanciada.
 */
public final class Launcher {

  /**
   * Constructor privado para prevenir la instanciación de la clase.
   *
   * @throws UnsupportedOperationException si se intenta crear una instancia
   */
  private Launcher() {
    throw new UnsupportedOperationException("Utility class, cannot be instantiated");
  }

  /**
   * Método principal que inicia la aplicación delegando la ejecución a la clase App.
   *
   * @param args argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    App.main(args);
  }
}
