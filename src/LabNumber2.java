import java.util.Scanner;

/**
 * Created by TACasey-Calhoun on 7/11/2017.
 */
public class LabNumber2 {
    public static void main(String[] args) {
        int userNum;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a grade between 1 and 100: ");
        userNum = scan.nextInt();


        if ((userNum > 60) && (userNum % 2 == 1)) {
            System.out.println(userNum + ":" + "Odd and over 60");
        }

        if ((userNum > 60) && (userNum % 2 == 0)) {
            System.out.println(userNum + ":" + "Even");
        }

        if ((userNum % 2 == 0) && (userNum >= 2) && (userNum <= 25)) {
            System.out.println("Even and less than 25.");
        }

        if ((userNum % 2 == 0) && (userNum >= 26) && (userNum <= 60)) {
            System.out.println("Even");
        }


        if ((userNum < 60) && (userNum % 2 == 1)) {
            System.out.println(userNum + ":"+ "Odd and less than 60");
        }
     }
  }


