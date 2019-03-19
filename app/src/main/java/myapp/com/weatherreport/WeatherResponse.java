package myapp.com.weatherreport;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResponse {
    @SerializedName("cod")
    private String cod;
    @SerializedName("city")
    private CityModel city;
    @SerializedName("message")
    private String message;
    @SerializedName("cnt")
    private String cnt;
    @SerializedName("list")
    private List<DetailModel> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public CityModel getCity() {
        return city;
    }

    public void setCity(CityModel city) {
        this.city = city;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public List<DetailModel> getList() {
        return list;
    }

    public void setList(List<DetailModel> list) {
        this.list = list;
    }

    public class CityModel {
        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("coord")
        private CoordinateModel coord;
        @SerializedName("country")
        private String country;
        @SerializedName("population")
        private String population;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordinateModel getCoord() {
            return coord;
        }

        public void setCoord(CoordinateModel coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getPopulation() {
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }

        public class CoordinateModel {
            @SerializedName("lon")
            private String lon;
            @SerializedName("lat")
            private String lat;

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }
        }
    }

    public class DetailModel {
        @SerializedName("dt")
        private String dt;
        @SerializedName("temp")
        private TempModel temp;
        @SerializedName("pressure")
        private String pressure;
        @SerializedName("humidity")
        private String humidity;
        @SerializedName("weather")
        private List<WeatherModel> weather;
        @SerializedName("speed")
        private String speed;
        @SerializedName("deg")
        private String deg;
        @SerializedName("clouds")
        private String clouds;

        public String getDt() {
            return dt;
        }

        public void setDt(String dt) {
            this.dt = dt;
        }

        public TempModel getTemp() {
            return temp;
        }

        public void setTemp(TempModel temp) {
            this.temp = temp;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public List<WeatherModel> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherModel> weather) {
            this.weather = weather;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }

        public String getDeg() {
            return deg;
        }

        public void setDeg(String deg) {
            this.deg = deg;
        }

        public String getClouds() {
            return clouds;
        }

        public void setClouds(String clouds) {
            this.clouds = clouds;
        }

        public class TempModel {
            @SerializedName("day")
            private String day;
            @SerializedName("min")
            private String min;
            @SerializedName("max")
            private String max;
            @SerializedName("night")
            private String night;
            @SerializedName("eve")
            private String eve;
            @SerializedName("morn")
            private String morn;

            public String getDay() {
                return day;
            }

            public void setDay(String day) {
                this.day = day;
            }

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }

            public String getNight() {
                return night;
            }

            public void setNight(String night) {
                this.night = night;
            }

            public String getEve() {
                return eve;
            }

            public void setEve(String eve) {
                this.eve = eve;
            }

            public String getMorn() {
                return morn;
            }

            public void setMorn(String morn) {
                this.morn = morn;
            }
        }

        public class WeatherModel {
            @SerializedName("id")
            private String weatherId;
            @SerializedName("main")
            private String main;
            @SerializedName("description")
            private String description;
            @SerializedName("icon")
            private String icon;

            public String getWeatherId() {
                return weatherId;
            }

            public void setWeatherId(String weatherId) {
                this.weatherId = weatherId;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
