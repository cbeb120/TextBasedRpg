import java.Util;
import java.util.Scanner;

public class storyLine {

    public static void main(String[] args) {

        System.out.println("One morning you wake up to the rooster’s crow on your family farm.");
        System.out.println(
                "You wake up happy and go about doing your normal chores for the day by tending to the animals in the barn and then checking on the crops in the field.");
        System.out.println("While you are out looking through the crops you stumble across an old worn down chest.");
        System.out.println("After breaking it open you find a set of knights' armor and a massive sword inside it.");
        System.out.println();

        System.out.println("1- Would you like to take the holy sword and armor for yourself?");
        System.out.println("2- Would you like to leave it there, I'm sure someone will come back for it.");
        System.out.println("3- Would you like to sell the sword and armor? I'm sure it would fetch a fancy price.");

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        if (test == 1) {
            System.out.println("This passes the test");
        } else {
            System.out.println("Wrong test input");
        }

    }

}
