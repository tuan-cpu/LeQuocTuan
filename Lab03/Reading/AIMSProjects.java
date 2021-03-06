package Lab01.Lab03;

public class AIMSProjects {
    public static void main(String[] args) {
        order anOrder = new order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("Total cost is:");
        System.out.println(anOrder.TotalCost());
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("Object list:");
        System.out.println(anOrder.qtyOrdered(anOrder));
        System.out.println("Total cost is:");
        System.out.println(anOrder.TotalCost());
    }
}
