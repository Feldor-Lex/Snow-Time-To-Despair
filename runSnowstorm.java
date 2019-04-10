import ecs100.*;
import java.awt.color.*;
import java.util.*;

public class runSnowstorm{
	
	//CONSTANTS
	public static final boolean isInEditMode=false;//Whether or not the simulation is in active use mode, or being tweaked.
	public static final double passiveStormDamageMult = 1;

	
	//FIELDS
	private ArrayList<Zone> Zones = new ArrayList<>();
	private String displayMode = "Map"; //Current rendering mode. Can be "Map", "Profiles", "Info"
	
	
	public void initialize() {//Loads any saved data for the current map
		
		
	}
	
	
	
/*
 * Draws the graphical map once everything else is done. Must be called after ANY changes, even panning slightly.
 */
	public void draw() {
		
		

	}

	
	/**
	 * Main method. At present, it initializes the UI, configures the UI so that it displays only the graphics pane, then 
	 * runs a handful of test functions.
	 */
	public static void main(String[] args) {
		UI.initialise();
		UI.setDivider(0);//Sets it so that there is no graphics output region - ONLY
		runSnowstorm KG3 = new runSnowstorm();
		KG3.initialize();//Sets up all of the data about the current environment.
		
		Zone testZone = new Zone();
		UI.println(testZone.toString());
		for(int i=0; i<100; i++) {UI.println((int)(Math.random()*10));}
		
		
		
		//while(true) {
		//	KG3.tick();
		//}
		//NOTE: This may very well not be necessary - after all, users will likely want to manually tick through - therefore,
		//-it might be a better idea to let the user advance a "tick" through the GUI manually.
	}



}
