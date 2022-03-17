public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck()
  {
    System.out.println("Licenses Plate: " + getLicensePlate() + "\n" + "TollFee: " + getTollFee() + "\n" + "Number of passengers: " + getPassengers() + "\n" +
            "Number of Axles: " + axles + "\n" + "has Trailer: " + hasTrailer);
  }
}