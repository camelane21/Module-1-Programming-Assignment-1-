public class Main {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-10s%-10s    %-10s%-10s%n",
                          "Feet", "Meters", "Meters", "Feet");
        System.out.printf("%-10s%-10s    %-10s%-10s%n",
                          "------", "------", "------", "------");

        double meterColumn = 20.0;
        for (double foot = 1.0; foot <= 10.0; foot++) {
            double meters    = footToMeter(foot);
            double feetBack  = meterToFoot(meterColumn);

            System.out.printf("%-10.1f%-10.3f    %-10.1f%-10.3f%n",
                              foot,      meters,
                              meterColumn, feetBack);

            meterColumn += 5.0;
        }
    }
}