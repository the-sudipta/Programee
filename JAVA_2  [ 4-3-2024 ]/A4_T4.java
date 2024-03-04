import java.util.Scanner;

public class A4_T4 {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer = ");
        int number = scanner.nextInt();

        int count = 0;
        while (number != 0){
            number = number / 10;
            count = count + 1;
        }

        System.out.println("Total digits = "+count);







    }




}
