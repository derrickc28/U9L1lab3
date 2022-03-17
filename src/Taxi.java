public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi()
    {
        System.out.println("Licenses Plate: " + getLicensePlate() + "\n" + "TollFee: " + getTollFee() + "\n" + "Number of passengers: " +
                getPassengers() + "\n" + "Is car Eletric: " + isElectric() + "\n" + "Is discount applied: " + isDiscountApplied() + "\n" +
                "total fare collected: " + fareCollected);
    }
}
