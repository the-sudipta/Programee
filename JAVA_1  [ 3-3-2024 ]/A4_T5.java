import java.util.Scanner;

public class A4_T5 {


    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer = ");
        int number = scanner.nextInt();

        String numberString = Integer.toString(number);

        for(int i=0; i< numberString.length(); i++){
            System.out.print(numberString.charAt(i));
            if(i<numberString.length() - 1){
                System.out.print(", ");
            }
        }


    }




}
