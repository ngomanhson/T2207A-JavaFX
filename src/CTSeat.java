import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CTSeat implements Initializable {

    public Button seatA1;
    public Button seatA2;
    public Button seatA3;
    public Button seatA4;
    public Button seatA5;
    public Button seatA6;
    public Button seatA7;
    public Button seatA8;
    public Button seatA9;
    public Button seatA10;
    public Button seatB1;
    public Button seatB2;
    public Button seatB3;
    public Button seatB4;
    public Button seatB5;
    public Button seatB6;
    public Button seatB7;
    public Button seatB8;
    public Button seatB9;
    public Button seatB10;
    public Button seatC1;
    public Button seatC2;
    public Button seatC3;
    public Button seatC4;
    public Button seatC5;
    public Button seatC6;
    public Button seatC7;
    public Button seatC8;
    public Button seatC9;
    public Button seatC10;
    public Button seatD1;
    public Button seatD2;
    public Button seatD3;
    public Button seatD4;
    public Button seatD5;
    public Button seatD6;
    public Button seatD7;
    public Button seatD8;
    public Button seatD9;
    public Button seatD10;
    public Button seatE1;
    public Button seatE2;
    public Button seatE3;
    public Button seatE4;
    public Button seatE5;
    public Button seatE6;
    public Button seatE8;
    public Button seatE7;
    public Button seatE9;
    public Button seatE10;
    public Button seatF1;
    public Button seatF2;
    public Button seatF3;
    public Button seatF4;
    public Button seatF5;
    public Button seatF6;
    public Button seatF7;
    public Button seatF8;
    public Button seatF9;
    public Button seatF10;
    public Button seatG1;
    public Button seatG2;
    public Button seatG3;
    public Button seatG4;
    public Button seatG5;
    public Button seatG6;
    public Button seatG7;
    public Button seatG8;
    public Button seatG9;
    public Button seatG10;
    public Button seatH1;
    public Button seatH2;
    public Button seatH3;
    public Button seatH4;
    public Button seatH5;
    public Button seatH6;
    public Button seatH7;
    public Button seatH8;
    public Button seatH9;
    public Button seatH10;
    public Button seatI1;
    public Button seatI2;
    public Button seatI3;

    @FXML
    public void onSeatClick(ActionEvent event) {
        Button seatButton = (Button) event.getSource();
        String seatName = seatButton.getText();
        seatButton.setDisable(true);

        Button seat = (Button) event.getSource();
//        System.out.println("Seat " + seat.getText() + " has been selected successfully");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setHeaderText("Here is the announcement");
        alert.setContentText("Choose a successful seat "+seat.getText());
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
