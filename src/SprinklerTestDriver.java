public class SprinklerTestDriver {
    public static void main (String[] args){
        //Create Action object
        SprinklerSwitchBoard onOffSwitch = new SprinklerSwitchBoard();

        // Initialize Sprinkler System objects
        SprinklerSystem sprinklersFront = new SprinklerSystem("Front yard");
        SprinklerSystem sprinklersBack = new SprinklerSystem("Back yard");

        //Create objects to link actions to front and back sprinklers
        SprinklersOn sprinklersOnInFront = new SprinklersOn(sprinklersFront);
        SprinklersOff sprinklersOffInFront = new SprinklersOff(sprinklersFront);

        SprinklersOn sprinklersOnInBack = new SprinklersOn(sprinklersBack);
        SprinklersOff sprinklersOffInBack = new SprinklersOff(sprinklersBack);

        //Set the actions for the sprinkler systems
        onOffSwitch.setAction(0, sprinklersOnInFront, sprinklersOffInFront);
        onOffSwitch.setAction(1, sprinklersOnInBack, sprinklersOffInBack);

        //Execute Actions for both Sprinkler Systems
        System.out.println("Initialize both systems to be used");
        onOffSwitch.onSwitchUsed(0);
        onOffSwitch.onSwitchUsed(1);
        System.out.println("\nTurn off both Systems:");
        onOffSwitch.offSwitchUsed(0);
        onOffSwitch.offSwitchUsed(1);

    }
}
