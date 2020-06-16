package main;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;
import main.sprites.Player;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Line");
//        Pane layout = new Pane();
//
//        Line line1 = new Line(200,50,1000,50);
//
//        Scene scene = new Scene(layout,1900,1060);
//        scene.getWindow();
//        scene.getHeight();
//        scene.getWidth();
//        layout.getChildren().addAll(line1);
//        primaryStage.setScene(scene);
//        primaryStage.show();





        Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        //set Stage boundaries to visible bounds of the main screen
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());

        Line line1 = new Line(0,primaryScreenBounds.getHeight()/1.4,
                primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight()/1.4);
        line1.setStrokeWidth(5);
        line1.setStroke(Color.web("#535353"));

        ImageView image1 = new ImageView("resources/sprites/minion/0.png");
        image1.setX(0);
        image1.setY(primaryScreenBounds.getHeight()/1.8);

        Player test = new Player();
//        test.move();

        root.getChildren().addAll(line1, image1);
        stage.show();





















//        theStage.setTitle( "Timeline Example" );
//
//        Group root = new Group();
//        Scene theScene = new Scene( root );
//        theStage.setScene( theScene );
//
//        Canvas canvas = new Canvas( 512, 512 );
//        root.getChildren().add( canvas );
//
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//
//        Image earth = new Image( "resources/main.sprites/minion/0.png" );
//        Image sun   = new Image( "resources/main.sprites/minion/5.png" );
//        Image space = new Image( "resources/main.sprites/minion/10.png" );
//
//        final long startNanoTime = System.nanoTime();
//
//
//        new AnimationTimer()
//        {
//            int xy = 0;
//            public void handle(long currentNanoTime)
//            {
//                    System.out.println(currentNanoTime);
//                    double t = (currentNanoTime - startNanoTime) / 1000000000.0;
//
//                    double x = 232 + 128 * Math.cos(t);
//                    double y = 232 + 128 * Math.sin(t);
//
//                    // background image clears canvas
//                    gc.drawImage(space, 0, 0);
//                    gc.drawImage(earth, x, y);
//                    gc.drawImage(sun, 196, 196);
//
//
//            }
//        }.start();
//
//        theStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
