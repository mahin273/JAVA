class Mario extends Character{
private int powerMeter;
    public Mario(int powerMeter,String name, int health) {
        super(name, health);
        this.powerMeter= powerMeter;
    }

    @Override
    public void move() {
        if(powerMeter>0){
            System.out.println(getName()+" is moving");
        }
        else if(powerMeter<=0){
            System.out.println("Out of stemina.Can't jump");
        }
    }
}
