package Operators;

public class Task5 {

    public static void main(String[] args) {
        class Dog {
            String name;
            String says;
            Dog(){}
            Dog(String name,String says){
                this.name=name;
                this.says=says;
            }
        }

        Dog spot = new Dog("spot","spot");
        Dog scruffy = new Dog("scruffy","scruffy");
        Dog spottest = new Dog("spot1","spot");
        //spot=spottest;

        System.out.println("comparing with == " );
        System.out.println(spot==spottest);
        System.out.println("comparing with equals" );
        System.out.println(spot.equals(spottest));

    }




}
