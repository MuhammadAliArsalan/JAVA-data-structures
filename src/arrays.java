public class arrays{
    public static void main(String [] args){
        int [] marks={10,20,30,40,50};
        double [] GPAarrays=new double[5];

        GPAarrays[2]=2.90;
        GPAarrays[3]=3.00;

        for(int i=0;i<GPAarrays.length;i++){  //length is a property of the array that returns the number of elements in the array.
            System.out.println(GPAarrays[i]); 

            /*0.0
            0.0
            2.9
            3.0
            0.0 */
        }
        System.out.println(marks[0]);  //10

        System.out.println(GPAarrays);  //[D@36baf30c  // this is the reference of the array in the memory.

        for(int i:marks){            // for of loop
            System.out.println(i);  //10 20 30 40 50
        }

        //search an element in array
        int search=30;
        for(int i=0;i<marks.length;i++){
            if(marks[i]==search){
                System.out.println("Element found at index: "+i);  //Element found at index: 2
                  
            }
            else{
                System.out.println("Element not found "+i);  //Element not found at index: 0 1 3 4
            }
        }

        //largest element in array

        int[] newMarksArray={12,-3,7,12,10};

        int res=Integer.MIN_VALUE;  //this is the smallest value of integer in java.
        for(int i=0;i<newMarksArray.length;i++){
            if(newMarksArray[i]>res){
                res=newMarksArray[i];
            }

        }
        System.out.println("The largest element in the array is: "+res);  //The largest element in the array is: 12

        //reverse print an array
        int[] marks2={89,78,72,34,89,100};

        for(int i=marks2.length-1;i>0;i--){         // i initially stores 6, then 5,4,3,2,1,0.
            System.out.println(marks2[i]);  //100 89 34 72 78 89
        }

        //sum of array;
        int sum=0;
        for(int i=0;i<marks2.length;i++){
            sum=sum+marks2[i];
        }
        System.out.println("The sum of the array is: "+sum);  //The sum of the array is: 462


    }
}