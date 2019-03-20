package myapp.com.weatherreport;

import android.support.annotation.NonNull;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class Presenter implements PresenterInterface {

    public MainInterface startView;


    public Presenter(MainInterface startActivity) {
        startView = startActivity;
    }

    @Override
    public void getWeather() {

        getObservable().subscribeWith(getObserver());


    }



    public Observable<WeatherResponse> getObservable() {
        return RetrofitManager.getRetrofit().create(ApiInterface.class)
                .getweatherData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

        public DisposableObserver<WeatherResponse> getObserver(){
            return new DisposableObserver<WeatherResponse>() {

                @Override
                public void onNext(@NonNull WeatherResponse weatherResponse) {
                    startView.setText(weatherResponse);
                }

                @Override
                public void onError(@NonNull Throwable e) {
//                    Log.d(TAG,"Error"+e);
//                    e.printStackTrace();
//                    mvi.displayError("Error fetching Movie Data");
                }

                @Override
                public void onComplete() {
                 //   Log.d(TAG,"Completed");
                }
            };
        }


}
