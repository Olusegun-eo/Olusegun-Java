package playGround.ClassWork;

import java.util.ArrayList;

public class Cart {
   private final ArrayList<Item>itemList;
    private  String customerName;

    public Cart(String customerName) {
        this.customerName = customerName;
        itemList = new ArrayList<>() ;
    }


    public void addEachItemsToItemList(Item items){
        itemList.add(items);
    }


    public void addItems(){
        double total = 0.0;
        for (Item items : itemList){
            total += items.calculate_Total();
        }
    }


}
