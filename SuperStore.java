import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperStore {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);

    Player Carti = new Player(10000, 10000);


     ArrayList<Item> Wares = new ArrayList<Item>();
    ArrayList<Item> Multipliers = new ArrayList<Item>();
    
    
   Item EP = new Item(10000,5000, "EP (Costs vampcoin, gives 10000 vamps)", "Action", 0);
   Action Lick = new Action(2000,0,"Lick (Costs vamps, gives 2000 vampcoin)", "Action",3000);
   Thingy Flicks = new Thingy(3000,0,"Flicks (gives 3000 vampcoin)", "Action",0);
   Item Stunt = new Item(2000,0,"Stunt (Costs vamps, give 2000 vampcoin)", "Action",1000);
   Thingy Bling = new Thingy(2,10000,"Bling (Costs vampcoin, multiplies current # of vamps by 2)", "Item",0);
   Item FashionDemon = new Item(2,0,"FashionDemon (Costs vamps, multiplies current # of vampcoin by 2)", "Item",20_000);
   Action WLR = new Action(10000,5000,"WLR (Costs vampcoin, gives 10000 vamps)", "Action",0);
   Winner DropAlbum = new Winner(0,200000,"Dropalbum  (Costs vampcoin)", "WinGame",0);

  int week = 0;
   
   Wares.add(Lick);
   Wares.add(EP);
   Wares.add(Flicks);
   Wares.add(Stunt);
   Wares.add(WLR);
   Wares.add(DropAlbum);
   Multipliers.add(Bling);
   Multipliers.add(FashionDemon);
   
   Random rando = new Random();
  int doodle = rando.nextInt(1,2);

   int d = rando.nextInt(0, Wares.size());
   int c = rando.nextInt(0, Multipliers.size());

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Welcome to Playboi Carti Simulator. You, Jordan Terrell Carter, need to drop your coveted 𝔑𝔞𝔯𝔠𝔦𝔰𝔰𝔦𝔰𝔱 album. HOWEVER, you're losing fans by the day! Grind for bread to release the Album!");

    
    displayStore(Wares, Carti, sc, week, Multipliers, c, d, doodle, rando);

    }
    public static void purchaseItem(ArrayList<Item> Wares, Player Carti, Scanner sc, int week,ArrayList<Item> Multipliers, int c, int d, int doodle, Random rando) {
      if(Carti.vampcoin<=0 || Carti.vamps<=0) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("You silly billy, you lost either all of your friends or your money. Game over");
        System.exit(0);
      }
      if(sc.hasNextInt()==false) {
        while(sc.hasNextInt()==false){
            System.out.println("This is not an option, please input one!");
            sc.next();
        }
    }
        int input = sc.nextInt();
      
        
        for(int i = 0 ; i < Multipliers.size(); i++ ) {
          
          if( input == i + (Wares.size()) ) {
            
           Carti.vampcoin-=Wares.get(i).Cost;
  
            System.out.println("You purchased something special!" );
             
          
          
            System.out.println("Your vampcoin is now " + Carti.vampcoin + " and your vamps now number at " + Carti.vamps);
            week+=1;
            displayStore(Wares, Carti, sc, week, Multipliers, c, d, doodle, rando);
  
        
  
          }
        }
  
        for(int i = 0 ; i < Wares.size(); i++ ) {
          
          if( input == i ) {
            Carti.vampcoin -= Wares.get(i).Cost;
            Carti.vamps += Wares.get(i).Adder;
            Carti.vamps-=Wares.get(i).vampcost;
            
            System.out.println("You purchased the something!" );
            
          
          
            System.out.println("Your vampcoin is now " + Carti.vampcoin + " and your vamps now number at " + Carti.vamps);
            week+=1;
            displayStore(Wares, Carti, sc, week, Multipliers, c, d, doodle, rando);
  
        
  
          }
        }
  
        
    }
    
    

    
    public static void displayStore(ArrayList<Item> Wares, Player Carti, Scanner sc, int week,ArrayList<Item> Multipliers, int c, int d, int doodle, Random rando) {
      System.out.println("Week " + week);
        System.out.println(" "); 
        System.out.println("Current Vampcoin: " + Carti.vampcoin + ", Current Vamps: " + Carti.vamps);
        System.out.println(" ");

      Wares.get(d).setSale(rando, Wares,  Multipliers);
      

      for(int i = 0 ; i < Wares.size(); i++ ) {      
        System.out.println( "[" + i + "]" + (Wares.get(i).Cost + Wares.get(i).vampcost) + " Cost:" + " {" + Wares.get(i).title + "}" + " (" + Wares.get(i).Category + ")");
        System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Special Store");
        System.out.println(" ");
        for(int i = 0 ; i < Multipliers.size(); i++ ) {      
          System.out.println( "[" + (i+6)+ "]" + (Multipliers.get(i).Cost +  Multipliers.get(i).vampcost) + " vampcoin:" + " {" + Multipliers.get(i).title + "}" + " (" + Multipliers.get(i).Category + ")");
          System.out.println(" ");
          }
      
          purchaseItem(Wares, Carti, sc, week, Multipliers, c, d, doodle, rando);
        }
      }
    
    