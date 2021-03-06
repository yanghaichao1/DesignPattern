package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
    public float getCost(){
        float cost = 0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : items) {
            System.out.println("Item:"+item.name());
            System.out.println("price:"+item.price());
            System.out.println("packing:"+item.packing().pack());
        }
    }
}
