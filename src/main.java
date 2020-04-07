import java.util.ArrayList;

public class main {
    public static void main(String [] args){

        ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
        ArrayList1.add(100);
        ArrayList1.add(500);
        ArrayList1.add(900);

        ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
        ArrayList2.add(800);
        ArrayList2.add(600);
        ArrayList2.add(300);

        ArrayList<Integer> ArrayList3 = new ArrayList<Integer>();
        ArrayList3.add(400);
        ArrayList3.add(700);
        ArrayList3.add(200);

        ArrayOrganizer organizer = new ArrayOrganizer();
        ArrayList<Integer> result = organizer.concatAndSort(ArrayList1, ArrayList2, ArrayList3);
        System.out.println(result);
        Player first = new Player("Tom");
        Player second = new Player("Jhon");
        Player third = new Player("James");
        Player forth = new Player("Henry");
        Die die = new Die();
        for (int i = 0; i < 5; i++){
            first.addScore(die.rollDie());
            second.addScore(die.rollDie());
            third.addScore(die.rollDie());
            forth.addScore(die.rollDie());
        }
        System.out.println(first.getName() + " has " + first.getScore() + " points.");
        System.out.println(second.getName() + " has " + second.getScore() + " points.");
        System.out.println(third.getName() + " has " + third.getScore() + " points.");
        System.out.println(forth.getName() + " has " + forth.getScore() + " points.");


    }


}