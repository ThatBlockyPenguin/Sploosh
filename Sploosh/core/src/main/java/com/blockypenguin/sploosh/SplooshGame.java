package com.blockypenguin.sploosh;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class SplooshGame extends Game {
	@Override
	public void create() {
		setScreen(new FirstScreen());
	}
}