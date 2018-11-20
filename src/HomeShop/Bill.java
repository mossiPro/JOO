package HomeShop;


import java.util.Map;

public class Bill {

    private  Customer customer;
    private Map<Product, Integer> products;

    public Bill(Customer customer){
        this.customer = customer;
    }

    /**
     * Add a Product with a quantity in the Bill
     * @param product the product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product, Integer quantity){

    this.products.put(product, quantity);

    }


    public Customer getCustomer(){

        return this.customer;
    }

    public Map<Product, Integer> getProduct(){

        return this.products;
    }
}
