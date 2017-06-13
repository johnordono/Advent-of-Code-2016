import java.io.FileInputStream;
import java.util.*;

public class SquareWithThreeSides {
	public static void main(String[] args){
		
		int impossibleTriangles = 0;
		//FileInputStream inputStream = new FileInputStream("triangles.txt");
		Scanner reader = new Scanner(System.in);
		
		System.out.print("How many lines are there?: ");
		int numLines = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter your lines here: \n");
		
		//String[] array = new String[numLines];;
		//for(int l = 0; l < numLines; l++){
		//	array[l] = reader.nextLine();
		//}
		
		for(int i = 0; i < numLines; i++){
			int num1 = reader.nextInt();
			int num2 = reader.nextInt();
			int num3 = reader.nextInt();
			
			if(((num1 + num2) <= num3) || ((num2 + num3) <= num1) || ((num1 + num3) <= num2)){
				impossibleTriangles++;
				System.out.print("Tri: " + num1 + ", " + num2 + ", " + num3 + " - impossible: " + impossibleTriangles +"\n");
			}
		}
		
		
		int possibleTriangles = numLines - impossibleTriangles;
	
		System.out.print("Impossible Triangles: " + impossibleTriangles + "\nPossible Triangles: " + possibleTriangles);
	}
		
}

