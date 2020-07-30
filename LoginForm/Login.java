package Archive.LoginForm;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Login extends Application {
    private Boolean isloggedin = false;
    private Stage login_Stage = new Stage();
    @FXML
    private TextField nameInput ;

    @FXML
    private PasswordField passwordInput ;


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginGUI.fxml"));
        Scene loginScene = new Scene(root);
        login_Stage.setScene(loginScene);
        login_Stage.show();
    }

    public void exit(){
        System.exit(0);
    }

    public void login() throws Exception{
        Parent optionsParent = FXMLLoader.load(getClass().getResource("OptionsGUI.fxml"));

        Scene optionsScene = new Scene(optionsParent);
        Stage options_Stage = new Stage();
        options_Stage.setScene(optionsScene);

        File accounts = new File("E:\\Java\\WIP\\src\\Draft\\LoginForm\\Accounts.txt");
        Scanner scanner = new Scanner(accounts);
        while (scanner.hasNext()){
            if (nameInput.getText().equals(scanner.next())){
                String userInput=passwordInput.getText();
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(userInput.getBytes());
                BigInteger number = new BigInteger(1, messageDigest);
                String hashedText = number.toString(16);
                if (scanner.next().equals(hashedText)){
                    isloggedin = true;
                }
            }
        }

        if (isloggedin){
            options_Stage.show();
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login Failed");
            alert.setHeaderText("Wrong Username Or Password");
            alert.setContentText("Try Again");
            alert.showAndWait();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}