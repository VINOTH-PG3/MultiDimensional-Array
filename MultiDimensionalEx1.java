package multiDimensional;

public class MultiDimensionalEx1 {
	public static void main(String[] args) {
		
		int two[][] ={{2,4,4,8,4},{10,12,4,7,5},{2,3,8,5,6}};
		         // so that 2  4  4  8  4
		                  //10 12 4  7  5
		                  //2  3  8  5  6
		
		
		System.out.println(two[1][1]);  // in this we call 1 row 3rd length to print
		
System.out.println("PRINT USING LOOPS");
		for(int row = 0; row <two.length; row ++){    // the rows length of array is three so it takes length value 3
               for(int column =0; column <two[row].length; column ++){  //rows length is 4 length is 4
		           System.out.print(two[row][column]+"\t");
		}
			       System.out.println();
	   }
    }
	}