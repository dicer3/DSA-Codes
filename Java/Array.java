
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0;i<size; i++){
            System.out.println("enter array at index "+i);
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<size; i++){
           System.out.println("number at index "+i+" "+numbers[i]);
        }
    }
}