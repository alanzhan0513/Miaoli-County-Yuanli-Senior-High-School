package com.oliverding.dice2;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends Activity implements SensorEventListener {


    private long lastUpdate = -1;
    private float x, y, z;
    private float last_x, last_y, last_z;
    private boolean paused = false;
    private static final int UPDATE_DELAY = 50;
    private static final int SHAKE_THRESHOLD = 2000;//控制搖晃的敏感度

    private TextView tx1;
    private ImageView imgDice;
    private SensorManager sensorMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        sensorMgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        boolean accelSupported = sensorMgr.registerListener(this,
                sensorMgr.getDefaultSensor(SensorManager.SENSOR_ACCELEROMETER), SensorManager.SENSOR_DELAY_GAME);
        if (!accelSupported) sensorMgr.unregisterListener(this); //no accelerometer on the device
        rollDice();


    }

    private void init() {
        imgDice = findViewById(R.id.imgDice);
        tx1 = findViewById(R.id.lblMyScore);
    }

    public void onClickRoll(View view) {

        int value = new Random().nextInt(6) + 1; //隨機判定
        tx1.setText(String.valueOf("Your Score:"+value));
        switch (value) {//隨機出圖片
            case 1:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                break;
            case 2:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                break;
            case 3:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                break;
            case 4:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                break;
            case 5:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                break;
            case 6:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                break;
        }
    }


    private void roll() {

        int value = new Random().nextInt(6) + 1;
        tx1.setText(String.valueOf("Your Score:"+value));


        switch (value) {
            case 1:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                break;
            case 2:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                break;
            case 3:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                break;
            case 4:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                break;
            case 5:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                break;
            case 6:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                break;
        }

    }
    /**
     加速度感測器
     */

    @Override
    public void onSensorChanged(SensorEvent event) {
        Sensor mySensor = event.sensor;
        if (mySensor.getType() == SensorManager.SENSOR_ACCELEROMETER) {
            long curTime = System.currentTimeMillis();
            if ((curTime - lastUpdate) > UPDATE_DELAY) {
                long diffTime = (curTime - lastUpdate);
                lastUpdate = curTime;
                x = event.values[SensorManager.DATA_X];
                y = event.values[SensorManager.DATA_Y];
                z = event.values[SensorManager.DATA_Z];
                float speed = Math.abs(x + y + z - last_x - last_y - last_z) / diffTime * 10000;
                if (speed > SHAKE_THRESHOLD) { //the screen was shaked
                    rollDice();

                }
                last_x = x;
                last_y = y;
                last_z = z;
            }
        }
    }


    private void rollDice() {

        roll();
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        return; //this method isn't used
    }
}