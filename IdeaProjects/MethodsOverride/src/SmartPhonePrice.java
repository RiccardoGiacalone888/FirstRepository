import java.util.Objects;

class SmartPhonePrice implements Cloneable {
    protected String priceType;
    protected double priceInEuros;

    public SmartPhonePrice(String type, double price) {
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public SmartPhonePrice clone() {
        try {
            return (SmartPhonePrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Price Type: " + priceType + ", Price: " + priceInEuros + " EUR";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartPhonePrice that = (SmartPhonePrice) obj;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}



