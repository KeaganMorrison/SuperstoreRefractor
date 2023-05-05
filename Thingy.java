import java.util.*;
public class Thingy extends Item {

    Thingy(int Adder, int Cost, String title, String Category, int vampcost) {
      super(Adder, Cost, title, Category, vampcost);
      
    }
    Random rando = new Random();
    int doodle = rando.nextInt(1,2);
    
    public static void setSale(int doodle, int Cost, Random rando, int week, ArrayList<Item> Wares, int i, ArrayList<Item> Multipliers ){
      int d = rando.nextInt(0, Wares.size());
      int c = rando.nextInt(0, Multipliers.size());  
      
      if ( doodle == 1 ) {
        Wares.get(d).Cost /= 2;
        Multipliers.get(c).Cost/=2;
      }
      if (doodle==2) {
        Wares.get(d).Cost*=2;
        Multipliers.get(c).Cost*=2;
      }
      else {
        setSale(doodle, Cost, rando, week, Wares, i, Multipliers);
      }
    }

  }