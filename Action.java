import java.util.*;

public class Action extends Item {

    Action(int Adder, int Cost, String title, String Category, int vampcost) {
      super(Adder, Cost, title, Category, vampcost);
      
    }
    Random rando = new Random();
    
    
    
    public static void setSale( int Cost, Random rando, int week, ArrayList<Item> Wares, int i, ArrayList<Item> Multipliers ){
      int doodle = rando.nextInt(1,3);
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
        setSale( Cost, rando, week, Wares, i, Multipliers);
      }
    }

  }
