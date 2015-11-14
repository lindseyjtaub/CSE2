/*
Lindsey Taub
CSE2
lab12
This code creates an array with a random amount of rows each with a random length.
It then finds the array row with the least amount of numbers in it.
Then it finds the largest number within the whole array.
Then it finds the array row with the most even number.
It then prints out the array and the above results.
*/
public class ArrayManipulation{
    

    public static int[][] raggedArray(){
        int n=(int)((Math.random()*11) +10);
        int[][] array = new int[n][];
        int m = 0;
        int total=0;
        for(int col=0;col<n; col++){
            m =(int)((Math.random()*11) +10);
            array[col] = new int[m];
            for(int length=0; length<array[col].length; length++){
            array[col][length] =(int)((Math.random()*2001) -1000 );
            
            }//end of inner for
        } //end of outer for
        return array;
    }//end of raggedArray method
    
    public static void printArray(int[][] array){
        for(int col=0; col<array.length; col++){
            System.out.print(col + ": ");
            for (int length=0; length<array[col].length; length++){
            System.out.print(array[col][length] + " ");
            }//end of inner for
            System.out.println(" ");
            System.out.println(" ");
         }//end of outter for        
            
    }// end of print array
    public static void printArray(int[] array){
        for(int j=0; j<array.length; j++){
            System.out.print(array[j] + " ");
        }//end of for
    }//end of print
    
    public static void findSmallest(int[][] array){
        int small= 20;
        int num=0;
        for(int j=0; j<array.length; j++){
            if(array[j].length<small){
            small=array[j].length;
            num=j;
            }//end of if
        }//end of for
        System.out.println("");
       System.out.println("smallest array: " + num);
    }//end of findSmallest
    
    public static void findLargest(int[][] array){
        int large= array[0][0];
        int col=0;
        int length=0;
        for(int j=0; j<array.length; j++){
            for(int k=0; k<array[j].length; k++){
                if(array[j][k]>large){
                    col=j;
                    length=k;
                    large=array[col][length];
                }//end of if
            }//end of inner for
        }//end of outter for
        System.out.println("largest number in all arrays: " + large);
    }//end of findLargest
    
    public static void mostEven(int[][] array){
        int even=0;
        int end=0;
        for (int j=0; j<array.length; j++){
            int temp=0;
            for(int k=0; k<array[j].length; k++){
                if (array[j][k]%2==0){
                    temp++;
                }//end of inner if
            }//end of inner for
            if(temp>even){
                even=temp;
                end=j;
            }//end of outter if
        }//end of outter for
        System.out.println("most even array: " + end);
    }//end of mostEven
    
    public static void main(String[] args){
        int[][] Array= raggedArray();
        printArray(Array);
        findSmallest(Array);
        findLargest(Array);
        mostEven(Array);
    }//end of main

}//end of class