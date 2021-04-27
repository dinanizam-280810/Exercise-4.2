package main2;

public class Main2 {

    public static class Fruits {

        String name, color;
        double weight;

        public Fruits(String name) {
            this.name = name;
            System.out.println("Fruit constructor is invoked");
        }
    }

    public static class Apple extends Fruits {

        public Apple(String name, double weight) {
            super(name);
            this.weight = weight;
            System.out.println("Apple constructor is invoked");
            System.out.println(this.name);
            System.out.println("weight is " + this.weight + " kg");
        }
    }

    public static class Durian extends Fruits {

        public Durian(String name, String color, double weight) {
            super(name);
            this.color = color;

            this.weight = weight;
            System.out.println("Durian constructor is invoked");
            System.out.println(this.name + "." + "The color inside is " + this.color);

            System.out.println(this.name);
            System.out.println("weight is " + this.weight + " kg");
        }
    }

    public static class watermelon extends Fruits {

        public watermelon(String name, String color, double weight) {
            super(name);
            this.name = name;
            this.color = color;

            this.weight = weight;
            System.out.println("Durian King constructor is invoked");
            System.out.println(this.name + "." + "The color is " + this.color);

            System.out.println(this.name + " weight is " + this.weight + " kg");
        }
    }

    public static void main(String[] args) {
        Apple a = new Apple("Epal hijau", 2);

        System.out.println(a.name);

        System.out.println(a.weight+"\n");
        Durian b = new Durian("Durian King", "Yellow", 1);
        System.out.println(b.name);
        System.out.println(b.color);
        System.out.println(b.weight+"\n");
        watermelon c = new watermelon("watermelon", "green", 2);
        System.out.println(c.name);
        System.out.println(c.color);
        System.out.println(c.weight);
    }

}
