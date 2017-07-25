package ui.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<UsersDetails> usersArrayList = new ArrayList<>();
    public static Boolean isSplashLoaded = false;
    public static String floor;
    public static String room;
    public static ArrayList<Rooms> roomDetailsArrayList = new ArrayList<>();
    public static String utilities = "This room provides one room with a big bed, a toilet and a refrigerator";
    public static Rooms floorZeroRoomOne = new Rooms("zero", "one",true, utilities, true, 3);
    public static Rooms floorZeroRoomTwo = new Rooms("zero", "two",true, utilities, true, 3);
    public static Rooms floorOneToThreeRoomOne = new Rooms("first", "one",true, utilities, true, 4);
    public static Rooms floorFourRoomOne = new Rooms("fourth", "one",true, utilities, true, 5);

    @Override
    public void start(Stage stage) throws Exception {

        Parent rootPanel = FXMLLoader.load(getClass().getResource("LogInScreen.fxml"));

        Scene scene = new Scene(rootPanel, 500, 350);

        stage.setScene(scene);
        stage.sizeToScene();
        stage.getIcons().add(new Image("/resources/hotel.png"));
        stage.setTitle("My Hotel");
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*

        FileInputStream fileInputStream     = new FileInputStream("Hotel_2/src/resources/hotel.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        usersArrayList = (ArrayList<UsersDetails>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        for(UsersDetails u: usersArrayList) {
            System.out.println(u.getEmail() + " " + u.getUsername()  + " " + u.getPassword());
        }
*/

        launch(args);
    }
}
