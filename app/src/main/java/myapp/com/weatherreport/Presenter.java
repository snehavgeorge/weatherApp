package myapp.com.weatherreport;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class Presenter implements MainInterface.Presenterview {

    public MainInterface.StartView startView;


    public Presenter(MainInterface.StartView  startActivity) {
        startView = startActivity;
    }

    @Override
    public Disposable getWeather() {
        return RetrofitManager.getRetrofit().create(ApiInterface.class).getweatherData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults, this::handleError );

    }

    private void handleError(Throwable throwable) {
        startView.handleError(throwable);
    }

    private void handleResults(WeatherResponse weatherResponse) {
        startView.handleResults(weatherResponse);
    }


}
