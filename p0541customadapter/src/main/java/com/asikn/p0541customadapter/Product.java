package com.asikn.p0541customadapter;

import androidx.appcompat.app.AppCompatActivity;

public class Product extends AppCompatActivity {
    String name;
    int price;
    int image;
    boolean box;


    Product(String _describe, int _price, int _image, boolean _box) {
        name = _describe;
        price = _price;
        image = _image;
        box = _box;
    }
}