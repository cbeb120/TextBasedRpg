package test;

public class combatMethods {
    private static int health = 100;
    private static int enemy1Health = 50;
    private static int enemy2Health = 75;
    private static int enemy3Health = 100;
    private static int enemy4Health = 125;
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
        if(health > 0){
            health = health - 10;
            System.out.println("The enemy hit you! You have taken damage.");
            viewHealth();
            }
        else{
            youDied();
            }
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
    public static void enemy1SwordHit(){
        enemy1Health = enemy1Health - 25;
        if( enemy1Health <= 0){
            battleWon();
        }
        else{
            viewEnemy1Health();
        }
    }
    //
    public static void viewEnemy2Health(){
        System.out.println("The enemies health is " + enemy2Health);
    }
    public static void enemy2Attack(){
        if(health > 0){
            health = health - 10;
            System.out.println("The enemy hit you! You have taken damage.");
            viewHealth();
            }
        else{
            youDied();
            }
    }
    public static void enemy2Hit(){
        enemy2Health = enemy2Health - 10;
        if( enemy2Health <= 0){
            battleWon();
        }
        else{
            viewEnemy2Health();
        }
    }
    public static void enemy2SwordHit(){
        enemy1Health = enemy2Health - 25;
        if( enemy2Health <= 0){
            battleWon();
        }
        else{
            viewEnemy2Health();
        }
    }
    //
    public static void viewEnemy3Health(){
        System.out.println("The enemies health is " + enemy3Health);
    }
    public static void enemy3Attack(){
        if(health > 0){
            health = health - 10;
            System.out.println("The enemy hit you! You have taken damage.");
            viewHealth();
            }
        else{
            youDied();
            }
    }
    public static void enemy3Hit(){
        enemy3Health = enemy3Health - 10;
        if( enemy3Health <= 0){
            battleWon();
        }
        else{
            viewEnemy3Health();
        }
    }
    public static void enemy3SwordHit(){
        enemy3Health = enemy3Health - 25;
        if( enemy3Health <= 0){
            battleWon();
        }
        else{
            viewEnemy3Health();
        }
    }
    //
    public static void viewEnemy4Health(){
        System.out.println("The enemies health is " + enemy4Health);
    }
    public static void enemy4Attack(){
        if(health > 0){
        health = health - 10;
        System.out.println("The enemy hit you! You have taken damage.");
        viewHealth();
        }
        else{
            youDied();
        }
    }
    public static void enemy4Hit(){
        enemy4Health = enemy4Health - 10;
        if( enemy4Health <= 0){
            battleWon();
        }
        else{
            viewEnemy4Health();
        }
    }
    public static void enemy4SwordHit(){
        enemy4Health = enemy4Health - 25;
        if( enemy4Health <= 0){
            battleWon();
        }
        else{
            viewEnemy4Health();
        }
    }


    
    public static void battleWon(){
        System.out.println("You defeated the enemy!");
    }

    public static void youDied(){
        if(health <= 0){
            System.out.println("YOU DIED!");
        }
    }
    





    
}
