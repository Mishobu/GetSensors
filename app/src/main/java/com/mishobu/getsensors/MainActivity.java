package com.mishobu.getsensors;


import java.util.List;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sensorList = (TextView) findViewById(R.id.sensorList);

        SensorManager sensormanager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listsensor = sensormanager.getSensorList(Sensor.TYPE_ALL);

        for(Sensor sensor:listsensor)
        {
            sensorList.append('\n' + sensor.getName());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}