package sample;

import javafx.scene.image.Image;

public class Properties {

    String name;
    int price;
    Image houseImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Image getHouseImage() {
        return houseImage;
    }

    public void setHouseImage(Image houseImage) {
        this.houseImage = houseImage;
    }

    public Properties(String name, int price , Image houseImage) {
        this.name = name;
        this.price = price;
        this.houseImage = houseImage;
    }
}
