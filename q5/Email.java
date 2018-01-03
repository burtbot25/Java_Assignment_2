package q5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <p>This class sets up the primary stage for the E-mail Pane and
 * launches the E-mail Pane class.</p>
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class Email extends Application {

    /**
     * Launches the email application.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        final int appWidth = 700;
        final int appHeight = 500;
        
        /**
         * Creates a new scene to host the e-mail pane.
         */
        Scene scene = new Scene(new EmailPane(), appWidth, appHeight);
        
        /**
         * Sets primary stage's title.
         */
        primaryStage.setTitle("Email");
        
        /**
         * Sets primary stage's scene.
         */
        primaryStage.setScene(scene);
        
        /**
         * Shows primary stage.
         */
        primaryStage.show();
    }

    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
