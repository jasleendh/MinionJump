package main.sprites;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player implements Sprite {
    private double velocity = 20;
    private double x = 0;
    private double y = 1040 / 1.8;
    private ImageView viewPlayerImg;
    private Image[] images;
    private boolean space = false;

    public Player(ImageView viewPlayerImg, Image[] images, boolean space) {
        this.viewPlayerImg = viewPlayerImg;
        this.images = images;
        this.space = space;
    }


    @Override
    //instantaneous
    public void updateFrame() {
        viewPlayerImg.setFitWidth(135);
        viewPlayerImg.setFitHeight(170);
        viewPlayerImg.setImage(images[6]);

        if (space == true) {
            y = y - velocity;
            viewPlayerImg.setY(y);
            if ((int) y == 577) {
                y = 577;
                velocity = 0;
                x = 670;
            }
            if ((int) y == 564) {
                y = 564 + 13;
                velocity = 0;
            }
            velocity = velocity - 0.6;
            x = x + 10;
            viewPlayerImg.setX(x);
        }
    }
}
