package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainPageController {

    @FXML
    private AnchorPane mainPanel;

    @FXML
    private Button pricedetailsBtn;

    @FXML
    private Button storagedetailsBtn;

    @FXML
    private Button memberdetailsBtn;

    //go to paddy price details page
    Stage stages = new Stage();
    public void price(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PricedetailsController.fxml"));
        stages.initStyle(StageStyle.TRANSPARENT);
        stages.setTitle("RAD");
        Scene scene= new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stages.setScene(scene);
        stages.show();

        pricedetailsBtn.getScene().getWindow().hide();


    }

    //go to member details page
    Stage stage = new Stage();
    public void member(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MemberDetailsController.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("RAD");
        Scene scene= new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();

        pricedetailsBtn.getScene().getWindow().hide();


    }

    //go to member details page
    Stage stag = new Stage();
    public void storage(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StorageController.fxml"));
        stag.initStyle(StageStyle.TRANSPARENT);
        stag.setTitle("RAD");
        Scene scene= new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stag.setScene(scene);
        stag.show();

        storagedetailsBtn.getScene().getWindow().hide();


    }

}
