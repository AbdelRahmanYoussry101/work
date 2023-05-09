import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");

        pane.getChildren().add(text);
        text.setOnKeyPressed(event -> {
            switch (event.getCode()){
                case DOWN: text.setY(text.getY() + 10);
                    break;
                case UP: text.setY(text.getY() - 10);
                    break;
                case LEFT: text.setX(text.getX() - 10);
                    break;
                case RIGHT: text.setX(text.getX() + 10);
                    break;
                default:
                    if(event.getText().length() > 0)
                        text.setText(event.getText());
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("KeyEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

        text.requestFocus();
    }
}
