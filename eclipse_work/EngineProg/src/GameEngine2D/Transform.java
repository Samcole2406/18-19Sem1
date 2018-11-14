package GameEngine2D;

/**
 * @author MMC238
 */

//Needed for holding pos and rot values
import processing.core.PVector;

public class Transform {
	public Transform() {
		
	}
	//Data holders
	public PVector position = new PVector(0,0);
	public PVector rotation = new PVector(0,0);
	public PVector scale = new PVector(0,0);;
}