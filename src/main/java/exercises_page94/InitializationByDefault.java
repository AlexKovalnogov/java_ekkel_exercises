package exercises_page94;

public class InitializationByDefault {

    public static void main(String[] args) {


        class InitDataByDefault {
            int i;
            char c;
        }


        InitDataByDefault initDataByDefault = new InitDataByDefault();

        System.out.println("Int var = " + initDataByDefault.i);
        System.out.println("Char var = " + initDataByDefault.c);

    }
}
