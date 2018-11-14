package GameEngine2D;

/**
 * @author MMC238
 */

import processing.core.*;
import java.util.ArrayList;

//This class is used to launch games
public class GameManager {
    public PApplet parent;
    public int background = 0;
    
    //A list of gameObjects
    private ArrayList<GameObject> gameObjects;
   
    public GameManager(PApplet p){
        parent = p;
        gameObjects = new ArrayList<GameObject>();
    }

    //Add an object into the game
    public void addObject(GameObject gameOb){
        gameObjects.add(gameOb);
    }
    //Remove an object from the game
    public void removeObject(GameObject gameOb){
        gameObjects.remove(gameObjects.lastIndexOf(gameOb));
    }
    
    //Run start() for every gameObject added
    public void StartAll() {
        for(int i = 0; i < gameObjects.size(); i++){
            GameObject gameOb = gameObjects.get(i);
            gameOb.start();
        }
    }
    //Run update() and render() for every gameobject added
    public void UpdateAll() {
    	parent.background(background);
        for(int i = 0; i < gameObjects.size(); i++){
        	
            GameObject gameOb = gameObjects.get(i);
            gameOb.update();
            gameOb.render();
        }
    }
}