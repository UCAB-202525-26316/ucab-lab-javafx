package ve.edu.ucab.lab.javafx;

import javafx.fxml.FXML;

import java.io.IOException;

public class SecondaryController {

  @FXML
  private void switchToPrimary() throws IOException {
    App.setRoot("/primary.fxml");
  }
}
