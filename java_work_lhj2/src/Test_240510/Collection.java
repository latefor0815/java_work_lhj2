package Test_240510;

import java.util.HashMap;
import java.util.Scanner;

public class Collection {
    private String name;
    private int price;

    public Collection(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}