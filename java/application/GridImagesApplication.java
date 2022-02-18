package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GridImagesApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GridImagesApplication.class.getResource("grid-images-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 400);
        stage.setScene(scene);
        stage.setTitle("Four images in a grid pane");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
