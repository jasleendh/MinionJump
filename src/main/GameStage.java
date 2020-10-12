package main;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;
import main.sprites.Player;

public class GameStage {
private Player player;
private boolean space;
    public GameStage(Stage x, ImageView viewPlayerImg, ImageView viewCactusImg,
                     ImageView viewCloudImg) throws Exception {

    }

    public void setTrue(){
        space = true;
    }

    public void setFalse(){
        space = false;
    }

    public void start(Stage stage, ImageView viewPlayerImg, ImageView viewCactusImg,
                      ImageView viewCactusImg2, ImageView viewCactusImg3,
                      ImageView viewCloudImg1, ImageView viewCloudImg2, ImageView viewCloudImg3,
                      ImageView viewCloudImg4, ImageView viewCloudImg5, boolean space) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        //set Stage boundaries to visible bounds of the main screen
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());

        Line line1 = new Line(0, primaryScreenBounds.getHeight() / 1.4,
                primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight() / 1.4);
        line1.setStrokeWidth(4);
        line1.setStroke(Color.web("#535353"));

        viewPlayerImg.setX(0);
        viewPlayerImg.setY(primaryScreenBounds.getHeight() / 1.8);


        root.getChildren().addAll(line1, viewPlayerImg, viewCactusImg, viewCactusImg2,
                viewCactusImg3, viewCloudImg1, viewCloudImg2, viewCloudImg3, viewCloudImg4,
                viewCloudImg5);


        stage.show();

        scene.setOnKeyPressed(e -> {
            setTrue();
            player.updateFrame();
        });

        scene.setOnKeyReleased(e ->{
            setFalse();
        });
    }

}
