public class Product {
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String _code;

    // Getter
    public int getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public double getPrice() {
        return _price;
    }

    public int getstockAmount() {
        return _stockAmount;
    }

    public String getColor() {
        return _color;
    }

    public String getCode() {
        return this._name.substring(0, 1) + _id;
    }

    // Setter
    public void setId(int id) {
        _id = id;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public void setPrice(int price) {
        _price = price;
    }

    public void setstockAmount(int stockAmount) {
        _stockAmount = stockAmount;

    }

    public void setColor(String color) {
        _color = color;
    }

}
