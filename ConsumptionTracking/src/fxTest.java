import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
public class fxTest extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Group group = new Group();

    Circle red = new Circle(100,200,20,Color.RED);

    //red.setFill(Color.TRANSPARENT);

    red.setStroke(Color.BLACK);
    red.setStrokeWidth(5);
    group.getChildren().add(red);

    StackPane stack = new StackPane();
    stack.getChildren().addAll(red);
    StackPane.setAlignment(red, Pos.TOP_LEFT);

    Scene scene = new Scene(stack, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
