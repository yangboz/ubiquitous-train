package info.smartkit.eip.ubiquitous_train.model;

/**
 * Created by yangboz on 12/28/15.
 */
public class Product {
    private int price;
    private String desc;

    public Product(String desc, int price) {
        this.price = price;
        this.desc = desc;
    }

    public Product() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
