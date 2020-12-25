package Controllers;

import Scene.CreditsScene;
import Scene.GameScene;
import Scene.HowToPlayScene;
import Scene.SettingScene;
import StorageRelatedClasses.Player;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {
    @FXML
    public VBox nicknames_vbox;
    @FXML
    public TextField nickname1_tf, nickname2_tf, nickname3_tf, nickname4_tf;
    @FXML
    public Button newGame_btn, settings_btn, credits_btn, howToPlay_btn, exit_btn;
    @FXML
    public Label info_lbl;
    @FXML
    public AnchorPane main_pane, commonUI;
    @FXML
    public VBox menu_vbox;

    ArrayList<Player> players;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void newGameClicked() throws Exception {
        players = new ArrayList<>();
        if (!nickname1_tf.getText().equals(""))
            players.add(new Player(nickname1_tf.getText()));
        if (!nickname2_tf.getText().equals(""))
            players.add(new Player(nickname2_tf.getText()));
        if (!nickname3_tf.getText().equals(""))
            players.add(new Player(nickname3_tf.getText()));
        if (!nickname4_tf.getText().equals(""))
            players.add(new Player(nickname4_tf.getText()));

        for (Player p : players) {
            for (Player p2 : players) {
                if (p != p2 && p.getNickname().equals(p2.getNickname())) {
                    info_lbl.setText("Nicknames must be unique for each player!");
                    return;
                }
            }
        }

        if (players.size() < 2) {
            info_lbl.setText("Minimum 2 players!");
        } else {
            GameScene gameScene = GameScene.getInstance(players);
        }
    }

    @FXML
    private void settingsClicked() throws Exception {
        SettingScene settingScene = new SettingScene();
    }

    @FXML
    private void creditsClicked() throws Exception {
        CreditsScene creditsScene = new CreditsScene();
    }

    @FXML
    private void howToPlayClicked() throws Exception {
        HowToPlayScene howToPlayScene = new HowToPlayScene();
    }

    @FXML
    private void exitClicked() {
        System.exit(0);
    }
}