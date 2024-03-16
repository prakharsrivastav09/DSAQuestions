import java.util.Arrays;

public class scratch_51 {
    public static void main(String[] args) {
        int FirstInt = 9;
        int SecondInt = FirstInt;
      //Printing value
       System.out.println("The First int value is : " + FirstInt);
        System.out.println("The Second int value is : " + SecondInt);
      SecondInt = SecondInt + 1;
      //Printing value _+1
       System.out.println("The New First int value is : " + FirstInt);
       System.out.println("The New Second int value is : " + SecondInt);
//        //Print Array
      int[] myFirstArray = new int[7];
       int[] mySecondArray = myFirstArray;
   System.out.println("The First Array is : " + Arrays.toString(myFirstArray));
    System.out.println("The Second Array is : " + Arrays.toString(mySecondArray));
   //Printing Update Array
     mySecondArray[5] = 1;
      System.out.println("The update First Array is : " + Arrays.toString(myFirstArray));
      System.out.println("The update Second Array is : " + Arrays.toString(mySecondArray));
//        //Printing Modify Array
          modifyArray(mySecondArray);
        System.out.println("The modify First Array is : " + Arrays.toString(myFirstArray));
        System.out.println("The modify Second Array is : " + Arrays.toString(mySecondArray));
//        //printing new array
       mySecondArray = new int[7];
       mySecondArray[0] = 10;
      System.out.println("The new  First Array is : " + Arrays.toString(myFirstArray));
      System.out.println("The new  Second Array is : " + Arrays.toString(mySecondArray));
  }
   //Function for new array
        public static void modifyArray(int[] array){

        array[2] = 1;
        }
   }