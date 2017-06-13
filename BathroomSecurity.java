import java.util.*;

public class BathroomSecurity {
	public static void main(String[] args){
		int xcoord = 0;
		int ycoord = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("How many lines are there?\n");
		int numLines = Integer.parseInt(reader.nextLine());
		System.out.print("Entered: " + numLines + "\n");
		System.out.print("Enter your lines.\n");
		String[] array = new String[numLines];
		for(int l = 0; l < numLines; l++){
			array[l] = reader.nextLine();
		}
		
		int i;
		int k;
		
		for(i = 0; i < numLines; i++){
			int strLen = array[i].length();
			System.out.print("\n" + strLen + "\n");
			String[] lineArray = array[i].split("");
			System.out.print("Number " + i + "\n");
			
			for(k=0; k < strLen+1; k++){
				String direction = lineArray[k];
				System.out.print("Direction: " + direction);
				
				/////   Y   /////
				if(direction.equals("U")){
					if(ycoord < 1){
						ycoord = ycoord + 1;
					}
				}else if(direction.equals("D")){
					if(ycoord > -1){
						ycoord = ycoord - 1;
					}
					
				/////   X   /////	
				}else if(direction.equals("R")){
					if(xcoord < 1){
						xcoord = xcoord + 1;
					}
				}else if(direction.equals("L")){
					if(xcoord > -1){
						xcoord = xcoord - 1;
					}					
				}
				System.out.print(k + "(" + xcoord + ", " + ycoord + ")");
				if(k == strLen-1){
					int number = 0;
					if(xcoord == -1 && ycoord == 1){
						number = 1;
					}
					if(xcoord == 0 && ycoord == 1){
						number = 2;
					}
					if(xcoord == 1 && ycoord == 1){
						number = 3;
					}
					if(xcoord == -1 && ycoord == 0){
						number = 4;
					}
					if(xcoord == 0 && ycoord == 0){
						number = 5;
					}
					if(xcoord == 1 && ycoord == 0){
						number = 6;
					}
					if(xcoord == -1 && ycoord == -1){
						number = 7;
					}
					if(xcoord == 0 && ycoord == -1){
						number = 8;
					}
					if(xcoord == 1 && ycoord == -1){
						number = 9;
					}
					
					System.out.print("\nPush: " + number + "\n");
				}
			}
		}
	}
}
