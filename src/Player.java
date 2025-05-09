import java.util.ArrayList;

public class Player{
    private ArrayList<items> itemList;
    private int coins;
    private int health;
    private String yourName;
    //Constuctor creates a name
    public Player(String name){
        coins = 0;
        health = 100;
        yourName = name;
        itemList = new ArrayList<items>();
    }
    //returns the items
    public ArrayList<items> inventory(){
        return itemList;
    }
    //returns the coins
    public int getCoins(){
        return coins;
    }
    public void setCoins(int newCoins){
        coins += newCoins;
    }
    // uses an item
    public int useItem(int i){
       int i2 = itemList.get(i).getHealth(); 
       health -= i2;
       return health;

    }
    // adds an item
    public void addItem(items i){
        itemList.add(i);
    }
    // adds health to your player
    public void addHealth(int h){
        health += h;
    }

}