package HomeWork1;

public class Product {
    protected static String name;
    protected static double cost;
    protected static int volume;

    public Product(String name, double cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public double getCost(double cost) {
        return cost;
    }

    public String getName(String name) {
        return name;
    }

    public int getVolume(int volume) {
        return volume;
    }

    @Override
    public String toString() {
        return "{Product " +
                "name = '" + name + '\'' +
                ", cost = " + cost + '\'' +
                ", volume = " + volume +
                '}';
    }


}

