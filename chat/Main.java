import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Defining a layout for the objects
        VBox vb = new VBox();
        TextArea ta = new TextArea("Hello, World!!");
        TextField tf = new TextField("Hello There!!");
        primaryStage.setResizable(false);
        // Using the defined objects and manupulating them
        vb.setPadding(new Insets(10));
        vb.setSpacing(3);
        ta.setEditable(false);
        ta.setFont(new Font(20));
        ta.setFocusTraversable(true);
        ta.setWrapText(true);
        tf.setFont(new Font(18));
        tf.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent event) {
                ;
                if(event.getCode() == KeyCode.ENTER)
                {
                    ta.appendText("\n"+tf.getText());
                    tf.clear();
                }
            }

        });

        // adding them to the scene
        vb.getChildren().addAll(ta, tf);
        Scene s = new Scene(vb);
        primaryStage.setScene(s);
        primaryStage.setTitle("A Simple Message!!");
        primaryStage.show();
    }
}
