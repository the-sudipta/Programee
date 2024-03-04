import java.util.Scanner;

public class A5_T6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Start : ");
        int start = scanner.nextInt();

        System.out.print("Stop : ");
        int stop = scanner.nextInt();
        scanner.close();


        while (start <= stop){

            if(start != 4){
                System.out.println("Times Table of : "+start+" : ");
                int namta_position = 1;
                while (namta_position <= 10){
                    System.out.println(namta_position + " X "+start+" = "+(namta_position * start));
                    namta_position++;
                }

            }
            start++;
        }





    }


}
