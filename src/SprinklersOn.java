public class SprinklersOn implements Action{
    SprinklerSystem sprinklers;

    public SprinklersOn(SprinklerSystem sprinklers){
        this.sprinklers = sprinklers;
    }

    public void execute(){
        sprinklers.turnOnSprinklers();
    }
}
