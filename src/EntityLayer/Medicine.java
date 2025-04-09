package EntityLayer;

public class Medicine {
    private int ID;
    private String name;
    private double price;
    private int numberOfMedicine;

    public Medicine() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return numberOfMedicine;
    }

    public void setAmount(int numberOfMedicine) {
        this.numberOfMedicine = numberOfMedicine;
    }

    @Override
    public String toString() {
        return "Medicine" + "\nID: " + ID + "\nName: " + name + "\nPrice: " + price + "\nQuantity: " + numberOfMedicine ;
    }
    
    
    
}
