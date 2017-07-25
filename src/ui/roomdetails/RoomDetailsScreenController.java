package ui.roomdetails;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ui.main.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RoomDetailsScreenController implements Initializable{


    @FXML
    private Button roomScreen;

    @FXML
    private Button reserve;

    @FXML
    private  TextArea utilities;


    @FXML
    private  Text photos;

    @FXML
    private  Text availability;

    @FXML
    private  Text stars;

    @FXML
    private Text hostsNumber;


    @FXML
    private Button photosButton;

    @FXML
    void photosButtonAction(ActionEvent event) throws IOException {

        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomdetails/PhotosScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        availability.setText("Available");
        photos.setText("This room don't have photos");
        stars.setText("***");
        utilities.setText("blah blah blah blah blah");
        hostsNumber.setText("3");
    }

    @FXML
    void reserveAction(ActionEvent event) throws IOException  {
        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/reserve/ReserveScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();
    }

    @FXML
    void roomScreenAction(ActionEvent event) throws IOException {
        if(Main.floor.equals("fourth")) {
            Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomselection/FourthFloorScreen.fxml")));
            Scene logInPageScene = new Scene(logInPageParent);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(logInPageScene);
            appStage.show();
        }
        else if(Main.floor.equals("zero")) {
            Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomselection/ZeroFloorScreen.fxml")));
            Scene logInPageScene = new Scene(logInPageParent);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(logInPageScene);
            appStage.show();
        }
        else {
            Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomselection/RoomsScreen.fxml")));
            Scene logInPageScene = new Scene(logInPageParent);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(logInPageScene);
            appStage.show();
        }
    }

}
