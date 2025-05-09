import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        BaseWorld you = new BaseWorld(s);
        int f = 0;
        items i = new items(10);
        you.addItem(i);
        while(true){
            you.intro();
            System.out.println("Please enter a number 1-10, 0 ends the game");
            System.out.println("press 11 to answer puzzle 1,12 for 2, 13 for 3, and 14 for the guessing game!");
            int choice = input.nextInt();
            input.nextLine();
            if(choice == 1)
            {
                // this gives the answer for puzzle 1
                System.out.println("The answer for 1 is String!");
            }
            if(choice == 3){
                //uses and item
                you.useItem(i.getHealth());
            }
            if(choice == 5)
            {
                // this gives the answer for puzzle 2
                System.out.println("The answer for 2 is Helloz!");
            }
            if(choice == 8)
            {
                // this gives the answer for puzzle 3
                System.out.println("The answer for 3 is qwerty!");
            }
            if(choice == 11)
            {
                // this sets the answer for puzzle 1
                String a = input.nextLine();
                if(you.puzzle1(a) == true)
                {
                    f++;
                }
            }
            if(choice == 12)
            {
                // this sets the answer for puzzle 2
                String a = input.nextLine();
                if(you.puzzle2(a) == true)
                {
                    f++;
                }
            }
            if(choice == 13)
            {
                // this sets the answer for puzzle 3
                String a = input.nextLine();
                if(you.puzzle3(a) == true){
                    f++;
                }
            }
            if(choice == 14)
            {
                // this runs the guessing game needed to win
                int a = input.nextInt();
                if(you.theGame(a) == true){
                    f++;
                }
                else{
                    System.out.println("try again!");
                }
            }
            if(f == 4){
                System.out.println("Congrats you won!");
                break;
            }
            if(choice == 0){
                break;
            }
        }
        System.out.print("hi");
    }       
}