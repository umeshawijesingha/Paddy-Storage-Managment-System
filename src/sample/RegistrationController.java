package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RegistrationController {


    @FXML
    private AnchorPane scenePanel1;

    @FXML
    private JFXTextField firstnameTxt;

    @FXML
    private JFXTextField nicTxt;

    @FXML
    private JFXTextArea addressTxt;

    @FXML
    private JFXTextField contactTxt;

    @FXML
    private Button backBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private JFXTextField lastnametxt;

//clear button
    public void clear(ActionEvent actionEvent) {
        firstnameTxt.clear();
        lastnametxt.clear();
        addressTxt.clear();
        contactTxt.clear();
        nicTxt.clear();

    }

    //exit button
    Stage stage;
    public void logout(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("");
        alert.setContentText("Do you want to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePanel1.getScene().getWindow();
            //System.out.println("successful");
            stage.close();
        }
    }

    //back button
    Stage stages = new Stage();
    public void join(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stages.initStyle(StageStyle.TRANSPARENT);
        stages.setTitle("RAD");
        Scene scene= new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stages.setScene(scene);
        stages.show();

        backBtn.getScene().getWindow().hide();


    }


    //go to storage update form
    Stage stag = new Stage();
    public void storage(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StorageUpdateController.fxml"));
        stag.initStyle(StageStyle.TRANSPARENT);
        stag.setTitle("RAD");
        Scene scene= new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stag.setScene(scene);
        stag.show();

      registerBtn.getScene().getWindow().hide();


    }


    @FXML
    void initialize() {

}

}
