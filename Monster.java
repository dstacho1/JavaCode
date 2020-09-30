public class Monster {

    public final String TOMBSTONE = "Here lies a dead monster";
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;
    public String name = "Big Monster";

    public Monster(int newHealth, int newAttack, int newMovement){
        this.health = newHealth;
        this.attack = newAttack;
        this.movement = newMovement;
    }

    //default constructor
    public Monster(){}

    public Monster(int newHealth){
        this.health = newHealth;
    }

    public Monster(int newHealth, int newAttack){
        this(newHealth); // calls the above constructor
        this.attack = newAttack;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int getMovement() {
        return movement;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setHealth(int decreaseHealth) {
        this.health = health - decreaseHealth;
        if (health < 0){
            alive = false;
        }
    }

    public void setHealth(double decrease){
        int intDecreaseHealth = (int) decrease;
        this.health = health - intDecreaseHealth;
        if (health < 0){
            alive = false;
        }
    }
}
