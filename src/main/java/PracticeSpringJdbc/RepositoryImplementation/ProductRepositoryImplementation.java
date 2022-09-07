package PracticeSpringJdbc.RepositoryImplementation;

import PracticeSpringJdbc.Model.Product;
import PracticeSpringJdbc.Repository.ProductRepository;
import PracticeSpringJdbc.RowMapper.ProductRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProductRepositoryImplementation implements ProductRepository {

    private JdbcTemplate jdbcTemplate;

    public ProductRepositoryImplementation(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertProduct(Product product) {
        String query = "insert into product(product_id, " +
                "product_name, " +
                "product_category, " +
                "product_brand) values (?, ?, ?, ?)";
        int productInsert = jdbcTemplate.update(query,
                product.getProductId(),
                product.getProductName(),
                product.getCategory(),
                product.getBrand());
        return productInsert;
    }

    @Override
    public int updateProduct(Product product) {
        String query = "update product set product_name = ? where product_id = ?";
        int updateResult = jdbcTemplate.update(query,
                product.getProductName(),
                product.getProductId());
        return updateResult;
    }

    @Override
    public int deleteProduct(int productId) {
        String query = "delete from product where product_id = ?";
        int deleteResult = jdbcTemplate.update(query, productId);
        return deleteResult;
    }

    @Override
    public Product getProduct(int productId) {
        ProductRowMapper productRowMapper = new ProductRowMapper();
        String query = "select * from product where product_id =?";
        Product product = jdbcTemplate.queryForObject(query, productRowMapper, productId);
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        ProductRowMapper productRowMapper = new ProductRowMapper();
        String query = "select * from product";
        List<Product>productList = jdbcTemplate.query(query, productRowMapper);
        return productList;
    }
}
