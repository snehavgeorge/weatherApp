package myapp.com.weatherreport;
import org.json.JSONObject;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface ApiInterface {



    @Headers("x-api-key:76032d7be8c2f7cd29c820e37207e15a")
    @GET("data/2.5/forecast/daily?q=Chennai&mode=json&units=metric&cnt=1")
    //Call<WeatherResponse> getweatherData();
    Observable<WeatherResponse> getweatherData();
}


