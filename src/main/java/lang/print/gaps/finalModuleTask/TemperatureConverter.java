package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float temperatureFahrenheit = temperatureCelsius * 9 / 5.0f + 32;
        System.out.println(temperatureFahrenheit);
    }
}
