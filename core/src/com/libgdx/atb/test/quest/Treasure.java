package com.libgdx.atb.test.quest;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.libgdx.atb.test.BaseActor;

public class Treasure extends BaseActor {
    public Treasure(float posX, float posY, Stage stage) {
        super(posX, posY, stage);
        loadTexture("TreasureQuest/V1/treasure-chest.png");
    }
}
