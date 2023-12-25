import dal.UserDatabase;
import entities.Order;
import entities.Product;
import entities.ProductFactory;
import entities.UserAccount;

import java.util.ArrayList;
import java.util.List;

public class ShopCartApp {
    public static void main(String[] args){

        // Create the User database - Singleton
        UserDatabase dbContext=UserDatabase.getInstance();
//        UserDatabase dbContext1=UserDatabase.getInstance();
//        UserDatabase dbContext2=UserDatabase.getInstance();
        // no matter how many times user database is called
        // it always gives the same object
        System.out.println(dbContext);
//        System.out.println(dbContext1);
//        System.out.println(dbContext2);

        // By using Product Factory we don't have to create new objects for each products
        ProductFactory productFactory=new ProductFactory();
        Product electronicProd=productFactory.createProduct("electronics");
        electronicProd.displayInfo();

        Product clothingProd=productFactory.createProduct("clothing");
        clothingProd.displayInfo();

        // Build user account
        UserAccount.UserAccountBuilder userBuilder=new UserAccount.UserAccountBuilder("username","pwd");

        UserAccount userAccount= userBuilder.build();

        System.out.println(userAccount);

        // Build/create the order
        List<Product> products=new ArrayList<>();
        products.add(electronicProd);
        products.add(clothingProd);

        // Build/create the order
        Order.OrderBuilder orderBuilder=new Order.OrderBuilder("orderId",products);
        Order order= orderBuilder.build();
        System.out.println(order);


    }
}
