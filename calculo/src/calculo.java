public class calculo {
    public static void main(String[] args) {

        int x = Integer.parseInt((args[1]));
        int y = Integer.parseInt((args[2]));

        if (args[0].equals("sum")) {
            sum(x, y);
        }
        if (args[0].equals("sub")) {

            sub(x, y);
        }
        if (args[0].equals("multi")) {
            multi(x, y);
        }
        if (args[0].equals("div")) {
            div(x, y);
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void sub(int x, int y) {
        System.out.println(x - y);
    }

    static void multi(int x, int y) {
        System.out.println(x * y);
    }

    static void div(int x, int y) {
        System.out.println(x / y);
    }
}


