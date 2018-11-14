package GameEngine2D;

/**
 * @author MMC238
 */

import processing.core.PApplet;

public class Tile extends Sprite{

	//Tile constructor
	public Tile(PApplet p, int x, int y, int w, int h) {
		super(p);
	}
	
	@Override
	public void start() {
		super.start();
	}

	@Override
	public void update() {
		
	}

	@Override
	public void render() {
		super.render();
		parent.pushMatrix(); // reset the translation and rotation
		parent.translate(this.transform.position.x, this.transform.position.y);
		//parent.stroke(this.strokeColour);
		//parent.fill(this.fillColour);
		//parent.rect(0, 0, this.width, this.height);
		parent.popMatrix();
	}
	
}