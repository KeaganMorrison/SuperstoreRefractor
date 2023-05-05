import java.util.*;
public class Thingy extends Item {

    Thingy(int Adder, int Cost, String title, String Category, int vampcost) {
      super(Adder, Cost, title, Category, vampcost);
      
    }
    Random rando = new Random();
    int doodle = rando.nextInt(1,2);
    
    @Override
    public  void setSale( Random rando, ArrayList<Item> Wares, ArrayList<Item> Multipliers ){
      int doodle = rando.nextInt(1,3);
      int d = rando.nextInt(0, Wares.size());
      int c = rando.nextInt(0, Multipliers.size());  
      
      if ( doodle == 1 ) {
        Wares.get(d).Cost /= 2;
        Multipliers.get(c).Cost/=2;
        System.out.println("Special Action sale on " + Wares.get(d).title + " and " + Multipliers.get(c).title + "!");
        System.out.println(" ");
        
      }
      if (doodle==2) {
        Wares.get(d).Cost*=2;
        Multipliers.get(c).Cost*=2;
        System.out.println("Wuh oh, the price of the Action  " + Wares.get(d).title + " and " + Multipliers.get(c).title + " went way up!");
        System.out.println(" ");
      }
     
    }

  }
