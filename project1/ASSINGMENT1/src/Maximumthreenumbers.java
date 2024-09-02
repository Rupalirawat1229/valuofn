public class Maximumthreenumbers {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int num1 = 99;

        System.out.print("Enter the second number: ");
        int num2 = 90;

        System.out.print("Enter the third number: ");
        int num3 = 67;


        int max;
        if (num1 >= num2) {
            if (num1 >= num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else {
            if (num2 >= num3) {
                max = num2;
            } else {
                max = num2;
            }
        }


        System.out.println("The maximum of the three numbers is: " + max);

    }
}