package ve.edu.ucab.lab.javafx;

import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Controlador para la interfaz primaria de la aplicación JavaFX.
 */
public class PrimaryController {

  /**
   * Cambia la escena actual a la interfaz secundaria cargando el archivo FXML correspondiente.
   *
   * @throws IOException si ocurre un error al cargar el archivo FXML
   */
  @FXML
  public void switchToSecondary() throws IOException {
    App.setRoot("/secondary.fxml");
  }
}
