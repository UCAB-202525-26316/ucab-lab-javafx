package ve.edu.ucab.lab.javafx;

import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX que configura y lanza la interfaz gráfica.
 */
public class App extends Application {

  /** Escena principal de la aplicación. */
  private static Scene scene;

  /**
   * Inicia la aplicación JavaFX configurando la ventana principal y cargando el archivo FXML inicial.
   *
   * @param stage la ventana principal de la aplicación
   * @throws IOException si ocurre un error al cargar el archivo FXML
   */
  @Override
  public void start(Stage stage) throws IOException {
    Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());
    scene = new Scene(loadFXML("/primary.fxml"));
    stage.setScene(scene);
    stage.show();
  }

  /**
   * Cambia la raíz de la escena actual por un nuevo archivo FXML.
   *
   * @param fxml la ruta del archivo FXML a cargar
   * @throws IOException si ocurre un error al cargar el archivo FXML
   */
  static void setRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));
  }

  /**
   * Carga un archivo FXML y retorna su nodo raíz.
   *
   * @param fxml la ruta del archivo FXML a cargar
   * @return el nodo raíz del archivo FXML cargado
   * @throws IOException si ocurre un error al cargar el archivo FXML
   */
  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml));
    return fxmlLoader.load();
  }

  /**
   * Punto de entrada principal que inicia la aplicación JavaFX.
   *
   * @param args argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    launch();
  }
}
