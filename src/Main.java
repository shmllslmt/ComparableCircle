public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(70);
        Circle circle2 = new Circle(17);

        if((circle1.compareTo(circle2)) > 0)
            System.out.println("Circle 1 is bigger than Circle 2");
        else if((circle1.compareTo(circle2)) < 0)
            System.out.println("Circle 1 is smaller than Circle 2");
        else
            System.out.println("Circle 1 and Circle 2 has the same size");

        Circle circleCopy = (Circle)circle1.clone();

        System.out.println("Circle 1 Info:");
        System.out.println("Area: " + circle1.calcArea());
        System.out.println("Radius: " + circle1.getRadius());

        System.out.println("\nCircle Copy Info:");
        System.out.println("Area: " + circleCopy.calcArea());
        System.out.println("Radius: " + circleCopy.getRadius());
    }
}