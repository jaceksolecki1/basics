public class Product {
    private Long id;
    private String productName;
    private Float price;
    private Float weight;
    private String color;
    private Integer productCount;
    public Product(Long id, String productName, Float price, Float weight, String color, Integer productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount=productCount;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
    public Long getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public Float getPrice() {
        return price;
    }
    public Float getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
    public Integer getProductCount() {
        return productCount;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}