package multiDimensional;

import java.util.Scanner;
              //multiDimensionalArray with rows and columns getting in scanner
public class multidimensionEx2 {
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner md =new Scanner(System.in);  //md OBJECT NAME IS CREATED FOR SCANNER
	
	System.out.println("Enter size of the row :");   //specifying user to mention rows
	int row=md.nextInt();                            // VALUE GET FROM USER IS STORED IN VARIABLE NAME row
	
	
	System.out.println("Enter size of the column :");//specifying user to mention columns
	int column=md.nextInt();                         // VALUE GET FROM USER IS STORED IN VARIABLE NAME column
    
	
	int two[][]=new int[row][column];
       int i,j;                                    //Initializing row and column as i,j
       System.out.println("Enter Datas");          //specifying user to mention to give values for data 
       for (i=0;i<row;i++){                        // for loop is used to allocate length of row and column 
    	   for(j=0;j<column;j++){
    		   two[i][j]=md.nextInt();            // USER GIVEN VALUE IS STORED IN two[i][j]
    	   }
       }
       
       
       System.out.println("output is ");   // output displays
       for (i=0;i<row;i++){
   	   for(j=0;j<column;j++){
    		   System.out.print( two[i][j]+"  \t");
    		   
    		   
    		  }
    	   System.out.println();
       }
//       for(int xy:two){      
//   		
//   		System.out.print(xy+"\t");
//       }

}
}
