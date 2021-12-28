package practices.classes;

public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    public Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            while (this.fighter1.health > 0 && this.fighter2.health > 0) {
                System.out.println("========NEW ROUND==========");

                if (fighter1.willStart()) {
                    this.fighter1.health = this.fighter2.hit(fighter1);
                }
                else {
                    this.fighter2.health = this.fighter1.hit(fighter2);
                }

                if (isWin())
                    break;

                System.out.println(this.fighter1.health);
                System.out.println(this.fighter2.health);
            }
        } else {
            System.out.println("Athletes' weights are not suitable");
        }
    }

    boolean isCheck() {
        return (this.fighter1.weight >= minWeight && this.fighter2.weight <= maxWeight) &&
                (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight) ? true : false;
    }

    boolean isWin() {
        if (this.fighter1.health == 0) {
            System.out.println(fighter2.name + " won");
            return true;
        }

        if (this.fighter2.health == 0) {
            System.out.println(fighter1.name + " won");
            return true;
        }

        return false;
    }


}
