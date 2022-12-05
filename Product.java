import java.util.ArrayList;
import java.util.stream.Stream;

public class Product {
    int prodId;
    String prodName;
    String category;
    int price;

    public Product(int prodId, String prodName, String category, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.category = category;
        this.price = price;
    }

    public static void main(String[] args){
        int prodId;
        String prodName;
        String category;
        int price;
        ArrayList<Product>products=new ArrayList<>();
        Product p1=new Product(1,"cooker","electronic",1000);
        Product p2=new Product(2,"heater","electronic",2000);
        Product p3=new Product(3,"pen","plastic",3000);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        Stream<Product> productStream=products.stream();
        productStream.filter(x->x.category.equals("electronic")).forEach(n->System.out.println(n.prodName));

    }
}
//Create a class named "Product" with fields like prodId, prodName, category and price.
// Create List of products and
// display total of all those products that comes under "electronics" category

