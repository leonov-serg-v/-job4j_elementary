package ru.job4j.condition;

public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Point another) {
            return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
        }

        public static void main(String[] args) {
            Point first = new Point(0, 0);
            Point second = new Point(0, 2);
            double result = first.distance(second);
            System.out.println(result);
        }
}
