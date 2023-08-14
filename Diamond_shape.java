import java.util.Scanner;

public class Diamond_shape {

public static int getSize(){
    
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the size number: ");
    int size = s.nextInt();
    s.close();

    return size;
} 

public static int getCenter(int size){
   int center = size /2;

    return center;
} 


    public static void main (String[] args){

        int size = getSize();
        // get start position of the diamond
        int center= getCenter(size);

        // check if the size is even then increments if even
        if(size % 2 == 0){
        size +=1;
        System.out.println(size);
    } 

        int asterisksGen =0;
        
        // loop to ensure that the row numbers don't go above the size
        for(int row =0; row < size; row++){
        // loop for the columns
          for(int col =0; col < size; col++){
            if(col >=(center - asterisksGen) && col <=(center + asterisksGen)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
          }
          //prints new row
          System.out.println();
          
          // Determine the print direction
          // whether to expand or to shrink!!
          if (row < center){
            asterisksGen++;
          }else{
            asterisksGen--;}

          }

        }

    }

