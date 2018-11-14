package GameEngine2D;

/**
 * @author MMC238
 */

import processing.core.PApplet;

public abstract class ProcessingEntity {
	
	//Everything needs these
	public String name;
	public int ID;
	public PApplet parent;
	
	//Everything becomes a child of the PApplet
	public ProcessingEntity(PApplet p) {
		parent = p;
	}
}