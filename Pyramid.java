import java.util.Scanner; //Imports the scanner class

public class Pyramid {
    public static void main(String[] Args) {
        int Height; //Declares Height
        do {
            //Asks the user for an input for Height and takes the input in Height
            Scanner Input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            Height = Input.nextInt();
        } while (Height < 1); //Loops until Height is less than 1

        //Loops the number of Heights to create the Height. Also, x = 1 so it can be used for Width in the next line
        for (int x = 1; x <= Height; x++) {
            for (int y = 0; y < x; y++) { //Loops the until y reaches x to create the Width
                System.out.print('#'); //Creates the pyramid
            }
            System.out.println(); //Creates the next floor
        }
    }
}
