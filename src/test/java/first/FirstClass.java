package first;

public class FirstClass {
    public static void main(String[] args) {
        PlasticWindow plasticWindow = new PlasticWindow();
        WoodWindow woodWindow = new WoodWindow();
        House house = new House(woodWindow);
        House house1 = new Builder().createHouse();
        house1.vetilate();
    }
}
