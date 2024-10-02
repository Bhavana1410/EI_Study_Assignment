public class WeatherDevice implements Observer {
    private String deviceName;

    public WeatherDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println("Device: " + deviceName + " received weather update: " + weatherCondition);
    }
}
