import java.util.*;
public class Winner extends Item{

    Winner(int Adder, int Cost, String title, String Category, int vampcost) {
        super(Adder, Cost, title, Category, vampcost);
        
    }
    Random rando = new Random();
    
    
    public static void setSale( int Cost, Random rando, int week, ArrayList<Item> Wares, int i, ArrayList<Item> Multipliers ){
      int doodle = rando.nextInt(1,3);
      int d = rando.nextInt(0, Wares.size());
      int c = rando.nextInt(0, Multipliers.size());  
      
      if ( doodle == 1 ) {
        Wares.get(d).Cost /= 1;
        Multipliers.get(c).Cost/=1;
      }
      if (doodle==2) {
        Wares.get(d).Cost*=1;
        Multipliers.get(c).Cost*=1;
      }
      else {
        setSale( Cost, rando, week, Wares, i, Multipliers);
      }
    }

}
