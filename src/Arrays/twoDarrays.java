public class twoDarrays {
    public static void main(String[] args){
        int [][] arr=new int[2][4];  

        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[0][3]=35;
        
        arr[1][0]=50;
        arr[1][1]=60;
        arr[1][2]=70;
        arr[1][3]=80;

        /*
         * | 10 20 30 35 |
         * | 50 60 70 80 |
         */

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");  //10 20 30 35 50 60 70 80
            }
        }
        System.out.print("Length of 2D array "+arr.length+"\n");
        System.out.print("Length of 1st row "+arr[0].length+"\n"); //Length of 2D array 2
        System.out.print("Length of 2nd row "+arr[1].length+"\n"); //Length of 1st row 4
       


        int [][] marks={
            {12,13,15},
            {20,30,40},
            {60,70,30}
        };
        System.out.println(marks[0][0]); //12
        System.out.println(marks[2][0]); //60
        System.out.println(marks[1][2]); //40

        System.out.println("\nPrinting the 2D array: ");

        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks.length;j++){
                System.out.println(marks[i][j]+" ");  //12 13 15 20 30 40 60 70 30
            }
            /*12
            13
            15
            20
            30
            40
            60
            70
            30 */
        }


        
    }
    
}
