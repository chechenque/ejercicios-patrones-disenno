public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Display display = new Display();

        ws.addObserver(display);
        ws.setTemperatura(25.5f);
    }
}
