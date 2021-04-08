package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public interface State {
    public void nextState(TrafficLightCtrl traffic);//Set the next State
    public TrafficLightColor getState();//Get the actual State

}









