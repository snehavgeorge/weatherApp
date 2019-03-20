package myapp.com.weatherreport;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class StartActivity extends AppCompatActivity implements MainInterface{
    TextView weather;
    public static Retrofit retrofit;
    public PresenterInterface presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        presenter = new Presenter(this);
        weather = (TextView)findViewById(R.id.weather);
       /* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ApiInterface apiInterface = retrofit.create(ApiInterface.class);


        Call<WeatherResponse> call = apiInterface.getweatherData();
        call.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                WeatherResponse weatherRespose = response.body();
                weather.setText("City Name : "+weatherRespose.getCity().getName()+"\n"+
                        "temp : "+weatherRespose.getList().get(0).getTemp().getDay()
                );
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                Log.e("MainActivity","Failure:::::"+t.getMessage());
            }
        });
*/
        getWeatherData();

    }

    @Override
    public void getWeatherData(){

        //ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        presenter.getWeather();

    }
    @Override
    public void setText(WeatherResponse weatherResponse) {
        {
            weather.setText("City Name : "+weatherResponse.getCity().getName()+"\n"+"Temperature in morning : "+weatherResponse.getList().get(0).getTemp().getMorn()+"\n"+"Temperature in day time : "+weatherResponse.getList().get(0).getTemp().getEve()+"\n"+"Temperature in evening : "+weatherResponse.getList().get(0).getTemp().getEve()+"\n"+"Temperature in Night : "+weatherResponse.getList().get(0).getTemp().getNight()+"\n");

        }
    }


}