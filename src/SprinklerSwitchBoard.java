public class SprinklerSwitchBoard {
    Action[] turnOnActions;
    Action[] turnOffActions;

    public SprinklerSwitchBoard(){
        turnOnActions = new Action[2];
        turnOffActions = new Action[2];
        NoAction noAction = new NoAction();
        for (int i = 0; i < 2; i++){
            turnOnActions[i] = noAction;
            turnOffActions[i] = noAction;
        }
    }
    public void setAction(int choice, Action turnOnAction, Action turnOffAction){
        turnOnActions[choice] = turnOnAction;
        turnOffActions[choice] = turnOffAction;
    }

    public void onSwitchUsed(int choice){
        turnOnActions[choice].execute();
    }
    public void offSwitchUsed(int choice){
        turnOffActions[choice].execute();
    }
}
