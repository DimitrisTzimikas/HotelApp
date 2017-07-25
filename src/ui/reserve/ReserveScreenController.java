package ui.reserve;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import ui.alertbox.AlertBox;
import ui.main.Main;

import java.io.IOException;
import java.time.LocalDate;

public class ReserveScreenController {

    @FXML
    private Button roomDetails;

    @FXML
    private Button submit;

    @FXML
    private DatePicker dateFrom;

    @FXML
    private DatePicker dateTo;

    @FXML
    void roomDetailsAction(ActionEvent event) throws IOException {
        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomdetails/RoomDetailsScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();
    }


    public void submitAction(ActionEvent actionEvent) throws IOException{

        LocalDate from = dateFrom.getValue();
        LocalDate to = dateTo.getValue();

        if(from.getDayOfMonth()==to.getDayOfMonth() && from.getDayOfYear()==to.getDayOfYear()) {
            AlertBox.display("You can't reserve the rooms of this hotel for one day");
        }

        if(!(from == null || to == null) && (from.getDayOfYear()<= to.getDayOfYear()) && (from.getYear()<=to.getYear())
                && !(from.getDayOfMonth()==to.getDayOfMonth() && from.getDayOfYear()==to.getDayOfYear())) {

            AlertBox.display("You successfully reserve the room number " + Main.room + " of " + Main.floor + " floor");

            Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/main/LogInScreen.fxml")));
            Scene logInPageScene = new Scene(logInPageParent);
            Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            appStage.setScene(logInPageScene);
            appStage.show();
        }
        else if (from.getYear()<to.getYear()){
            AlertBox.display("You successfully reserve the room number " + Main.room + " of " + Main.floor + " floor");

            Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/main/LogInScreen.fxml")));
            Scene logInPageScene = new Scene(logInPageParent);
            Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            appStage.setScene(logInPageScene);
            appStage.show();
        }
        else
            AlertBox.display("You must enter a valid date");
    }
}