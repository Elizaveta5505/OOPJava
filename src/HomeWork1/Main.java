package HomeWork1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotVendingMashine HVM = new HotVendingMashine();
        HVM.initProductName(List.of(new HotDrinks("Coffee", 21.1, 150, 100), (new HotDrinks("Green tea", 55.0, 200, 80))));
        System.out.println(HVM.getProductName());
    }
}