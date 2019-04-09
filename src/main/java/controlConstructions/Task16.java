package controlConstructions;

import java.util.Random;

public class Task16 {


    public static void main(String[] args) {
        class LoopFor {

            public void f() {
                for (int i = 0; i < 25; i++) {
                    Random firstRd = new Random();
                    Random secondRd = new Random();
                    if (firstRd.nextInt() > secondRd.nextInt()) {
                        System.out.println("first more second");
                    } else {
                        System.out.println("second more first");
                    }

                }
            }
            public void f1() {
                while (true){
                    Random firstRd = new Random();
                    Random secondRd = new Random();
                    if (firstRd.nextInt() > secondRd.nextInt()) {
                        System.out.println("first more second");
                    } else {
                        System.out.println("second more first");
                    }

                }
            }

        }
        LoopFor loopFor = new LoopFor();
        loopFor.f1();
    }

}
