package Testing.Payloads;

public class helpers_Products_Data {

    public static helper_Products getProductsData()
    {
        helper_Products products = new helper_Products();
        products.setProductName("Test Product");
        products.setPrice("10.99");
        products.setCategoryId("123");
        return products;
    }
}
