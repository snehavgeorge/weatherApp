package myapp.com.weatherreport;

import io.reactivex.disposables.Disposable;

public interface MainInterface {

    interface StartView{
        void getWeatherData();
        void handleResults(WeatherResponse weatherResponse);
        void handleError(Throwable t);
    }

    interface Presenterview{
        Disposable getWeather();
    }
}
