package ui.register;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ui.main.Main;
import ui.main.UsersDetails;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterScreenController implements Initializable{

    @FXML
    private Button mainScreenButton;

    @FXML
    private TextField email;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    public Button registerButton;

    private static final String EMAIL_ERROR = "Invalid e-mail";

    public void registerButtonAction(ActionEvent actionEvent) throws IOException  {

        boolean userExistFlag = false;

        for (UsersDetails usersDetails : Main.usersArrayList) {
            if (username.getText().equals(usersDetails.getUsername()) || email.getText().equals(usersDetails.getEmail())) {
                userExistFlag = true;
                if(username.getText().equals(usersDetails.getUsername())) {
                    ui.alertbox.AlertBox.display("This username already exists");
                }
                else
                ui.alertbox.AlertBox.display("This e-mail already exists");
            }
        }

        //If the values does not exists in database it checks if the
        //e-mail is valid and then it creates the user, otherwise it prints error
        if (!userExistFlag)
            if(!password.getText().equals("") && !username.getText().equals("") && ( email.getText().endsWith("@uom.edu.gr") || email.getText().endsWith("@hotmail.com")|| email.getText().endsWith("@yahoo.com") || email.getText().endsWith("@gmail.com") || email.getText().endsWith("@hotmail.gr") || email.getText().endsWith("@yahoo.gr") || email.getText().endsWith("@gmail.gr")) ) {
                Main.usersArrayList.add(new UsersDetails(email.getText(), username.getText(), password.getText()));
                ui.alertbox.AlertBox.display("Your registration was successfully");

                FileOutputStream fout = new FileOutputStream("Hotel_2/src/resources/hotel.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fout);
                oos.writeObject(Main.usersArrayList);

                Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/floorselection/FloorScreen.fxml")));
                Scene logInPageScene = new Scene(logInPageParent);
                Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                appStage.setScene(logInPageScene);
                appStage.show();
            }
            else if(username.getText().equals("")) {
                ui.alertbox.AlertBox.display("You must enter a username");
            }
            else if(password.getText().equals("")){
                ui.alertbox.AlertBox.display("You must enter a password");
            }
            else {
                ui.alertbox.AlertBox.display(EMAIL_ERROR);
            }
    }

    public void mainScreenButtonAction(ActionEvent actionEvent) throws IOException {
        Parent logInPageParent = FXMLLoader.load(getClass().getResource(("/ui/main/LogInScreen.fxml")));
        Scene logInPageScene = new Scene(logInPageParent);
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(logInPageScene);
        appStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
