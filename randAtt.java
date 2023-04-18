import java.util.Random;

public class randAtt {

    public static void enemyAttack() {
        int max1 = 10;
        int min1 = 1;

        Random rand = new Random();
        int opt1 = rand.nextInt(max1 - min1) + min1;

        if (opt1 == 1) {
            System.out.println("You trip on your shoe, as you hit the ground the enemy body slams you: ");
        } else if (opt1 == 2) {
            System.out.println("The enemy swings at you connecting with your chest winding you in the process: ");
        } else if (opt1 == 3) {
            System.out.println("You miss a swing at the closest enemy, in response to this you get hit in the ankle: ");
        } else if (opt1 == 4) {
            System.out.println("Your pants fall down mid swing and you fall slamming into the ground: ");
        } else if (opt1 == 5) {
            System.out.println("in the midst of chaos you get hit in the head with a rock: ");
        } else if (opt1 == 6) {
            System.out.println(
                    "One of the enemies looks somehow cute to you, while you were confused another enemy trips you from behind: ");
        } else if (opt1 == 7) {
            System.out.println("An enemy sweeps your legs, you eat the dirt: ");
        } else if (opt1 == 8) {
            System.out.println("You catch a blow to the nether regions, you collapse to your knees: ");
        } else if (opt1 == 9) {
            System.out.println("You mistakenly overswing knocking you off balance, you get tackled: ");
        } else if (opt1 == 10) {
            System.out.println(
                    "You get swung at and perfectly dodge, you then get hit by a second attack you didnt see coming: ");
        }

    }

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
