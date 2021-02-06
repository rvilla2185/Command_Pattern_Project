public class SprinklerSystem {
    String area = "";

    public SprinklerSystem(String area) {
        this.area = area;
    }
    public void turnOnSprinklers() {
        System.out.println(area + " sprinklers have been turned on");
    }
    public void turnOffSprinklers() {
        System.out.println(area + " sprinklers have been turned off");
    }
}
