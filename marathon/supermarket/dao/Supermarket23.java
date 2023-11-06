package supermarket.dao;

import supermarket.model.Product23;

public class Supermarket23 {
    // это тоже поля класса, мы можем их конструировать из других полей
    private Product23[] products; // это массив типа Product23
    private int quantity = 0; // текущее кол-во продуктов в массиве и также длина массива, в которомо они хранятся

    // конструктор, получает на вход целочисленую переменную, которая будет длиной массива
    public Supermarket23(int capacity) {
        products = new Product23[capacity];
    } // создаем новый объект, который является массивом типа Product

    public boolean addProduct(Product23 product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;
        quantity++;
        return true;
    }

    public Product23 findProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                return products[i];
            }
        }
        return null;
    }

    public Product23 updateProduct(long barcode, double price) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                products[i].setPrice(price);
                System.out.println(products[i]);
                return products[i];
            }
        }
        return null;
    }

    public boolean removeProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                System.out.println("-----------------------------------------");
                System.out.println(products[i] + " REPLACED BY " + products[quantity - 1]);
                System.out.println("-----------------------------------------");

                //просто заменяем одно на другое, чтобы удалить ненужный элемент
                products[i] = products[quantity - 1];
                products[quantity - 1] = null;
                quantity--;
                return true;
            }
        }
        return false;
    }

    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
