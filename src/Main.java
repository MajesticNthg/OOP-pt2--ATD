class Hero {
    String heroName; // имя героя
    String attribute; // атрибут героя
    int health; // показатель здоровья
    int strength; //  показатель силы
    int agility; // показатель ловкости
    int intelligence; // показатель интеллекта
    double moveSpeed; // показатель скорости бега
    double armor; // показатель брони
    int damage; // показатель урона

    Hero(String n, int h)
    {
        this.heroName = n;
        this.attribute = "Agility";
        this.strength = 15;
        this.agility = 20;
        this.intelligence = 16;
        this.moveSpeed = 300;
        this.armor = 5;
        this.damage = 54;
        this.health = h;

    }
    void run(double new_moveSpeed) {
        this.moveSpeed = new_moveSpeed;
    }

    void walking() { this.moveSpeed = 300; }
}
class Creep {
    String creepName; // имя монстра
    int health; // показатель здоровья
    int damage; // показатель урона
    int armor; // показатель брони
    int moveSpeed; // показатель скорости бега

    Creep(String n, int h) {
        this.creepName = n;
        this.health = h;
        this.damage = 30;
        this.armor = 1;
        this.moveSpeed = 290;
    }
    void amplify_damage() { this.damage = 60; }
    void normal_damage() {this.damage = 30; }

}
class Neutral_Creep {
    String neutralCreepName; // имя нейтральных монстров
    int tier; // класс нейтрального монстра
    int health; // показатель здоровья
    int damage; // показатель урона
    int armor; // показатель брони
    int moveSpeed; // показатель скорости бега

    Neutral_Creep(String n, int t, int h) {
        this.neutralCreepName = n;
        this.tier = t;
        this.health = h;
        this.damage = 50;
        this.armor = 3;
        this.moveSpeed = 290;
    }

    void upgrade() {this.health += 100; this.damage += 50; }

}
public class Main {
    public static void main(String[] args) {
        Hero Axe = new Hero("Axe", 560);
        Axe.run(400);
        Axe.walking();

        Creep Range = new Creep("Range", 200);
        Range.amplify_damage();
        Range.normal_damage();

        Neutral_Creep Wolf = new Neutral_Creep("Wolf", 2, 400);
        Wolf.upgrade();
    }
}