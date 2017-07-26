package com.larry.osakwe.weatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextWeatherView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextWeatherView = (TextView)findViewById(R.id.tv_weather_data);

        String[] fakeWeatherData = {"Today, May 17 - Clear - 17°C / 15°C", "Tomorrow - Cloudy - 19°C / 15°C", "what", "you", "want?"};
        
        for (String fakeWeather: fakeWeatherData) {
            mTextWeatherView.append(fakeWeather + "\n\n\n");
        }
    }
}
