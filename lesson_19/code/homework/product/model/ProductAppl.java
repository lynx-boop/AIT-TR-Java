package homework.product.model;

public class ProductAppl {
    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product("knife", 273678249L, 70.15);
        product[1] = new Food("apple", 57857293L, 2.10, "01.10.2023");
        product[2] = new MeatFood("sausage", 389748935L, 15.50, "03.10.2023","pork");
        product[3] = new MilkFood("cheese", 2783492350L, 7.45, "cheddar","05.10.2023", 37.2);

        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
    }
}
