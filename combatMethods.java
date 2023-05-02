
import java.util.Random;
import java.util.Scanner;

public class combatMethods {
    private static int health = 100;
    private static int enemy1Health = 50;
    private static int enemy2Health = 75;
    private static int enemy3Health = 100;
    private static int enemy4Health = 125;

    // private int opt = 0;
    public combatMethods(int health) {
        // health = 100;
    }

    public static void restoreHealth() {
        health = 100;
    }

    public static void beenHit() {
        health = health - 10;
        // System.out.println(health);
    }

    public static void viewHealth() {
        System.out.println();
        System.out.println("Your current health is " + health);
    }

    public static void addArmor() {
        health = health + 10;
        System.out.println();
        System.out.println(health);
    }

    public static void viewEnemy1Health() {
        System.out.println();
        System.out.println("The enemies health is " + enemy1Health);
    }

    public static void enemy1Attack() {
        if (health > 0) {
            health = health - 10;
            System.out.println();
            System.out.println("The enemy hit you! You have taken damage.");
            viewHealth();
        } else {
            youDied();
        }
    }

    public static void enemy1Hit() {
        enemy1Health = enemy1Health - 10;
        if (enemy1Health <= 0) {
            battleWon1();
        } else {
            System.out.println();
            System.out.println("You have done damage to the enemy!");
            viewEnemy1Health();
        }
    }

    public static void enemy1SwordHit() {
        enemy1Health = enemy1Health - 25;
        if (enemy1Health <= 0) {
            battleWon1();
        } else {
            System.out.println();
            System.out.println("You hit the enemy with your sword, nice hit!");
            viewEnemy1Health();
        }
    }

    public static void enemy1fight() {
        restoreHealth();
        while (health >= 1 && enemy1Health >= 1) {
            Scanner scanner = new Scanner(System.in);
            viewHealth();
            viewEnemy1Health();
            int temp = randAtt.randomAttack1();
            if (temp >= 1 && temp <= 10) {
                enemy1Hit();
            } else {
                beenHit();
            }
            System.out.println();
            System.out.println("Press any key to continue the fight:");
            boolean response = scanner.hasNext();
            if (response == true && enemy1Health > 0 && health > 0) {
                continue;
            }

        }

    }

    public static void enemy2fight() {
        restoreHealth();
        while (health >= 1 && enemy2Health >= 1) {
            Scanner scanner = new Scanner(System.in);
            viewHealth();
            viewEnemy2Health();
            int temp = randAtt.randomAttack1();
            if (temp >= 1 && temp <= 10) {
                enemy2Hit();
            } else {
                beenHit();
            }
            System.out.println();
            System.out.println("Press any key to continue the fight:");
            boolean response = scanner.hasNext();
            if (response == true && enemy2Health > 0 && health > 0) {
                continue;
            }

        }

    }

    public static void enemy3fight() {
        restoreHealth();
        while (health >= 1 && enemy3Health >= 1) {
            Scanner scanner = new Scanner(System.in);
            viewHealth();
            viewEnemy3Health();
            int temp = randAtt.randomAttack1();
            if (temp >= 1 && temp <= 10) {
                enemy3Hit();
            } else {
                beenHit();
            }
            System.out.println();
            System.out.println("Press any key to continue the fight:");
            boolean response = scanner.hasNext();
            if (response == true && enemy3Health > 0 && health > 0) {
                continue;
            }

        }

    }

    public static void enemy4fight() {
        restoreHealth();
        while (health >= 1 && enemy4Health >= 1) {
            Scanner scanner = new Scanner(System.in);
            viewHealth();
            viewEnemy4Health();
            int temp = randAtt.randomAttack1();
            if (temp >= 1 && temp <= 10) {
                enemy4Hit();
            } else {
                beenHit();
            }
            System.out.println();
            System.out.println("Press any key to continue the fight:");
            boolean response = scanner.hasNext();
            if (response == true && enemy4Health > 0 && health > 0) {
                continue;
            }

        }

    }

    //
    public static void viewEnemy2Health() {
        System.out.println();
        System.out.println("The enemies health is " + enemy2Health);
    }

    public static void enemy2Attack() {
        if (health > 0) {
            health = health - 10;
            System.out.println();
            System.out.println("The enemy hit you! You have taken damage.");
            viewHealth();
        } else {
            youDied();
        }
    }

    public static void enemy2Hit() {
        enemy2Health = enemy2Health - 10;
        if (enemy2Health <= 0) {
            battleWon2();
        } else {
            System.out.println();
            System.out.println("You hit the enemy!");
            viewEnemy2Health();
        }
    }

    public static void enemy2SwordHit() {
        enemy1Health = enemy2Health - 25;
        if (enemy2Health <= 0) {
            battleWon2();
        } else {
            viewEnemy2Health();
        }
    }

    public static void viewEnemy3Health() {
        System.out.println();
        System.out.println("The enemies health is " + enemy3Health);
    }

    public static void enemy3Attack() {
        if (health > 0) {
            health = health - 10;
            System.out.println();
            System.out.println("The enemy hit you! You have taken damage.");
            viewHealth();
        } else {
            youDied();
        }
    }

    public static void enemy3Hit() {
        enemy3Health = enemy3Health - 10;
        if (enemy3Health <= 0) {
            battleWon3();
        } else {
            System.out.println();
            System.out.println("You hit the enemy!");
            viewEnemy3Health();
        }
    }

    public static void enemy3SwordHit() {
        enemy3Health = enemy3Health - 25;
        if (enemy3Health <= 0) {
            battleWon3();
        } else {
            viewEnemy3Health();
        }
    }

    //
    public static void viewEnemy4Health() {
        System.out.println();
        System.out.println("The enemies health is " + enemy4Health);
    }

    public static void enemy4Attack() {
        if (health > 0) {
            health = health - 10;
            System.out.println();
            System.out.println("The enemy hit you! You have taken damage.");
            viewHealth();
        } else {
            youDied();
        }
    }

    public static void enemy4Hit() {
        enemy4Health = enemy4Health - 10;
        if (enemy4Health <= 0) {
            battleWon4();
        } else {
            System.out.println();
            System.out.println("You hit the enemy!");
            viewEnemy4Health();
        }
    }

    public static void enemy4SwordHit() {
        enemy4Health = enemy4Health - 25;
        if (enemy4Health <= 0) {
            battleWon4();
        } else {
            viewEnemy4Health();
        }
    }

    public static boolean battleWon1() {
        if (health > 0 && enemy1Health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean battleWon2() {
        if (health > 0 && enemy2Health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean battleWon3() {
        if (health > 0 && enemy3Health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean battleWon4() {
        if (health > 0 && enemy4Health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void youDied() {
        if (health <= 0) {
            System.out.println();
            System.out.println("YOU DIED!");
        }
    }

}
