public class While_Test {


    public static void main(String[] args) {


        int line_count = 0;


        while(line_count < 10){

            System.out.print("I am Sorry ["+(line_count)+"] ");

            int react_count = 0;
            while (react_count < 5){
                System.out.print("❤");
                react_count++;
            }

            System.out.println();
            line_count++;
        }




    }

}
