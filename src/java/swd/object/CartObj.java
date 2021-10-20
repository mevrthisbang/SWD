/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.object;

import java.io.Serializable;
import java.util.HashMap;
import swd.dto.ProductDTO;

/**
 *
 * @author mevrthisbang
 */
public class CartObj implements Serializable {

    private String customer;
    private HashMap<String, ProductDTO> cart;

    public float getTotal() {
        float result = 0;
        for (ProductDTO product : this.cart.values()) {
            result += product.getPrice() * product.getQuantity();
        }
        return result;
    }

    public CartObj(String customer) {
        this.customer = customer;
        this.cart = new HashMap<>();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public HashMap<String, ProductDTO> getCart() {
        return cart;
    }

    public void addToCart(ProductDTO product) throws Exception {
        product.setQuantity(1);
        if (this.cart.containsKey(product.getProductID())) {
            int quantity = this.cart.get(product.getProductID()).getQuantity();
            product.setQuantity(quantity + 1);
        }
        this.cart.put(product.getProductID(), product);
    }

    public void removeFromCart(String productID) throws Exception {
        if (this.cart.containsKey(productID)) {
            cart.remove(productID);
        }
    }

    public void updateCart(String productID, int quantity) throws Exception {
        if(this.cart.containsKey(productID)){
            this.cart.get(productID).setQuantity(quantity);
            this.cart.get(productID).setDescription("");
        }
    }
}
