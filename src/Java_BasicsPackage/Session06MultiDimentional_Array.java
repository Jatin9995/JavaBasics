package Java_BasicsPackage;

public class Session06MultiDimentional_Array {

	public static void main(String[] args) {

		/*
		 * In multidimentional array, data is stored in row and column based index (also known as matrix form).
		 * Declaration & instantiation
		 * 
		 *  datatype [][] arrayname=new datatype[row size][col size];   1st way
		 *  datatype [][] arrayname={{1,2,3},{2,3,4},{8,5,4}};   2nd way  //means 3 rows & 3 columns  
		 */

//--------------------------------------1st way-----------------------------------------------------------
		/*int [][] a=new int[3][2]; //3 rows and 2 columns
		a[0][0]=12;   //row=0, col=0
		a[0][1]=13;   //row=0, col=1
		
		a[1][0]=14;   //row=1, col=0
		a[1][1]=15;   //row=1, col=1
		
		a[2][0]=16;   //row=2, col=0
		a[2][1]=17;   //row=2, col=1
		*/

//-------------------------------------------2nd way-----------------------------------------------------------

		int [][] a= {{12,13},{14,15},{16,17}};

		
		
		//print the size of row and column
		
		int rowsize = a.length;
		System.out.println("Size of row:-" + rowsize);
		
		//size of column
		
		int columnsize = a[0].length;
		System.out.println("Column size:-" + columnsize);
	
		
		//read and print all values of array
	for (int i=0; i<rowsize; i++) {
		
		for (int j=0; j<columnsize; j++) {
			
			int allrowscolumdetails = a[i][j];
			System.out.println(allrowscolumdetails);
		}
	}
		
		
		
		
		
		
	}

}
