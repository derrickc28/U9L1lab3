public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public void printCar()
  {
    System.out.println("Licenses Plate: " + getLicensePlate() + "\n" + "TollFee: " + getTollFee() + "\n" + "Number of passengers: " + getPassengers() + "\n" + "Is car Eletric: " + electric + "\n" + "Is discount applied: " + discountApplied);
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }
}