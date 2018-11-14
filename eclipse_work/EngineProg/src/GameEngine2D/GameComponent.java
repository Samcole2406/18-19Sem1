package GameEngine2D;

/**
 * @author MMC238
 */

public abstract class GameComponent extends ProcessingEntity {
	public GameObject gameObject;
	public Transform transform;
	
	public GameComponent(GameObject gameOb) {
		//Sets the gameObject this is attached to as the parent of the component
		super(gameOb.parent);
		
		//Layout for generic component:
		
		//Links component to object
		this.gameObject = gameOb;
		//Sets the transforms to be equal
		this.transform = this.gameObject.transform;
		//Adds this component to the parent's list of components
		this.gameObject.components.add(this);
	}

	public abstract void start();

	public abstract void update();

	public abstract void render();
}