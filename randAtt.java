import java.util.Random;

public class randAtt {

    public static void randomAttack1() {

        int max = 10;
        int min = 1;

        Random random = new Random();
        int opt = random.nextInt(max - min) + min;

        if (opt == 1) {
            System.out.println("You pull the enemy in close enough to punch him in the gut: ");
        } else if (opt == 2) {
            System.out.println("The enemy runs at you, however on its way over it trips on a rock: ");
        } else if (opt == 3) {
            System.out.println(
                    "You swing at the enemy in front of you, you trip on your own feet and tackle the enemy: ");
        } else if (opt == 4) {
            System.out.println("You miss your initial attack but drop your weapon on the enemy's foot: ");
        } else if (opt == 5) {
            System.out.println("You throw a rock you found lying on the ground, it nails the enemy in the face: ");
        } else if (opt == 6) {
            System.out.println("You swing at the enemy netx to you, you hit him so hard in the chest hes winded: ");
        } else if (opt == 7) {
            System.out.println("You attempt to grab the enemy, you instead crush them under your weight: ");
        } else if (opt == 8) {
            System.out.println("You slash the enemies in front of you: ");
        } else if (opt == 9) {
            System.out.println("You attempt to tickle your enemy mercilessly with a feather duster.");
            System.out.println(
                    "As the fluffy feathers gently caress their skin, they burst into uncontrollable fits of laughter, they then drop to the ground: ");
        } else if (opt == 10) {
            System.out.println("You sweep the legs of your adversary: ");
        }
    }
}
