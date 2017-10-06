package BasicExercises;
/*Stwórz klasę Samochód posiadającą następujące atrybuty:
- brand,
- model,
- price.
Stwórz metody dostępowe do atrybutów. Stwórz metodę show wyświetlającą markę oraz
cenę w jednej linii. */
public class Car {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
}
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void brandAndPrice() {
        System.out.println(this.getBrand()+" "+this.getPrice()+"$");
    }

    public static void main(String[] args) {
        Car christine = new Car("Plymouth", "Fury", 2400);
        christine.brandAndPrice();
    }
}
