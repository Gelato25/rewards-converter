public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Conversion rate
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE; // Convert cash to miles
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE; // Convert miles to cash
        }
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Testing the class

        // Create a RewardValue object with a cash value
        RewardValue rewardCash = new RewardValue(100);  // $100
        System.out.println("Cash Value: $" + rewardCash.getCashValue());
        System.out.println("Equivalent Miles: " + rewardCash.getMilesValue() + " miles");

        // Create a RewardValue object with a miles value
        RewardValue rewardMiles = new RewardValue(1000, true);  // 1000 miles
        System.out.println("Miles Value: " + rewardMiles.getMilesValue() + " miles");
        System.out.println("Equivalent Cash: $" + rewardMiles.getCashValue());
    }
}
