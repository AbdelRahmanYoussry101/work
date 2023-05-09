import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage primaryStage) {
        // Hold two buttons in an HBox
        HBox hBox = new HBox(10);
//        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btnEnlarge = new Button("Enlarge");
        Button btnShrink = new Button("Shrink");
        hBox.getChildren().addAll(btnEnlarge, btnShrink);

        // Create and register the handler
//        btnEnlarge.setOnAction(new EnlargeHandler());
//        btnShrink.setOnAction(new ShrinkHandler());

        //Anonymous inner class
//        btnEnlarge.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                circlePane.enlarge();
//            }
//        });
//        btnShrink.setOnAction(new EventHandler<ActionEvent>() {
//           @Override
//            public void handle(ActionEvent event){
//               circlePane.shrink();
//           }
//        });


        // Lambda expression
        btnEnlarge.setOnAction((event -> {
            circlePane.enlarge();
        }));

        btnShrink.setOnAction((event -> {
            circlePane.shrink();
        }));


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    class EnlargeHandler implements EventHandler<ActionEvent>{
//        @Override
//        public void handle(ActionEvent event) {
//            circlePane.enlarge();
//        }
//    }
}


class CirclePane extends StackPane{
    private Circle circle = new Circle(50);

    public CirclePane(){
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    public void enlarge(){

        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink(){
        circle.setRadius(
                circle.getRadius() > 2 ?
                            circle.getRadius() - 2
                            : circle.getRadius()
        );
    }
}
