              //Search in Sorted Matrics
public class SearchMatrics {

    public static boolean StarirCaseSearch(int mat[][],int key){
   int row=0, col=mat[0].length-1;
   while(row<mat.length && col>0){
    if(mat[row][col]==key){
     System.out.print("Found key at("+row+ "," +col+")");
     return true;
    }
    else if(key<mat[row][col]){
        col--;
    }
    else {
        row++;
    }
   }
   System.out.println("key not found");
   return false;
    }
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},
              {15,25,35,45},
            {27,29,37,48},
        {32,33,39,50} };
        int key=33;
       
        StarirCaseSearch(mat, key);
    }
    
     
    
}
