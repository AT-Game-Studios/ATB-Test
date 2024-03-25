package com.libgdx.atb.test.koala;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.libgdx.atb.test.BaseActor;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public class Timer extends BaseActor {
    public Timer(float posX, float posY, Stage stage) {
        super(posX, posY, stage);

        loadTexture("JumpingJack/V1/items/timer.png");

        Action pulse = Actions.sequence(
                Actions.scaleTo(1.1f, 1.1f, 0.5f),
                Actions.scaleTo(1.0f, 1.0f, 0.5f)
        );

        addAction( Actions.forever(pulse) );
    }
}
