public class UpdateNum {


    public static void Update(int marks[]){
        for( int i=0;i<marks.length;i++){
            marks[i]++;
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        Update(marks);


        //print our mark
        // for( int i=0;i<=marks.length;i++){
        //     System.out.println(marks[i]);
        // }
        
    }
    
}
