public class Main {

    public static void main(String[] args) {
        int amount = 100;
        int x = 1100;

        boolean isField = true;

        //int ruble = isField ? 1 : 0;
        int ruble;
        if (isField) {
            ruble = 1;
        } else {
            ruble = 0;
        }

        int bonus = x / 100 * ruble;
        System.out.println("Сумма бонуса: " + bonus);
    }

}
