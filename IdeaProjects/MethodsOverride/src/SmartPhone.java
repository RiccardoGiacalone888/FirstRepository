import java.util.Objects;

class SmartPhone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batteryAh;
    private SmartPhonePrice producerPrice;
    private SmartPhonePrice retailPrice;

    public SmartPhone(String name, String model, int battery, SmartPhonePrice producer, SmartPhonePrice retail){
        this.brandName=name;
        this.modelName=model;
        this.batteryAh=battery;
        this.producerPrice=producer;
        this.retailPrice=retail;
    }
    @Override
    public SmartPhone clone() {
        try {
            SmartPhone clonedSmartphone = (SmartPhone) super.clone();
            clonedSmartphone.producerPrice = producerPrice.clone();
            clonedSmartphone.retailPrice = retailPrice.clone();
            return clonedSmartphone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + "\nModel: " + modelName + "\nBattery: " + batteryAh + " Ah"
                + "\nProducer Price: " + producerPrice + "\nRetail Price: " + retailPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartPhone that = (SmartPhone) obj;
        return batteryAh == that.batteryAh && Objects.equals(brandName, that.brandName)
                && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice)
                && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryAh, producerPrice, retailPrice);
    }
}
