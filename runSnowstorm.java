import ecs100.*;
import java.awt.color.*;
import java.util.*;

public class runSnowstorm{
	
	//CONSTANTS
	public static final boolean isInEditMode=false;//Whether or not the simulation is in active use mode, or being tweaked.
	
	//FIELDS
	private ArrayList<Zone> Zones = new ArrayList<>();
	
	
	public void initialize() {//Loads any saved data for the current map
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * Main method. At present, it initializes the UI, configures the UI so that it displays only the graphics pane, then 
	 * 
	 */
	public static void main(String[] args) {
		UI.initialise();
		UI.setDivider(0);//Sets it so that there is no graphics output region - ONLY
		runSnowstorm KG3 = new runSnowstorm();
		KG3.initialize();//Sets up all of the data about the current environment.
		//while(true) {
		//	KG3.tick();
		//}
		//NOTE: This may very well not be necessary - after all, users will likely want to manually tick through - therefore,
		//-it might be a better idea to let the user advance a "tick" through the GUI manually.
	}



}
