public class BaseWorld extends Player {
    public BaseWorld(String name) {
        super(name);
    }
    // just a simple intro to the game!
    public void intro(){
        System.out.println("Welcom to the puzzle world!");
        System.out.println("I'm your guide and im here to help you in this world");
        System.out.println("Here you will try to solve puzzles " +
        "in a certtain amount of time.");
        System.out.println("You need to imput the puzzle code to solve each" +
        "puzzle");
        System.out.println("Each room will have clues and items to help solve puzzles");
        System.out.println("Each room you solve will give you a part of a code");
        System.out.println("Combine the parts of the code to finish the world");
        System.out.println("You will have access to shops to buy helpful items in each world");
        System.out.println("Lets get started with a pratice puzzle!");
    }
    // the first puzzle to get you started
    public boolean puzzle1(String a){
        String answer = ("String");
        if(a.equals(answer)){
            System.out.println("Good Job!");
            return true;
        }
        System.out.println("Thats not it");
        return false;
    }
    //the second slightly harder puzzle
    public boolean puzzle2(String b){
        String a2 = ("Helloz");
        if(b.equals(a2)){
            System.out.println("Good Job!");
            return true;
        }
        System.out.println("Thats not it");
        return false;
    }
    // the hardest puzzle (I think)
    public boolean puzzle3(String c){
        String a3 = ("qwerty");
        if(c.equals(a3)){
            System.out.println("Good Job!");
            return true;
        }
        System.out.println("Thats not it");
        return false;
    }
    // an array gussing game for extra health
    public boolean theGame(int w){
        int[] g = {1,7,8,2,3,4,5,6,0};
        if(w == g[4]){
            super.addHealth(50);
            return true;
        }
        return false;
    }
}
