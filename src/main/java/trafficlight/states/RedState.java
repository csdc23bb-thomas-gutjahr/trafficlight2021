package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;


public class RedState implements State {
    //Return Nextstate
    @Override
    public void nextState(TrafficLightCtrl traffic) {
        traffic.setCurrentState(traffic.getYellowState());
        traffic.setPreviousState(traffic.getRedState());
    }
    //Return Red Light
    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.RED;
    }
}
