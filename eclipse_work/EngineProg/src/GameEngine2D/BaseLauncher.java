package GameEngine2D;

/**
 * @author MMC238
 */

import processing.core.PApplet;

//A basic game launcher
//This will be expanded upon when specific games are made

public class BaseLauncher {
	public PApplet parent;
	
	public BaseLauncher(PApplet p){
        parent = p;
    }
	
	 public GameManager gameManager;
	    public void StartGame(){
	        gameManager = new GameManager(parent);
	    }
	    public void UpdateAll(){
	        gameManager.UpdateAll();
	    }
}