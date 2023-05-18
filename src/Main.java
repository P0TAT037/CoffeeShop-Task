import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("iced coffee", ItemType.drink, 2.59));
        menu.add(new MenuItem("burger", ItemType.food, 5.99));
        menu.add(new MenuItem("cinnamon roll", ItemType.food, 2.99));
        menu.add(new MenuItem("tea", ItemType.drink, 1.50));
        menu.add(new MenuItem("pizza", ItemType.drink, 8.99));

        CoffeeShop tcs = new CoffeeShop("tcs", menu);

        tcs.addOrder("hot cocoa");
        tcs.addOrder("iced tea");

        tcs.addOrder("cinnamon roll");
        tcs.addOrder("iced coffee");

        tcs.listOrders();

        tcs.dueAmount();

        tcs.fulfillOrder();
        tcs.fulfillOrder();
        tcs.fulfillOrder();

        tcs.listOrders();

        tcs.dueAmount();

        tcs.cheapestItem();
        tcs.drinksOnly();
        tcs.foodOnly();
    }
}
