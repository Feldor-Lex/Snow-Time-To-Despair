import ecs100.*;
import java.awt.color.*;
import java.util.*;

public class runSnowstorm{
	
	//CONSTANTS
	public static final boolean isInEditMode=false;//Whether or not the simulation is in active use mode, or being tweaked.
	public static final double passiveStormDamageMult = 1;
	public static final String saveData="snowstorm.txt";
	
	//FIELDS: GENERAL
	private ArrayList<Zone> Zones = new ArrayList<>();
	private ArrayList<Wall> Walls = new ArrayList<>();
	private String displayMode = "Map"; //Current rendering mode. Can be "Map", "Profiles", "Info". Defaults to "Map"
	private double prevMouseX = 0;//Keeps track of the last recorded position of the mouse --
	private double prevMouseY = 0;//-- used for panning across the map, primarily. Initialized to 0 to avoid accidental errors.
	//FIELDS: CAMERA PANNING
	private double xOffset = 0;//How far to the left or the right from the "default" the display is.
	private double yOffset = 0;//How far up or down from the "default" the display is.
	private double zoomModifier = 1;//Whether or not the map is zoomed in or zoomed out from the "default".
	
	
	public void initialize() {//Loads any saved data for the current map
		
		
	}
	
	
	
/*
 * Draws the graphical map once everything else is done. Must be called after ANY changes, even panning slightly.
 */
	public void draw() {
		
		

	}

	//###USER INTERFACE - GUI SETUP, MOUSE SELECTION AND MOUSE PANNING###
	/*
	 * Sets up the GUI, enables mouse listeners and similar.
	 * Only needs to be called once.
	 */
	public void setupGUI() {
		UI.initialise();
		UI.setMouseMotionListener(this::doMouse);
		UI.setDivider(0);//Sets it so that there is no graphics output region - ONLY
	}
	
	/*
	 * Handles various mouse events. Clicking, panning, etc.
	 */
	public void doMouse(String action, double currentmouseX, double currentmouseY ) {
		
		
		
	}
	
	
	/**
	 * Main method. At present, it initializes the UI, configures the UI so that it displays only the graphics pane, then 
	 * runs a handful of test functions.
	 */
	public static void main(String[] args) {
		runSnowstorm KG3 = new runSnowstorm();
		KG3.setupGUI();//Sets up the GUI, mouselisteners, graphics pane, etc.
		
		
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
