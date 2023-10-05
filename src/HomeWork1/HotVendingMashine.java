package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class HotVendingMashine extends VendingMashine{
    List<HotDrinks> hotDrinksList = new ArrayList();

    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }
}
