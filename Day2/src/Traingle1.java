//abstraction
abstract class shape {
    abstract void numberofsides();
}
//inheritence
class Triangle extends shape {
    //overriding
    void numberofsides() {
        System.out.println("Triangle has 3 sides");
    }
}
class Trapezoid extends shape {
    //overriding
    void numberofsides() {
        System.out.println("Trapezoid has 4  sides");
    }
}
class hexagon extends shape {
    //overriding
    void numberofsides() {
        System.out.println("hexagon has 6  sides");
    }
}


    public class Traingle1{
        public static void main(String[] args) {
            shape s = new Triangle();
            s.numberofsides();

            shape trape = new Trapezoid();
            trape.numberofsides();

            shape hexa = new hexagon();
            hexa.numberofsides();

        }
    }
