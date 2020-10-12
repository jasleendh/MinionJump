package main;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import main.sprites.Cactus;
import main.sprites.Clouds;
import main.sprites.Player;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Image[] minionImage = new Image[16];
        for (int i = 0; i < minionImage.length; i++) {
            Image img = new Image(getClass().getResource("/resources/sprites/minion/" + i + ".png").toString());
            minionImage[i] = img;
        }

        ImageView viewMinionImage = new ImageView();


        Image[] cactusImage = new Image[6];
        for (int i = 0; i < cactusImage.length; i++) {
            Image img = new Image(getClass().getResource("/resources/sprites/cactus/" + i + ".png").toString());
            cactusImage[i] = img;
        }

        ImageView viewCactusImage = new ImageView();
        ImageView viewCactusImage2 = new ImageView();
        ImageView viewCactusImage3 = new ImageView();
//        viewCactusImage2.setY(710);
//        viewCactusImage3.setY(710);
//        for (int i = 0; i < cactusImage.length; i++) {
//            viewCactusImage.setImage(cactusImage[i]);
//            viewCactusImage2.setImage(cactusImage[i]);
//            viewCactusImage3.setImage(cactusImage[i]);
//        }

        //
        //
        //

        Image cloudImage =
                new Image(getClass().getResource("/resources/sprites/cloud.png").toString());

        ImageView viewCloudImg1 = new ImageView();
        ImageView viewCloudImg2 = new ImageView();
        ImageView viewCloudImg3 = new ImageView();
        ImageView viewCloudImg4 = new ImageView();
        ImageView viewCloudImg5 = new ImageView();


        GameStage gameStage = new GameStage(stage, viewMinionImage, viewCactusImage,
                viewCloudImg1);

        Player player = new Player(viewMinionImage, minionImage, false);
        Cactus cactus1 = new Cactus(viewCactusImage , viewCactusImage2, viewCactusImage3, cactusImage);
        Cactus cactus2 = new Cactus(viewCactusImage , viewCactusImage2, viewCactusImage3, cactusImage);
        Cactus cactus3 = new Cactus(viewCactusImage, viewCactusImage2, viewCactusImage3, cactusImage);
        Clouds clouds1 = new Clouds(viewCloudImg1, viewCloudImg2, viewCloudImg3, viewCloudImg4, viewCloudImg5, cloudImage);
        Clouds clouds2 = new Clouds(viewCloudImg1, viewCloudImg2, viewCloudImg3, viewCloudImg4, viewCloudImg5, cloudImage);
        Clouds clouds3 = new Clouds(viewCloudImg1, viewCloudImg2, viewCloudImg3, viewCloudImg4, viewCloudImg5, cloudImage);
        Clouds clouds4 = new Clouds(viewCloudImg1, viewCloudImg2, viewCloudImg3, viewCloudImg4, viewCloudImg5, cloudImage);
        Clouds clouds5 = new Clouds(viewCloudImg1, viewCloudImg2, viewCloudImg3, viewCloudImg4, viewCloudImg5, cloudImage);


        Animation animation = new Animation();

        gameStage.start(stage, viewMinionImage, viewCactusImage, viewCactusImage2,
                viewCactusImage3, viewCloudImg1, viewCloudImg2, viewCloudImg3, viewCloudImg4,
                viewCloudImg5, true);
        animation.gameAnimation(player, cactus1, cactus2, cactus3, clouds1, clouds2, clouds3,
                clouds4,clouds5);


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
