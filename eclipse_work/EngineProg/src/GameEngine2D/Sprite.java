package GameEngine2D;

/**
 * @author MMC238
 */

import processing.core.*;

//Sprite is abstract because it will be divided into enemy, player etc
public abstract class Sprite extends GameObject {
	public Sprite(PApplet p) {
		super(p);
	}
	//If given an x and y coordinate
	public Sprite(PApplet p, int x, int y) {
		super(p);
		this.transform.position.x = x;
		this.transform.position.y = y;
	}
	
	@Override
	public void start() {
		//Starts all components in the same way as render()
		for (int i = this.components.size() - 1; i >= 0; i--) {
			GameComponent gameCom = this.components.get(i);
			gameCom.start();
		}
	}
	
	public abstract void update();

	@Override
	public void render() {
		//Cycles through a list of components this has
		for (int i = this.components.size() - 1; i >= 0; i--) {
			//gameCom is a temporary holder to update and render each component, and is then used for the next component in the list
			GameComponent gameCom = this.components.get(i);
			gameCom.update();
			gameCom.render();
		}
	}
}