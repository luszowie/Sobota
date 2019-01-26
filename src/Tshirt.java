public class Tshirt {
    private TshirtsSize size;
    private String manufacture;

    public Tshirt(TshirtsSize size, String manufacture) {
        this.size = size;
        this.manufacture = manufacture;
    }

    public TshirtsSize getSize() {
        return size;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setSize(TshirtsSize size) {
        this.size = size;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
