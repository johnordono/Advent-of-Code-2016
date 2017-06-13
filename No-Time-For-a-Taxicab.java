import java.util.*;
import java.lang.Math;

public class StreetGrid {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter in your directions:");
	    String directions = reader.nextLine();
	    
	    String[] array= directions.split(", ");
	    int numDirections = array.length; 
	    
	    //north = 0; east = 1; south = 2; west = 3;
	    int direction = 0;
	    
	    int xcoord = 0;
	    int ycoord = 0;
	    
	    for(int i=0; i<numDirections; i++){
	    	String turnDirection = array[i].substring(0, 1);
	    	int blocksMoved = Integer.parseInt(array[i].substring(1));

	    	if (turnDirection.equals("R")){
	    		direction = direction + 1;
	    	}else if(turnDirection.equals("L")){
	    		direction = direction - 1;
	    	}
	    	
	    	if(direction == -1){
	    		direction = 3;
	    	} else if(direction == 4){
	    		direction = 0;
	    	}
	    	
	    	if(direction == 0){ //north
	    		ycoord = ycoord + blocksMoved;
	    	} else if(direction == 1){ //east
	    		xcoord = xcoord + blocksMoved;
	    	} else if(direction == 2){ //south
	    		ycoord = ycoord - blocksMoved;
	    	} else if(direction == 3){ //west
	    		xcoord = xcoord - blocksMoved;
	    	}
	    }
	    System.out.print("X Coord:" + xcoord + "\n");
    	System.out.print("Y Coord:" + ycoord + "\n");
    	
    	int totalDistance = Math.abs(xcoord) + Math.abs(ycoord);
    	System.out.print("Total Distance:" + totalDistance + "\n");
    	
	}
}
