package cn.mobiledaily.domain;

public class Product implements Indexable {
    private Long id;
    private String name;
    private String brand;
    private int quantity = 0;

    public Product() {
    }

    public Product(Long id, String name, String brand, int quantity) {
        this();
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
