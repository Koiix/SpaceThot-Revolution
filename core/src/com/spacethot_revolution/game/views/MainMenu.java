package com.spacethot_revolution.game.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.audio.Sound;

public class MainMenu extends ScreenAdapter {
    Sound music;
    long musicId;

    public void show () {
        music =  Gdx.audio.newSound(Gdx.files.internal("audio/opening.mp3"));
        musicId = music.play();
    }

    @Override
    public void render (float delta) {

    }

    @Override
    public void resize (int width, int height){

    }

    @Override
    public void pause (){

    }

    @Override
    public void resume (){

    }

    @Override
    public void hide (){
        music.stop(musicId);
    }

    @Override
    public void dispose (){
        music.dispose();
    }

}
