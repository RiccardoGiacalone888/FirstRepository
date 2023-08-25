public class Product {
    private long id;
    private String name;
    private String manufacture;
    private int quantity;
    public Product(long id, String name, String manufacture, int quantity){
        this.id=id;
        this.name=name;
        this.manufacture=manufacture;
        this.quantity=quantity;
    }
    public String getManufacture(){
        return manufacture;
    }
    public void setManufacture(String manufacture){
        this.manufacture=manufacture;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
