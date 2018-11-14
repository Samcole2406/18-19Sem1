package GameEngine2D;

/**
 * @author MMC238
 */

import java.util.ArrayList;
import processing.core.PApplet;

public abstract class GameObject extends ProcessingEntity{
	
	//Every object needs a name for identification
	public String name;
	//Tag objects as something
	public String tag;
	
	//This is the parent PApplet that we will render ourselves onto
	public PApplet parent; 
	
	//Holds a list of the components this Gameobject has
	public ArrayList<GameComponent> components;
	
	//Every GameObject needs a transform to hold its position and use physics
	public Transform transform = new Transform();
	
	public GameObject(PApplet p) {
		super(p);
		//Makes a unique list of components for each GameObject
		this.components = new ArrayList<GameComponent>();
	}
	
	//Gameobjects need these 
	public abstract void start();
	public abstract void update();
	public abstract void render();
}