//**********************************
//COSC 1336 CS1
//Name: Jalen McCarthy
//Date: 10/21/21
//Read in two matrices
//**********************************
import java.util.Scanner;
public class MDArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Create Scanner
	Scanner input = new Scanner(System.in);
		
	//Create Two Matrices
	System.out.print("Enter 3x3 matrix 1: ");
		double[][] matrix1 = new double [3][3];
		 for (int row = 0; row < 3; row++) {
		  for (int column= 0; column < 3; column++) {
		   double number = input.nextDouble();
		    matrix1[row][column] = number;
		}
	}
	System.out.print("\nEnter 3x3 matrix 2: ");
		double[][] matrix2 = new double[3][3];
		 for (int row = 0; row < 3; row++) {
		  for (int column = 0; column < 3; column++) {
		   double number =input.nextDouble();
		    matrix2[row][column] = number;
		}
	}
		 
	//Display First Matrix
	System.out.println("\nThe first matrix is: "  );
	    for (int row = 0; row < 3; row++) {
		 for (int column= 0; column < 3; column++) {
	System.out.print( matrix1[row][column] + " ");	
		}
	System.out.println();
	}
	    
	//Display Second Matrix
	System.out.println("\nThe second matrix is: ");
		for (int row = 0; row < 3; row++) {
		 for (int column= 0; column < 3; column++) {
	System.out.print( matrix2[row][column] + " ");	
		}
	System.out.println();
	}		
		
	//Create Third Matrix
	double[][]matrix3 = new double[3][3];
	
	//Sum of Two Matrices
	System.out.println("\nThe sum of those two matrices is: ");
		for (int row = 0; row < 3; row++) {
		 for (int column = 0; column < 3; column++) {
		  matrix3[row][column] = matrix1[row][column] + matrix2[row][column];		
	System.out.print(matrix3[row][column] + " ");
		}
	System.out.println();
	}
		input.close();	
}
	}

	
