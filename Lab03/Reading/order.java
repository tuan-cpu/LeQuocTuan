package Lab01.Lab03;
import java.util.*;
import java.util.ArrayList;

public class order {
        public static final int MAX_NUMBER_ORDER = 10;
        public List<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
        public int qtyOrdered(order anOrder){
            return anOrder.itemsOrdered.size();
        }
        public void addDigitalVideoDisc(DigitalVideoDisc dvd){
                itemsOrdered.add(new DigitalVideoDisc(dvd.title,dvd.category,dvd.director,dvd.length,dvd.cost));
        }
        public void removeDigitalVideoDisc(DigitalVideoDisc dvd){
            for(var i=0;i<itemsOrdered.size();i++){
                if(itemsOrdered.get(i).title.equals(dvd.title) &&itemsOrdered.get(i).category.equals(dvd.category)
                &&itemsOrdered.get(i).director.equals(dvd.director) &&itemsOrdered.get(i).length == dvd.length
                &&itemsOrdered.get(i).cost == dvd.cost){
                    itemsOrdered.remove(i);
                    break;
                }
            }
        }
        public float TotalCost(){
            float sum=0;
            for(var i=0;i<itemsOrdered.size();i++){
                sum += itemsOrdered.get(i).cost;
            }
            return sum;
        }
}
