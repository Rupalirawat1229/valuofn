public class factorial {


        public static void main(String[] args) {


            System.out.print("Enter a number to find its factorial: ");
            int number = 56;


            long factorial = 1;


            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }


            System.out.println("The factorial of " + number + " is: " + factorial);


        }
    }

