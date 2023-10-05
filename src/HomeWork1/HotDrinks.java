package HomeWork1;


public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks (String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature(int temperature) {
        return temperature;
    }

    @Override
    public String toString() {
        return "{Product " +
                "name = '" + name + '\'' +
                ", cost = " + cost + '\'' +
                ", volume = " + volume + '\'' +
                ", temperature = " + temperature +
                '}';
    }

}

