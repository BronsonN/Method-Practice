import java.util.Scanner;

public class Exercise06_37 {


    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter an Integer: ");
    int number = keyboard.nextInt();

    System.out.print("Enter the width: ");
    int width = keyboard.nextInt();

    format(number, width);

}

public static void format(int number, int width) {

    String num = String.valueOf(number);
    //String wid = String.valueOf(width);


      if(width > num.length()) {
        for(int count = 2; count < width ; count++) {
          System.out.print("0");
        }
        System.out.print(num);
      }
      else {
        System.out.print("The formatted number is " +num);
      }

}
}
