/**
 * dynamic_Array
 */
// importing package
import java.io.*;

public class dynamic_Array {

    //capacity of array
    static int capacity;
    // array
    static int array[];
    //array index
    static int currentIndex;
    
    // dynamic function
    public static void dynamic(){
        int tempArray[] = null;

        if(capacity==currentIndex)
        {
            tempArray=new int[capacity*2];
        }
        for (int i = 0; i < capacity; i++) {
            tempArray[i]=array[i];
        }
        array=tempArray;
        capacity=capacity*2;
    }


    // array functions
    // add element to array function
    public static void add(int num){
        if(capacity==currentIndex){
            dynamic();
        }
        array[currentIndex]=num;
        currentIndex++;
    }
    // print array
    public static void print(){
        System.out.print("Array element: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // index functions
    public static void index(int index){
        System.out.println("Index: "+index+" Array Element: "+array[index]);
    }

    // constructor
    public dynamic_Array(){
        capacity=5;
        array= new int[capacity];
        currentIndex=0;
    }

    public static void main(String[] args)throws IOException {

        //constructor
        dynamic_Array obj=new dynamic_Array();

        //Buffer object
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        // user option input
        int input;int num; boolean cond=true;
        while(cond){
            System.out.println("Chose the options:");
            System.out.println("1. Add element to array");
            System.out.println("2. Print array elements");
            System.out.println("3. Indexing of array elements");
            System.out.println("4. Close");

            System.out.print("Your input: ");
            input=Integer.parseInt(br.readLine());
            System.out.println("\n");
            switch (input) {
                case 1:
                    System.out.print("Enter your number: ");
                    num=Integer.parseInt(br.readLine());
                    obj.add(num);
                    break;
                case 2:
                    obj.print();
                    break;
                case 3:
                    System.out.print("Enter your Index: ");
                    num=Integer.parseInt(br.readLine());
                    obj.index(num);
                    break; 
                case 4:
                    cond=false;
                    break;
                default:
                    System.out.println("chose vaild options");
                    break;
            }
        }
    }
}