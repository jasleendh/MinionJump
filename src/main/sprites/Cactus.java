package main.sprites;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Cactus implements Sprite {

    private Image[] cactusImage;
    private ImageView viewCactusImg;
    private ImageView viewCactusImg2;
    private ImageView viewCactusImg3;

    public Cactus(ImageView viewCactusImg, ImageView viewCactusImg2, ImageView viewCactusImg3,
                  Image[] cactusImage){
        this.cactusImage = cactusImage;
        this.viewCactusImg = viewCactusImg;
        this.viewCactusImg2 = viewCactusImg2;
        this.viewCactusImg2 = viewCactusImg2;
        this.viewCactusImg3 = viewCactusImg3;
    }

    int randomImg = (int)(0 + Math.random() * 6);
    int randomImg2 = (int)(0 + Math.random() * 6);
    int randomImg3 = (int)(0 + Math.random() * 6);
    int randomX = (int)(200 + Math.random() * 1920);
    int randomX2 = (int)(200 + Math.random() * 1920);
    int randomX3 = (int)(200 + Math.random() * 1920);

    @Override
    public void updateFrame() {
        viewCactusImg.setImage(cactusImage[randomImg]);
        viewCactusImg2.setImage(cactusImage[randomImg2]);
        viewCactusImg3.setImage(cactusImage[randomImg3]);
        viewCactusImg.setFitHeight(70);
        viewCactusImg2.setFitHeight(70);
        viewCactusImg3.setFitHeight(70);

        viewCactusImg.setX(randomX);
        viewCactusImg2.setX(randomX2);
        viewCactusImg3.setX(randomX3);
        viewCactusImg.setY(675);
        viewCactusImg2.setY(675);
        viewCactusImg3.setY(675);

    }
}

