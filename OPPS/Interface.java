public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

    }
}

interface ChessPlayer {
    void moves();

}

class Queen {
     public void moves() {
        System.out.println("up, down, left, right,diagonal(in all 4 direction)");

        
    }
}
 class Rook {
     public void moves() {
        System.out.println("up, down, left, right");

        
    }
}
 class King {
     public void moves() {
        System.out.println("up, down, left, right, diagonal ( by 1 step)");

        
    }
}