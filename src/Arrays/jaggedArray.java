public class jaggedArray{
    public static void main(String[] args){
        char [][] jaggedArray=new char[3][];

       jaggedArray[0]=new char[2];  //first row has 2 columns
       jaggedArray[1]=new char[3]; //second row has 3 columns
       jaggedArray[2]=new char[5]; //third row has 5 columns

       jaggedArray[0][0]='a';   // 1st row 1 st column
       jaggedArray[0][1]='b';   //1st row second column

       jaggedArray[1][0] ='c';        //2nd row 1st column 
       jaggedArray[1][1] ='d';  //2nd row 2nd column
       jaggedArray[1][2] ='e';   //2nd row 3rd column

       jaggedArray[2][0] ='f';
       jaggedArray[2][1] ='g';
       jaggedArray[2][2] ='h';
       jaggedArray[2][3] ='i';
       jaggedArray[2][4] ='j';
        /*
         * | a b |   //first row has 2 columns                 overall we have 3 rows as defined above
         * | c d e |    //second row has 3 columns
         * | f g h i j |  //third row has 5 columns
         */

        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]+" ");  //a b c d e f g h i j

            }
        }        
        System.out.print("\nLength of jagged array "+jaggedArray.length+"\n"); //Length of jagged array 3

        System.out.println("The element at 3rd row first column is "+jaggedArray[2][0]); //f
        //System.out.println("The element at 2nd row fourth column is "+jaggedArray[1][3]);   //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    }
}