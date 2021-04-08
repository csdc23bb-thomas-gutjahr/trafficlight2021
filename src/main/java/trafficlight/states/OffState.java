package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class OffState implements State {
    //Return Nextstate
    @Override
    public void nextState(TrafficLightCtrl traffic) {
        traffic.setCurrentState(traffic.getRedState());
    }
    //Return OFF Light
    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.OFF;
    }
}
