package main.sprites;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Clouds {

    private ImageView viewCloudImg;
    private ImageView viewCloudImg2;
    private ImageView viewCloudImg3;
    private ImageView viewCloudImg4;
    private ImageView viewCloudImg5;
    private Image cloudImage;

    public Clouds(ImageView viewCloudImg, ImageView viewCloudImg2,
                  ImageView viewCloudImg3, ImageView viewCloudImg4,
                  ImageView viewCloudImg5, Image cloudImage){
        this.viewCloudImg = viewCloudImg;
        this.viewCloudImg2 = viewCloudImg2;
        this.viewCloudImg3 = viewCloudImg3;
        this.viewCloudImg4 = viewCloudImg4;
        this.viewCloudImg5 = viewCloudImg5;
        this.cloudImage = cloudImage;
    }

//(    int x = (int) (0 + Math.random() * 1920);
//    int y = (int) (100 + Math.random() * 200);
//
//    int x2 = (int) (0 + Math.random() * 1920);
//    int y2 = (int) (100 + Math.random() * 200);
//
//    int x3 = (int) (0 + Math.random() * 1920);
//    int y3 = (int) (100 + Math.random() * 200);
//
//    int x4 = (int) (0 + Math.random() * 1920);
//    int y4 = (int) (100 + Math.random() * 200);
//
//    int x5 = (int) (0 + Math.random() * 1920);
//    int y5 = (int) (100 + Math.random() * 200);)


    public void frame(){
//        for (int i = 0; i < 5; i++) {
        viewCloudImg.setImage(cloudImage);
        viewCloudImg.setX(170);
        viewCloudImg.setY(150);
        viewCloudImg.setFitWidth(200);
        viewCloudImg.setFitHeight(40);

        viewCloudImg2.setImage(cloudImage);
        viewCloudImg2.setX(600);
        viewCloudImg2.setY(225);
        viewCloudImg2.setFitWidth(200);
        viewCloudImg2.setFitHeight(40);

        viewCloudImg3.setImage(cloudImage);
        viewCloudImg3.setX(950);
        viewCloudImg3.setY(300);
        viewCloudImg3.setFitWidth(200);
        viewCloudImg3.setFitHeight(40);

        viewCloudImg4.setImage(cloudImage);
        viewCloudImg4.setX(1200);
        viewCloudImg4.setY(255);
        viewCloudImg4.setFitWidth(200);
        viewCloudImg4.setFitHeight(40);

        viewCloudImg5.setImage(cloudImage);
        viewCloudImg5.setX(1550);
        viewCloudImg5.setY(150);
        viewCloudImg5.setFitWidth(200);
        viewCloudImg5.setFitHeight(40);



//        }
    }
}
