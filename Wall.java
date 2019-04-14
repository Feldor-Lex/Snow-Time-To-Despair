import ecs100.*;
import java.awt.color.*;
import java.util.*;

/*
 * Walls! Single 2D lines which can be adjusted and added in easily in edit mode.
 *  Doesn't affect zones in any way, mostly for graphical clarity on a finished map.
 */
public class Wall{
	//Constants
	private static final double WALL_WIDTH = 15; //Line thickness of each wall.
	
	//Fields
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	

	/*
	 * Sets the x, then y values of the first coordinate
	 */
	public void setPos1(double xvalue, double yvalue){
		this.x1=xvalue;
		this.y1=yvalue;
		}
	
	/*
	 * Sets the x, then y values of the second coordinate
	 */
	public void setPos2(double xvalue, double yvalue){
		this.x2=xvalue;
		this.y2=yvalue;
		}
	
	/*
	 * Draws a wall.
	 * Takes the inputs: x offset, y offset, zoom multiplier
	 * 
	 */
	public void render(double xOffset, double yOffset, double zoomMult) {
		UI.setLineWidth(WALL_WIDTH);
		UI.drawLine(x1, y1, x2, y2);
	}
	
	/*
	 * For debugging purposes ONLY:
	 * Will draw a wall without offset or zoom
	 */
	public void safeModeRender() {
		UI.setLineWidth(WALL_WIDTH);
		UI.drawLine(x1, y1, x2, y2);
	}
	
	
	/*
	 * Constructor for a wall. (basically a line)
	 * Takes X1, Y1, X2, Y2 coordinates in that order.
	 */
	public Wall (double xpos1, double ypos1, double xpos2, double ypos2){
		this.x1=xpos1;
		this.y1=ypos1;
		this.x2=xpos2;
		this.y2=ypos2;}
		
	
}