public class Player {
    int vampcoin; 
    int vamps;


    Player(int vampcoin, int vamps) {
        this.vampcoin = vampcoin;
        this.vamps = vamps;
    } 
    

    public static void vampChange(int vamps) {
    }

    public static void vampcoinChange(int vampcoin) {  
    }
    
    public static void vampCoinEngame(int vampcoin){
            System.out.println("You couldn't have lost all of your bread? Thats rule #1. game over slatt");
            System.exit(vampcoin);
    }

    public static void vampEngame(int vamps){
            System.out.println("You lost your fans smh, You are no longer the goat, GAME OVER");
            System.exit(vamps);
    }
}