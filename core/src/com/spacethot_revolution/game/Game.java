package com.spacethot_revolution.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public abstract class Game implements ApplicationListener {

    public Screen screen;

    @Override
    public void dispose () {
        if (screen != null) screen.hide();
    }
    @Override
    public void pause () {
        if (screen != null) screen.pause();
    }
    @Override
    public void resume () {
        if (screen != null) screen.resume();
    }
    @Override
    public void render () {
        if (screen != null) screen.render(Gdx.graphics.getDeltaTime());
    }
    @Override
    public void resize (int width, int height) {
        if (screen != null) screen.resize(width, height);
    }

    /*
      Sets the current screen and calls resize + show on the current screen given the width and
      height set in the Gdx.graphics module.
     */
    public void setScreen (Screen screen) {
        if (this.screen != null) this.screen.hide();
        this.screen = screen;
        if (this.screen != null) {
            this.screen.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            this.screen.show();
        }
    }
    public Screen getScreen () {
        return screen;
    }
}

