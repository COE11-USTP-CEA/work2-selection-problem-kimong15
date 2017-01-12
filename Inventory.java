import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Hanzel STORE");
        List<Item> INV = new ArrayList();
        float total = 0.0f;

        Item t1 = new Item("Mango", "Fruit", 25000.00f);

        Item t2 = new Item("Orange", "Fruit", 250000.00f);

        Item t3 = new Item("Apple", "Fruit", 500000.00f);

        Item t4 = new Item("Grapes", "Fruit", 1000000.00f);

        Item t5 = new Item("Strawberry", "Fruit", 300000.00f);

        Item t6 = new Item("Cherry", "Fruit", 12000.00f);

        Item t7 = new Item("Banana", "Fruit", 700000.00f);

        Item t8 = new Item("Durian", "Fruit", 2500.00f);

        Item t9 = new Item("Jackfruit", "Fruit", 5000.00f);

        Item t10 = new Item("Pineapple", "Fruit", 1000.00f);
        INV.add(t1);
        INV.add(t2);
        INV.add(t3);
        INV.add(t4);
        INV.add(t5);
        INV.add(t6);
        INV.add(t7);
        INV.add(t8);
        INV.add(t9);
        INV.add(t10);
        for(Item d: INV){
            if(d.Getname()=="Pineapple"){
                System.out.println("Found!");
            }else{
                System.out.println("Not this");
            }
            total = total + d.Getprice();
        }
        System.out.println(total);
    }
}