//REPO LINK -> https://github.com/csdc23bb-thomas-gutjahr/trafficlight2021
//Thomas Gutjahr

package trafficlight.ctrl;

import trafficlight.gui.TrafficLightGui;
import trafficlight.states.*;

public class TrafficLightCtrl {

    private State greenState;

    private State redState;

    private State yellowState;

    private State currentState;

    private State previousState;

    private TrafficLightGui gui;


    public TrafficLightCtrl() {
        super();
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
    }

    private void initStates() {
        //TODO create the states and set current and previous state,
        greenState = new StateFactory().stateFactory("GREEN");
        yellowState = new StateFactory().stateFactory("YELLOW");
        redState = new StateFactory().stateFactory("RED");
        currentState = new StateFactory().stateFactory("OFF");
        previousState = new StateFactory().stateFactory("RED");
    }

    public State getGreenState() { return greenState; }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }

    public void run() {
        gui.run();
    }

    public void nextState() {
        //TODO handle GUi request and update GUI
        getCurrentState().nextState(this); //Get actual State(green,yell....) and set it to the defined next Stat
        //System.out.println(previousState + "In Controller Klasse");
        gui.setLight(currentState.getState()); //Actualstate and get Colour back
    }
}
