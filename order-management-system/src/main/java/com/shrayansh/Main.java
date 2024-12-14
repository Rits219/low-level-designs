package com.shrayansh;

import com.shrayansh.model.Address;
import com.shrayansh.model.App;
import com.shrayansh.model.Cart;
import com.shrayansh.model.Inventory;
import com.shrayansh.model.Order;
import com.shrayansh.model.Product;
import com.shrayansh.model.ProductCategory;
import com.shrayansh.model.User;
import com.shrayansh.model.Warehouse;
import com.shrayansh.model.payment.CashPaymentMode;
import com.shrayansh.model.warehouseSelection.NearestWarehouseSelectionStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        User ritesh = new User("Ritesh");

        //user joins the app.
        app.addUser(ritesh);

        //user add the address.
        Address address = new Address(457114, "Indore", "Indore, Madhya Pradesh");
        ritesh.addAddress(address);

        //create Inventory in app.
        Product laptop = new Product("Laptop");
        Product mobile = new Product("Mobile");
        Product tv = new Product("TV");
        ProductCategory laptopCategory = new ProductCategory(10, List.of(laptop));
        ProductCategory mobileCategory = new ProductCategory(10, List.of(mobile));
        ProductCategory tvProductCategory = new ProductCategory(100, List.of(tv));

        Inventory inventory = new Inventory();
        Map<Integer, Integer> productCategoryIdVsCount = Map.of(laptopCategory.getId(), 100, mobileCategory.getId(),
                100, tvProductCategory.getId(), 10);
        inventory.addProduct(productCategoryIdVsCount);

        //create warehouse which will have that inventory
        Address bengaluruAddress = new Address(560001, "Bengaluru", "Bengaluru, Karnataka");

        Warehouse bengaluruWarehouse = new Warehouse(inventory, bengaluruAddress);
        app.addWarehouse(bengaluruWarehouse);

        //now,user chooses one of the address and he should be able to view all the products available in that address.
        Address riteshAddress = ritesh.getAddressList().get(0);
        Warehouse warehouse = app.getWarehouse(riteshAddress, new NearestWarehouseSelectionStrategy());
        warehouse.show();

        //user will do add to cart from the selected products.
        Cart cart = new Cart(new HashMap<>(Map.of(laptop.getId(), 2, mobile.getId(), 3)));
        ritesh.setCart(cart); //clarify ,when they want to do the reservation.

        //user will place the order.
        Order order = app.createOrder(Map.of(laptop.getId(), 2, mobile.getId(), 3), ritesh, riteshAddress, new CashPaymentMode(), warehouse);

        //user makes the payment
        boolean isPaid = order.getPayment().makePayment();
    }
}