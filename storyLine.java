import java.util.Scanner;
import java.Util;

public class storyLine {

        public static void intro() {
                System.out.println("One morning you wake up to the roosters crow on your family farm.");
                System.out.println(
                                "You wake up happy and go about doing your normal chores for the day by tending to the animals in the barn and then checking on the crops in the field.");
                System.out.println(
                                "While you are out looking through the crops you stumble across an old worn down chest.");
                System.out.println(
                                "After breaking it open you find a set of knights' armor and a massive sword inside it.");
                System.out.println(
                                "You get happy making this lucky find, however its short lived as you have to finish your chores around the farm, for the mean time you put the chest in your house.");
                System.out.println();
        }

        public static void mainEvent1() {
                System.out.println(
                                "After working on the chores around the farm you decide to head to bed for the night, storing the chest underneath your floorboards that way its hidden.");
                System.out.println("While peacefully sleeping, you smell burning wood.");
                System.out.println(
                                "As you jolt upright from your bed you rush outside to see a bunch of bandits throwing torches at your house.");
                System.out.println(
                                "As soon as you exit your house you get hit in the head by a club and begin to blackout.");
                System.out.println(
                                "As you fade out of consciousness you yell at one of the bandits as they loot your house for all your belongings");
                System.out.println(
                                "You yell at the Bandit why are you doing this to which he replies by pointing at the sky.");
                System.out.println(
                                "you roll onto your back and look at the sky to see a massive figure break throught the clouds and douse your homestead in the intense heat of fire");
                System.out.println("As the flames eat away your beautiful home you pass out in the burning rubble.");
                System.out.println(
                                "When you come to, you start to cry and pound the ground in rage.");
                System.out.println(
                                "As you search through the rubble you manage to find some clothes and a small amount of personal belongings, unfortunately they are burnt by the fire");
                System.out.println(
                                "However while you are searching your house, under the floorboards you find the chest fully intact completely undamaged.");
                System.out.println("");

                System.out.println("1- Would you like to take the holy sword and armor for yourself?");
                System.out.println("2- Would you like to leave it there, I'm sure someone will come back for it.");
                System.out.println(
                                "3- Would you like to sell the sword and armor? I'm sure it would fetch a fancy price.");
                System.out.println("");

                Scanner scnr = new Scanner(System.in);

                if (scnr.nextInt() == 1) {
                        System.out.println(
                                        "As you pick up the sword a voice calls out from the heavens, Mighty hero you have been chosen to go on a valiant quest");
                        System.out.println("As you don the armor you feel stronger and bigger by the second.");
                        System.out.println(
                                        "The sword tells you its time to continue your quest and chase after the bandits.");
                        System.out.println("");

                } else if (scnr.nextInt() == 2) {
                        storyLine.badEnding1();

                } else {
                        System.out.println(
                                        "you pick up the chest and fasten some leftover rope to it that you found on the ground.");
                        System.out.println(
                                        "You decide that the easiest way to carry it is by making it into a backpack. Im sure selling it will be the best decision");
                        System.out.println("");

                }
        }

        public static void mainEvent2() {
                System.out.println(
                                "After making your decision, you decide the best course of action is to head to the closest town in order to get some information about the bandits that attacked your home.");
                System.out.println(
                                "Talespire is a town about 2 miles away from your home, as you reach the walls of the town you are exhausted by travel and the guards stop you at the gates.");
                System.out.println(
                                "As soon as you approach the gates the guards ask what your reason for entrance is, you exclaim that your house was burnt down and you are looking to get some info about the ones responsible for it.");
                System.out.println(
                                "The guards decide to let you pass, and as you walk into the town you hear a loud commotion as you see some thugs attacking a poor fruit vendor");
                System.out.println(
                                "You think it would be a smart decision to help the man seeing as they are bandits they might know what happened at your house. Wink Wink");
                System.out.println("");

                System.out.println("1- help the fruit vendor?");
                System.out.println("2- Nah im sure he can figure it out himself");
                System.out.println("3- I have more important matters to do (P.S. who even talks like this)");

                System.out.println("");

                Scanner scnr1 = new Scanner(System.in);

                if (scnr1.nextInt() == 1) {
                        System.out.println(
                                        "You step forward and provoke the bandits, they look rather annoyed that you step into the middle of their argument");
                        System.out.println("The bandits surround you and the battle begins!");
                        System.out.println("");

                } else if (scnr1.nextInt() == 2) {
                        System.out.println(
                                        "You decide this isn't your place to step in, you try to walk past and one of the bandits stops you.");
                        System.out.println("He looks you up and down and says Ive seen you before.");
                        System.out.println(
                                        "Before you can reply the bandits surround you and pull their weapons on you");
                        System.out.println("A fight begins!");
                        System.out.println("");
                } else {
                        System.out.println(
                                        "You walk through the crowd pushing bandits and even the poor fruit vendor out of the way");
                        System.out.println("The vendor, grabs your ankle and begs you to help him.");
                        System.out.println("You turn to face the bandits they are visibly angry after being shoved.");
                        System.out.println("You take a step forward in rage, drawing your sword and the fight begins.");
                        System.out.println("");
                }

        }

        public static void mainEvent3() {
                System.out.println(
                                "After defeating the bandits, and gaining some well needed information about the dragons whereabouts.");
                System.out.println(
                                "You decide its time to set off towards the castle at the center of all maps, Inkarnate.");
                System.out.println("Its said that the castle is built suspended in the center of a live volcano.");
                System.out.println(
                                "You leave the town of Talespire and set off in the direction of Inkarnate, after traveling on foot for several hours you decide to set up camp as night falls.");
                System.out.println(
                                "As you finish setting up camp along the road next to the treeline, you hear some rustling of leaves as four large wolves walk into the clearing.");
                System.out.println("The wolves foam at the mouth as they approach your camp.");
                System.out.println("What will you do?");
                System.out.println();

                System.out.println("1- Throw some food at them im sure they are hungry");
                System.out.println("2- Prepare to fight");
                System.out.println("3- Run...(I doubt you can outrun them, ... just an observation :)");

                System.out.println("");

                Scanner scnr2 = new Scanner(System.in);

                if (scnr2.nextInt() == 1) {
                        System.out.println(
                                        "You toss some food at the feet of the wolves, they start to fight over the food.");
                        System.out.println("You decide to try and run while the wolves are occupied.");
                        System.out.println(
                                        "Before you can escape you realize that one of the wolves didnt dive for the food you threw.");
                        System.out.println(
                                        "The lone wolf bites your ankle as you try to run and you are forced to fight!");
                        System.out.println();

                } else if (scnr2.nextInt() == 2) {
                        System.out.println(
                                        "You ready yourself for the fight thats about to ensue, as a wolf lunges at you.");
                        System.out.println();
                } else {
                        System.out.println(
                                        "You turn to run after seeing the wolves surround your camp, however as you turn a wolf chomps down onto your ankle.");
                        System.out.println("");
                }
        }

        public static void mainEvent4() {
                System.out.println("After your close call with the Wolves you set back on track towards the castle.");
                System.out.println(
                                "As the sun rises, as you walk along the road you see the sun bounce of the roof of a huge castle atop a huge mountain.");
                System.out.println(
                                "After traveling an additional five hours, you reach the base of the mountain-like volcano and start your ascent.");
                System.out.println("As you reach the peak of the volcano, you are met with a sweltering heat");
                System.out.println(
                                "Looking across the volcano you see a large castle, some of the walls are melted and scarred from constant heat damage.");
                System.out.println(
                                "As you take in the view you come across an old rickety rope bridge, it looks just as damaged as the castle.");
                System.out.println("Im suprised its lasted that long considering its wood and rope.");
                System.out.println(
                                "As you struggle to cross the bridge you can see that there are two suits of armor standing by the front entrance.");
                System.out.println(
                                "As you finally manage to get across the bridge, you step towards the door, but as you do you get blocked by two swords");
                System.out.println(
                                "The guards shift there heads towards you and in an echo like drone they tell you that you can't enter");
                System.out.println();

                System.out.println("1- Defeat the guards");
                System.out.println("2- Turn away and run");
                System.out.println("3- Move forward to rescue the princess");

                System.out.println("");

                Scanner scnr3 = new Scanner(System.in);

                if (scnr3.nextInt == 1) {
                        System.out.println("You step forward and prepare to take on the guards, The fight begins!");
                        System.out.println();
                } else if (scnr3.nextInt == 2) {
                        System.out.println(
                                        "Before you get the chance to turn tail and run the guards lunge at you, and the fight is on!");
                        System.out.println();
                } else {
                        System.out.println(
                                        "You try to walk through the guards weapons, however aas you duck forward one of them grabs you starting a fight.");
                        System.out.println();
                }
        }

        public static void mainEvent5() {
                System.out.println("Once you enter the castle, you see a massive spiral staircase ahead of you.");
                System.out.println(
                                "As you walk towards the stairs you hear a scream come from above, followed by the roar of the dragon.");
                System.out.println("As you ascend the steps the sound of beating wings can be heard from outside.");
                System.out.println(
                                "As you reach the top you walk into a bedroom with a beautiful woman screaming and pointing at the window");
                System.out.println("You look through the window and see a massive eyeball staring into your soul");
                System.out.println(
                                "Before you can react you see a claw grab the top of the window, just as quickly as you see it the roof gets torn off the top of the tower.");
                System.out.println(
                                "As the princess scrambles to get away, the dragon drops the top of the tower into the lava below.");
                System.out.println(
                                "it turns its head towards you, to which you notice a jagged crown carved from rock, he then bellows I am the mighty Berg I have terrorized these lands for centuries");
                System.out.println(
                                "Berg looks down on you and says I suppose whether your here for righteousness or not we must duel");
                System.out.println("Berg drops down onto the edges of the tower and the fight begins");

                System.out.println("1- will you protect the princess?");
                System.out.println("2- come on man its a princess");
                System.out.println("3- dude running at this point isnt even an option");

                Scanner scnr4 = new Scanner(System.in);
                if (scnr4.nextInt == 1) {
                        System.out.println("Good choice I expect nothing less of a mighty hero, The fight begins!");
                        System.out.println();

                } else if (scnr4.nextInt == 2) {
                        System.out.println(
                                        "I mean you weren't supposed to choose this, but I guess you did... anyways...The fight begins!");
                        System.out.println();
                } else {
                        System.out.println(
                                        "I thought the option was pretty self explanatory... but you chose it anywas huh I didnt actually expect you to choose this");
                        System.out.println("Anyways the fight begins!");
                        System.out.println();
                }
        }

        public static void wonFight1() {
                System.out.println(
                                "The last bandit falls to the ground as he coughs, he looks at you and gasps saying that he was sorry aand they didnt have a choice.");
                System.out.println(
                                "He tells you that the dragon ordered the bandits to attack your home because you found the holy sword.");
                System.out.println("As he slowly gasps for air he says that he can tell you where the dragon is");
                System.out.println(
                                "He says the dragon dwells in a castle at the center of all maps, the volcano castle Inkarnate.");
                System.out.println(
                                "There are many legends surrounding the castle and how it has never been successfully entered in centuries");
                System.out.println(
                                "The bandit then looks at you as his eyes begin to tear up, he says that you werent the only person attacked.");
                System.out.println("To make matters worse he says that the other victim was kidnapped");
                System.out.println(
                                "As he gulps his last breath of air he says the dragon captured the princess, he then falls limp succumbing to his injuries.");
        }

        public static void wonFight2() {
                System.out.println(
                                "The last wolf falls to the ground, exhausted by combat you take a moment to clean the blood from your self and gather your camp.");
                System.out.println(
                                "You think that another group of wild animals could attack you in your sleep and your not taking the chance.");
                System.out.println("");
        }

        public static void wonFight3() {
                System.out.println(
                                "Both guards crumple in defeat and fall against the walls of the castle.");
                System.out.println("You decide now is a good time to prepare yourself for what is about to happen.");
        }

        public static void badEnding1() {

                System.out.println(
                                "You leave the sword and armor where it is deciding it's ugly and doesn't suit you, you stash them back under the floorboards.");
                System.out.println(
                                "As you walk away from the chest a dark figure in the woods whispers at you to come here.");
                System.out.println("You walk over to the man to hear what he has to say.");
                System.out.println("The man introduces himself as Lilitu.");
                System.out.println("He then explains to you about the horrors of the dragon who rules over Inkarnate.");
                System.out.println(
                                "Lilitu then offers you a special dark sword that he claims will be able to slay the dragon.");
                System.out.println(
                                "He convinces you to take the sword and slay the dragon and become the new ruler of Inkarnate.");
                System.out.println(
                                "You head for your farm to begin your quest to slay the dragon, you decide to start with finding out where those bandits went.");

        }

        public static void badEnding2() {
                System.out.println(
                                "After slaying the dragon with the dark sword you walk over to it's body and pick up it's crown.");
                System.out.println(
                                "You put on the crown and a dark mysterious mist starts to rise from you and the sword.");
                System.out.println(
                                "The mist then shoots into you and you start to feel more powerful and stronger than ever before.");
                System.out.println("The first thing you do with the power is create an army of unstoppable demons.");
                System.out.println(
                                "Then you send the army out into the land to destroy everything the dragon worked so hard for.");
                System.out.println(
                                "You sit on the thrown that overlooks Inkarnate and listen to the destruction with gloomy skies and a grin on your face knowing you won and nothing can stop you.");
                System.out.println();
                System.out.println("THE END.");
        }

}
