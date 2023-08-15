public class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public  void setHealth(int health){
        this.health = health;
    }
    public void move(){
        System.out.println("Overriden the child class");
    }
}

