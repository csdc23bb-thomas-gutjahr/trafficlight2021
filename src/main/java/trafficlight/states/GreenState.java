package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State {
    //Generate to Nextstate
    @Override
    public void nextState(TrafficLightCtrl traffic) {
        traffic.setCurrentState(traffic.getYellowState());
        traffic.setPreviousState(traffic.getGreenState());
    }
    //Return Green Light
    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.GREEN;
    }
}
