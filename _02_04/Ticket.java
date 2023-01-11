package _02_04;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;


  // Add three methods to set the value of each field, called setDestination,
  // setPrice and setIsReturn.
  public String setDestination(){
    return destination;
  }
  public double setPrice(){
    return price;
  }

  public boolean setIsReturn(){
    return isReturn;
  }


    // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.
  public void setDestination(String destination){
    this.destination = destination;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setIsReturn(boolean isReturn){
    this.isReturn = isReturn;
  }


}
