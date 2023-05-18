import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CoffeeShop {
    private final String name;
    private final List<MenuItem> menu;
    List<MenuItem> orders = new LinkedList<>();

    public CoffeeShop(String name, List<MenuItem> menu){
        this.name = name;
        this.menu = menu;
    }

    public void addOrder(String itemName){
        MenuItem item = getItemByName(itemName);
        if(menu.contains(item)){
            orders.add(getItemByName(itemName));
        }else{
            System.out.println("This item is currently unavailable!");
        }
    }
    private MenuItem getItemByName(String itemName){
        for (MenuItem m: menu) {
            if(m.name.equals(itemName))
                return m;
        }
        return null;
    }

    public void fulfillOrder(){
        if(orders.isEmpty()){
            System.out.println("All orders have been fulfilled");
            return;
        }

        System.out.println("The " + orders.get(0).name + " is ready");
        orders.remove(0);
    }

    public void listOrders(){
        System.out.print("[ ");

        for (MenuItem m : orders) {
            System.out.print(m.name + ", ");
        }

        System.out.println("]");
    }

    public void dueAmount(){
        double total = 0;
        if(orders != null) {
            for (MenuItem m : orders) {
                total += m.price;
            }
        }
        System.out.println(total);
    }

    public void cheapestItem(){
        MenuItem cheapest = menu.get(0);
        for (MenuItem m: menu) {
            if (m.price < cheapest.price)
                cheapest = m;
        }
        System.out.println(cheapest.name);
    }

    public void drinksOnly(){
        System.out.print("[ ");
        for (MenuItem m:menu) {
            if(m.type == ItemType.drink)
                System.out.print(m.name + ", ");
        }
        System.out.println("]");
    }

    public void foodOnly(){
        System.out.print("[ ");
        for (MenuItem m:menu) {
            if(m.type == ItemType.food)
                System.out.print(m.name + ", ");
        }
        System.out.println("]");
    }
}
