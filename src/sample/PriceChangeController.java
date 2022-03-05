package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PriceChangeController implements Initializable {


    @FXML
    private AnchorPane panel;

    @FXML
    private ComboBox<String> combo;

    @FXML
    private JFXTextField newPriceTxt;

    @FXML
    private Button updateBtn;

    @FXML
    private Button seenowBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Button mainMenuBtn;

    //exit button
    Stage stage;

    public void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("");
        alert.setContentText("Do you want to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) panel.getScene().getWindow();
            //System.out.println("successful");
            stage.close();
        }
    }

    //go to paddy price details page
    Stage stages = new Stage();

    public void seeNow(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PricedetailsController.fxml"));
        stages.initStyle(StageStyle.TRANSPARENT);
        stages.setTitle("RAD");
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stages.setScene(scene);
        stages.show();

        seenowBtn.getScene().getWindow().hide();


    }

    //clear button
    public void Clear(ActionEvent actionEvent) {
        combo.setValue(" ");
        newPriceTxt.clear();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        combo.getItems().add("Rathu Kakulu");
        combo.getItems().add("Sudu Kakulu");
        combo.getItems().add("Nadu");
        combo.setPromptText("Choose One");

    }

    //go to main menu page
    Stage stag = new Stage();

    public void main(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainPageController.fxml"));
        stag.initStyle(StageStyle.TRANSPARENT);
        stag.setTitle("RAD");
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stag.setScene(scene);
        stag.show();

        mainMenuBtn.getScene().getWindow().hide();


    }
}



