package Controllers;

import Main.Main;
import Scene.MainScene;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SettingsSceneController implements Initializable {
    @FXML
    public Slider sound_slider;
    @FXML
    public AnchorPane commonUI, main_pane;
    @FXML
    public Text sound_txt;
    @FXML
    public Button back_btn;
    @FXML
    public Pane menu_pane;

    @FXML
    public void backClicked() throws IOException {
        MainScene mainScene = new MainScene();
    }

    public void initialize(URL location, ResourceBundle resources) {
        sound_slider.setValue(Main.mediaPlayer.getVolume() * 100);
        sound_slider.valueProperty().addListener(observable -> Main.mediaPlayer.setVolume(sound_slider.getValue() / 100));
    }
}