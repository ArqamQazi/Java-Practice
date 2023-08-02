package BaiscPractice.AccessModifier;

    class Cylinder{
        private int radius;
        private int height;

        public Cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
        public double surfaceArea(){
            return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
        }
        public double volume(){
            return Math.PI * radius * radius * height;
        }


    }

    class Rectangle{
        private int length;
        private int breadth;

        public Rectangle() {
            this.length = 4;
            this.breadth = 5;
        }

        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }

public class Q1 {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(9, 12);
        c1.setHeight(12);
        c1.setRadius(9);

        float h1 = c1.getHeight();
        float r1 = c1.getRadius();

        System.out.printf("%.2f\n", c1.surfaceArea());
        System.out.printf("%.2f\n", c1.volume());
    }
}
