public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        
        WeatherDevice device1 = new WeatherDevice("Device1");
        WeatherDevice device2 = new WeatherDevice("Device2");

        station.addObserver(device1);
        station.addObserver(device2);
        
        station.setWeatherCondition("Sunny");
        station.setWeatherCondition("Rainy");
    }
}
