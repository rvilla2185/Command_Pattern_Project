public class SprinklersOff implements Action {
    SprinklerSystem sprinklers;

    public SprinklersOff(SprinklerSystem sprinklers){
        this.sprinklers = sprinklers;
    }
    public void execute(){
        sprinklers.turnOffSprinklers();
    }
}
