package Controllers;

import Scene.MainScene;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HowToPlayController implements Initializable {
    @FXML
    public AnchorPane main_pane, commonUI;
    @FXML
    public Button back_btn;
    @FXML
    public Pane howToPlay_pane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    public void backClicked() throws IOException {
        MainScene mainScene = new MainScene();
    }
}