package PracticeSpringJdbc;

import PracticeSpringJdbc.Config.ConfigClass;
import PracticeSpringJdbc.Model.Product;
import PracticeSpringJdbc.RepositoryImplementation.ProductRepositoryImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class PracticeSpringJdbcMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        ProductRepositoryImplementation productRepositoryImplementation = applicationContext.getBean("getProductRepositoryImplementation", ProductRepositoryImplementation.class);

        //insert
        Product product = new Product(
                4,
                "MacBook Pro 14 inch 16 GB/1 TB",
                "Laptop",
                "Apple");
        int resultInsert = productRepositoryImplementation.insertProduct(product);
        System.out.println(resultInsert);

        //update
        Product productUpdate = new Product();
        productUpdate.setProductId(1);
        productUpdate.setProductName("MacBook Pro 16 inch 16GB/1TB");
        int updateResult = productRepositoryImplementation.updateProduct(productUpdate);
        System.out.println(updateResult);

        //delete
        int deleteResult = productRepositoryImplementation.deleteProduct(4);
        System.out.println(deleteResult);

        //select particular product
        Product particularProduct = productRepositoryImplementation.getProduct(1);
        System.out.println(particularProduct.getProductId() + " " +
                particularProduct.getProductName() + " " +
                particularProduct.getCategory() + " " +
                particularProduct.getBrand());

        //select all products
        List<Product>productList = productRepositoryImplementation.getAllProducts();
        for(int i = 0; i < productList.size(); i++){
            System.out.println(productList.get(i).getProductId() + " " +
                    productList.get(i).getProductName() + " " +
                    productList.get(i).getCategory() + " " +
                    productList.get(i).getBrand());
        }
    }
}
