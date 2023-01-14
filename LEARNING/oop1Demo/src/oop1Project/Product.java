package oop1Project;

public class Product {
    String name;
    String[] coloroptions = new String[4];
    double price;
    double discountPercentage;
    int hire;

    public int getHire() {
        return this.hire;
    }

    public void setHire(int hire) {
        this.hire = hire;
    }

    public String[] getColoroptions() {

        return this.coloroptions;

    }

    public void setColoroptions(String[] coloroptions) {

        this.coloroptions = coloroptions;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}

// *ucking private ortak grupta olsalar dahi değşkneleri sadece o class a özel
// * yapar