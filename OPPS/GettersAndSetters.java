

public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

     class Pen {
        private String color;
        private int tip;

        String getColor() {
            return this.color; // this is a keyword in java.this means current object
        }

        int getTip() {
            return this.tip;
        }

        /**
         * setters
         * @param newColor
         */
        void setColor(String newColor) {
            this.color = newColor;
        }

        void setTip(int tip) {
            this.tip = tip;
        }
    }
