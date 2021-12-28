package practices.classes.boxmatch;

public class Main2 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Muhammed Ali", 10, 112, 100, 30, 50);
        Fighter fighter2 = new Fighter("Mike Tyson", 20, 86, 92, 40, 50);

        Match match = new Match(fighter1, fighter2, 90, 125);
        match.run();
    }

}
