public class MenuItem {
    String name;
    ItemType type;
    double price;

    public MenuItem(String name, ItemType type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public MenuItem(){
        this.name = "";
        this.type = ItemType.food;
        this.price = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem m = (MenuItem) o;
        String s = o.toString();

        return (this.name.equals(s)) || (this.name.equals(m.name) && this.type == m.type && this.price == m.price);
    }

}
