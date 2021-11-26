public class main {
    public static void main(String[] args) {
        int priceTicket = 5000;
        int amount = 20;
        int bonus = 1;
        int countMiles = priceTicket*bonus/amount;
        System.out.println("Количество начисленных милей:" + countMiles);

    }
}
