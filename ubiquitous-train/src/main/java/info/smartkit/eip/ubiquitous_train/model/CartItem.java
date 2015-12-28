package info.smartkit.eip.ubiquitous_train.model;

/**
 * Created by yangboz on 12/28/15.
 */
public class CartItem {
    private Cart cart;
    private Product product;
    private int qty;

    public CartItem(Cart cart, Product product, int qty) {
        this.cart = cart;
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        return product + ", qty: " + qty;
    }
}
