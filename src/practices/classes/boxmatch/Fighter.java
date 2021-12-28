package practices.classes.boxmatch;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    int chance;

    public Fighter(String name, int damage, int health, int weight, double dodge, int chance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if (this.dodge >= 0 && this.dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

        if (this.chance >= 0 && this.chance <= 100) {
            this.chance = chance;
        } else {
            this.chance = 0;
        }

    }

    public int hit(Fighter fighter) {
        System.out.println(this.name + " => " + fighter.name + " " + this.damage);

        if (fighter.isDodge()) {
            System.out.println(fighter.name + " blocked the hit");
        } else {
            fighter.health -= this.damage;
        }

        if (fighter.health <= 0) {
            return 0;
        }

        return fighter.health;
    }

    public boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean willStart() {
        double rand = Math.random() * 100;
        return this.chance < rand;
    }
}
