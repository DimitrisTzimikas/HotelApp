package ui.roomselection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import ui.main.Main;

import java.io.IOException;

public class ZeroFloorScreenController {

    @FXML
    private Button floorButton;

    @FXML
    private Button room1;

    @FXML
    private Button room2;

    @FXML
    private Button room3;

    @FXML
    void floorButtonAction(ActionEvent event) throws IOException {
        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/floorselection/FloorScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();
    }

    @FXML
    void one(ActionEvent event) throws IOException {
        Main.room = "one";

        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomdetails/RoomDetailsScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();
    }

    @FXML
    void two(ActionEvent event) throws IOException {
        Main.room = "two";

        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomdetails/RoomDetailsScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();
    }

    @FXML
    void three(ActionEvent event) throws IOException {
        Main.room = "three";

        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomdetails/RoomDetailsScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();
    }
}
