public class Main {
    public static void main(String[] args) {
        double balance = 100;
        double replenishment = 1100;
        double bonus = replenishment > 1000 ? Math.floor(replenishment / 100) : 0;
        double totalBalance = balance + replenishment + bonus;
        System.out.println(totalBalance);
    }

}
