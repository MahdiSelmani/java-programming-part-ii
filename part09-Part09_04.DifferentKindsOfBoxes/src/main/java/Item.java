
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o instanceof Item) {
            final Item ob = (Item) o;
            if (this.getName().equals(ob.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {

        return  this.name.hashCode();

    }

}
