package Annotations;

public class Product {
    private int productId;
    private String productName;
    private Category category;

    public Product(int productId, String productName, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public Product() {
    }

    public Category getCategory() {
        return new Category();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                '}';
    }
}
