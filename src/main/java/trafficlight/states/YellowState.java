package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State {
    //Generate to Nextstate
    @Override
    public void nextState(TrafficLightCtrl traffic) {

        if (traffic.getPreviousState().equals(traffic.getRedState())){
            traffic.setCurrentState(traffic.getGreenState());
        }
        else {
            traffic.setCurrentState(traffic.getRedState());
        }

        traffic.setPreviousState(traffic.getYellowState());
    }

    //Return Yellow Light
    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}
