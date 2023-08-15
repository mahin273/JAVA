public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario(3,"Mario Mario",10);
        Mushroom mushroom = new Mushroom("Goomba",10,3);

        for (int i=0;i<3;i++){
            mario.move();
        }
        System.out.println();
        for (int i=0;i<3;i++){
            mushroom.move();
        }
        mushroom.explode(mario);
    }

}