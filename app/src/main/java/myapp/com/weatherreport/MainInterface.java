package myapp.com.weatherreport;

import io.reactivex.disposables.Disposable;

public interface MainInterface {



        void getWeatherData();
        void setText(WeatherResponse weatherResponse);

}
