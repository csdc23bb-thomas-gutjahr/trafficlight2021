package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

//Factory Pattern

public class StateFactory {

    //Spawn new State Objects

    public State stateFactory(String colour){
        if (colour == "GREEN"){
            return new GreenState();
        }
        else if(colour == "YELLOW"){
            return new YellowState();
        }
        else if(colour == "RED"){
            return new RedState();
        }
        else{
            return new OffState();
        }
    }
}
