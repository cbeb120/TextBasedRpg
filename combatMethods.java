package test;

public class combatMethods {
    private static int health = 100;
    private static int enemy1Health = 50;
    public combatMethods(int health){
        //health = 100;
    }
    public static void beenHit(){
        health = health - 10;
        System.out.println(health);
    }
    public  static void viewHealth(){
        System.out.println("Your current health is " + health);
    }
    public static void addArmor(){
        health = health + 10;
        System.out.println(health);
    }
    public static void viewEnemy1Health(){
        System.out.println("The enemies health is " + enemy1Health);
    }
    public static void enemy1Attack(){
        health = health - 10;
        System.out.println("The enemy hit you! You have taken damage.");
        viewHealth();
    }
    public static void enemy1Hit(){
        enemy1Health = enemy1Health - 10;
        if( enemy1Health <= 0){
            battleWon();
        }
        else{
            viewEnemy1Health();
        }
    }
    public static void battleWon(){
        System.out.println("You defeated the enemy!");
    }





    
}
