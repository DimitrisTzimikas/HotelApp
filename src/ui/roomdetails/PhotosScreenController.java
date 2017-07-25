package ui.roomdetails;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PhotosScreenController {



    @FXML
    void backButtonAction(ActionEvent event) throws IOException {

        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/roomdetails/PhotosScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();

    }


}
