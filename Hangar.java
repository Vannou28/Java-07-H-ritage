public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("Clio",61652); 
        System.out.println(clio.doStuff());

        Boat titanic  = new Boat("Titanic",8622); 
        System.out.println(titanic.doStuff());
 
    }
}