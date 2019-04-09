package Constructors;

public class Task1initialization {
    public static void main(String[] args) {
        class Init {
            String s;

            public Init(String s) {
                this.s = s;
            }

            public Init() {
            }

        }

        System.out.println(new Init().s);


    }




}
