public class Mushroom extends Character{
    private int regeMeter;

    public Mushroom(String name, int health, int regeMeter) {
        super(name, health);
        this.regeMeter = regeMeter;
    }

    @Override
    public void move() {
        System.out.println(getName()+" is moving");
        regeMeter++;
    }
    public void explode(Mario mario){
        if (regeMeter>=4){
            System.out.println(getName()+" is exploded");
         setHealth(getHealth()-2);
         System.out.println("Mario has "+getHealth()+" health now!!");
        }

    }
}
