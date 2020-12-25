package Controllers;

import Scene.MainScene;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreditsSceneController implements Initializable {
    @FXML
    public AnchorPane main_pane, commonUI;
    @FXML
    public Button back_btn;
    @FXML
    public GridPane players_grid;
    @FXML
    public Text player1_txt, player2_txt, player3_txt, player4_txt;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    public void backClicked() throws IOException {
        MainScene mainScene = new MainScene();
    }
}