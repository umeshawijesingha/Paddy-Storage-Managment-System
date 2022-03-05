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

public class StorageUpdateController implements Initializable {

    @FXML
    private AnchorPane panel;

    @FXML
    private ComboBox<String> combo;

    @FXML
    private JFXTextField paddyAmountTxt;

    @FXML
    private Button updateBtn;

    @FXML
    private Button seenowBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Button clrBtn;

    @FXML
    private JFXTextField memberNICtxt;

    @FXML
    private JFXTextField PriceperTxt1;

    @FXML
    private JFXTextField totalPriceTxt;

    @FXML
    private Button calculateBtn;

    @FXML
    private Button mainMenuBtn;

    //clear button
    public void Clear(ActionEvent actionEvent) {
        combo.setValue(" ");
        memberNICtxt.clear();
        paddyAmountTxt.clear();
        totalPriceTxt.clear();
        PriceperTxt1.clear();
    }




    // to go storage page
    Stage stag = new Stage();
    public void seenow(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StorageController.fxml"));
        stag.initStyle(StageStyle.TRANSPARENT);
        stag.setTitle("RAD");
        Scene scene= new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stag.setScene(scene);
        stag.show();

        seenowBtn.getScene().getWindow().hide();

    }

    //exit button
    Stage stage;
    public void logout(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("");
        alert.setContentText("Do you want to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) panel.getScene().getWindow();
            //System.out.println("successful");
            stage.close();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            combo.getItems().add("Rathu Kakulu");
            combo.getItems().add("Sudu Kakulu");
            combo.getItems().add("Nadu");
            combo.setPromptText("Choose One");

        }

    //go to main menu page
    Stage stages = new Stage();

    public void main(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainPageController.fxml"));
        stages.initStyle(StageStyle.TRANSPARENT);
        stages.setTitle("RAD");
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stages.setScene(scene);
        stages.show();

        mainMenuBtn.getScene().getWindow().hide();


    }
    }

