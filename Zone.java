import ecs100.*;
import java.awt.color.*;
import java.util.*;

public class Zone {
	//FIELDS
	private ArrayList<Zone> adjacentZones = new ArrayList<>();//Any zones which the current zone is connected to.
	private boolean isBreached;//Whether or not the current zone is breached! Simple enough.
	private double health;//A measure of how badly damaged the zone is.
	private double maxHealth;//An upper limit of the "health" of a zone. Helps with percentage damage. 100% is health=maxHealth is perfect condition.
	private double damageThreshold; //The value where, if health is lower than this, the zone becomes breached.
	private ArrayList<Double> xPoints = new ArrayList<>(); 
	private ArrayList<Double> yPoints = new ArrayList<>();
	
	

	
	/*
	 * Turns a zone into a string with all data present so that it can be saved and loaded.
	 * Returns as a string.
	 */
	public String toString() {//A custom toString! Why? One, so I can code it by hand. Two, so I know everything's in the right order and format.
		xPoints.add(1.4);//Test value, TEMPORARY
		xPoints.add(2.0);//Test Value, TEMPORARY
		
		return(//Formats the zone into several different parts by using | as a delimeter,
				xPoints.toString()//Prints out the X coordinates in the format of [1.5, 2.8]
				+"|"+yPoints.toString()//Prints out the Y coordinates in the format of [1.5, 2.8]
				+"|"+adjacentZones.toString()//Prints out the list of all adjacent zones to this zone, in [] format
				+"|"+health //returns current health as a double
				+"|"+maxHealth //maxHealth as a double
				+"|"+isBreached //Boolean of whether or not it's been breached
				+"|"+damageThreshold //Returns DT as a double
				);//End of the toString function
	}
}

