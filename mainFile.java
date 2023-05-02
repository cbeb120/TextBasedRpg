import java.util.Scanner;
import java.util.Random;
import java.Util;

public class mainFile {
    public static void main(String[] args) {

        System.out.println();
        storyLine.intro();
        System.out.println();
        storyLine.mainEvent1();
        System.out.println();
        storyLine.mainEvent2();
        combatMethods.enemy1fight();

        if (combatMethods.battleWon1() == true) {

            System.out.println();
            storyLine.wonFight1();
            System.out.println();
            storyLine.mainEvent3();
            combatMethods.enemy2fight();

            if (combatMethods.battleWon2() == true) {

                storyLine.wonFight2();
                System.out.println();
                storyLine.mainEvent4();
                combatMethods.enemy3fight();

                if (combatMethods.battleWon3() == true) {

                    storyLine.wonFight3();
                    System.out.println();
                    storyLine.mainEvent5();
                    combatMethods.enemy4fight();
                } else {
                    System.out.println("YOU DIED...please rerun the main file");
                }
            } else {
                System.out.println("YOU DIED...please rerun the main file");
            }

        } else {
            System.out.println("YOU DIED...please rerun the main file");
        }

    }
}
