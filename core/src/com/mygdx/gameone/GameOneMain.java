package com.mygdx.gameone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameOneMain extends ApplicationAdapter {

	OrthographicCamera camera;
	SpriteBatch batch;
	Sprite sprite;
	Texture texture;

	@Override
	public void create () {
		camera = new OrthographicCamera(25,25);
		camera.position.set(25/2f,25/2f,0);

		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("drums.png"));

		sprite = new Sprite(texture);
		sprite.setPosition(0, 0);
		sprite.setSize(5,5);
		Gdx.app.log("Sprite Size", String.valueOf(sprite.getWidth()));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite.draw(batch);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
