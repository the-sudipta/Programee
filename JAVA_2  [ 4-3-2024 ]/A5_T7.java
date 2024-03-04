import java.util.Scanner;

public class A5_T7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Starting number (inclusive) : ");
        int start = scanner.nextInt();

        System.out.print("Enter Ending number (inclusive) : ");
        int end = scanner.nextInt();

        System.out.print("Enter the divisor : ");
        int divisor = scanner.nextInt();

        for (int i = start; i<=end; i++){
            int product = 1;
            int temp = i;
            while(temp != 0){
                int digit = temp % 10;
                product = product * digit;
                temp = temp / 10;
            }
            if((product % divisor) == 0){
                System.out.print(product + " ");
            }


        }



    }



}
