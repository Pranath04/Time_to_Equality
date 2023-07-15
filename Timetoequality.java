package timetoequality;
import java.util.Scanner;
public class Timetoequality{
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements ");
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        //max value
        int max=FindMaximum(array,size);

        //minimum time
        int time=FindTime(array,size,max);

        System.out.println(time);

    }

    static int FindTime(int[] array, int size, int max) {
        int time=0;
        for(int element :array){
            time+=(max-element);
        }
        return time;
    }

     static int FindMaximum(int[] array, int size) {
        int max= Integer.MIN_VALUE;
        for(int iterator=0;iterator<size;iterator++){
            if(max<array[iterator]){
                max=array[iterator];
            }
        }
        return max;
    }
}