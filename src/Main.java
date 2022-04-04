public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2000;
        int rublesForOneBonusMile = 20;
        int numberOfBonusMiles = ticketPrice / rublesForOneBonusMile;
        System.out.println("Ваше количество бонусных миль: " + numberOfBonusMiles);
    }
}
