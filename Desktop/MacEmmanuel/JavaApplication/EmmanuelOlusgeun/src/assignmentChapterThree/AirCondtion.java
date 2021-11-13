package assignmentChapterThree;

public class AirCondtion {

    private boolean checkInitialState;
    private boolean isOn;
    private String airConditionName;
    private int temperature;
    private int setTemperature;
    private int increasedTemp;
    private int decreasedTemp;


    public void nameOfMyAirCondition(String AutoConAc, int temperature, int increasedTemp, int decreasedTemp ) {
        airConditionName = "AutoConAc";
    }

    public String getNameOfMyAirCondition() { return airConditionName; }

    public void offMyAirCondition(boolean initialState) {
        boolean checkIntialState = initialState;
    }

    public boolean checkOff() { return checkInitialState; }

    public boolean onMyAirCondition(boolean pressPowerButtonToOnAirCondition, int temperature) {
        return pressPowerButtonToOnAirCondition;
    }


    public boolean putOffmyAirCondition(boolean pressPowerButtonToOffAirCondition) {
        return pressPowerButtonToOffAirCondition;
    }


    public void setCurrentTemperature(int temperature) {
        if (temperature >= 30){ temperature = 30; }
        if (temperature <= 16 ){ temperature = 16; }
        setTemperature = temperature;
        increasedTemp = temperature;
        decreasedTemp = temperature;
    }

    public int getCurrentTemperature() { return setTemperature; }

    public int getIncreaseAirCondition() { return increasedTemp; }

    public int getDecreaseAirCondition() { return decreasedTemp; }
}

