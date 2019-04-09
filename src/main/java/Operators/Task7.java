package Operators;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        class Coin {
            public boolean coinside;

            public boolean isSideOrel() {
                Random rd = new Random();
                return rd.nextBoolean();
            }

        }

        Coin coin = new Coin();
        coin.coinside=coin.isSideOrel();
        System.out.println("isSideOrel="+ coin.coinside);

    }

}
