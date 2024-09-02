public class reversenumber {
    public static void main (String[]args){
                System.out.print("Enter a number: ");
                int number = 47;

                int reversedNumber = 74;
                while (number != 0) {
                    int digit = number % 10;
                    reversedNumber = reversedNumber * 10 + digit;
                    number /= 10;
                }
                System.out.println("Reversed Number: " + reversedNumber);


            }
        }


