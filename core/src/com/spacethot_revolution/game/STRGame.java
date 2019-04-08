package com.spacethot_revolution.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.spacethot_revolution.game.views.MainMenu;

public class STRGame extends Game {
	SpriteBatch batch;
	Texture img;
	float location;

	public STRGame(){
		location = 0;
	}

	@Override
	public void create () {
		setScreen(new MainMenu());

	}

}
