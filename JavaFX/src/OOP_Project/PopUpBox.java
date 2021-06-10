package OOP_Project;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class PopUpBox {

    public void information(String title, String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.setHeaderText(null);
        alert.showAndWait();
    }
    public void waring(String title, String message){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(message);
        //alert.setHeaderText("this is header");
        alert.setHeaderText(null);
        alert.showAndWait();
    }
    public void error(String title, String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.setHeaderText(null);
        //alert.setHeaderText("this is header");
        alert.showAndWait();
    }
    public String confirmation(String title, String message){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        //alert.initModality(Modality.WINDOW_MODAL);
        alert.setTitle(title);
        alert.setHeaderText(null);
        //alert.setHeaderText("this is header");
        alert.setContentText(message);

        /*
        Optional<ButtonType> result = alert.showAndWait();

        if(result.get().equals(ButtonType.OK) ){
            System.out.println("Logged Out");

        }
        else if(result.get().equals(ButtonType.CANCEL) ){
            System.out.println("Still logged in");

        }*/

        ButtonType yesButtonType = new ButtonType("YES");
        ButtonType noButtonType = new ButtonType("NO");


        alert.getButtonTypes().setAll(yesButtonType,noButtonType);


        Optional<ButtonType> confirm = alert.showAndWait();
        if(confirm.get() == yesButtonType){
            return "yes";
        }
        else if(confirm.get() == noButtonType){
            return "no";
        }
        return "no";

    }

}
