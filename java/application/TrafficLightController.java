package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TrafficLightController {

    @FXML
    private Circle RedLight;

    @FXML
    private Circle YellowLight;

    @FXML
    private Circle GreenLight;

    @FXML
    private ToggleGroup LightChoice;

    @FXML
    void OnRedRadioClick(ActionEvent event) {
        // Turn on red light and turn off others
        RedLight.setFill(Color.RED);
        YellowLight.setFill(Color.DIMGRAY);
        GreenLight.setFill(Color.DIMGRAY);
    }

    @FXML
    void OnYellowRadioClick(ActionEvent event) {
        // Turn on yellow light and turn off others
        RedLight.setFill(Color.DIMGRAY);
        YellowLight.setFill(Color.YELLOW);
        GreenLight.setFill(Color.DIMGRAY);
    }

    @FXML
    void OnGreenRadioClick(ActionEvent event) {
        // Turn on green light and turn off others
        RedLight.setFill(Color.DIMGRAY);
        YellowLight.setFill(Color.DIMGRAY);
        GreenLight.setFill(Color.LIMEGREEN);
    }
}
