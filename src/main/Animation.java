package main;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.sprites.Cactus;
import main.sprites.Clouds;
import main.sprites.Player;

public class Animation {

    public void gameAnimation(Player player, Cactus cactus1, Cactus cactus2, Cactus cactus3,
                              Clouds clouds1, Clouds clouds2, Clouds clouds3, Clouds clouds4,
                              Clouds clouds5) {
        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                player.updateFrame();
                cactus1.updateFrame();
                cactus2.updateFrame();
                cactus3.updateFrame();
                clouds1.frame();
                clouds2.frame();
                clouds3.frame();
                clouds4.frame();
                clouds5.frame();
            }
        }.start();
    }

}
