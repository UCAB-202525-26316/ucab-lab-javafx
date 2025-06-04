package ve.edu.ucab.lab.javafx;

import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Controlador para la interfaz secundaria de la aplicación JavaFX.
 */
public class SecondaryController {

  /**
   * Cambia la escena actual a la interfaz primaria cargando el archivo FXML correspondiente.
   *
   * @throws IOException si ocurre un error al cargar el archivo FXML
   */
  @FXML
  public void switchToPrimary() throws IOException {
    App.setRoot("/primary.fxml");
  }
}
