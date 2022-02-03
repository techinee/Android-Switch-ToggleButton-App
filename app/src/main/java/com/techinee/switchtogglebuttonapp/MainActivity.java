package com.techinee.switchtogglebuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Switch wifiSwitch , bluetoothSwitch;
    private ToggleButton wifiToggle , bluetoothToggle;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifiSwitch = (Switch) findViewById(R.id.wifiSwitch);
        bluetoothSwitch = (Switch) findViewById(R.id.bluetoothSwitch);

        wifiToggle = (ToggleButton) findViewById(R.id.wifiToggle);
        bluetoothToggle = (ToggleButton) findViewById(R.id.bluetoothToggle);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);

    }
    public void onClickSwitch(View v) {
        if(v.getId() == R.id.wifiSwitch) {
            if(wifiSwitch.isChecked()) {
                Toast.makeText(this,"WIFI On !!!",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this,"WIFI Off !!!",Toast.LENGTH_SHORT).show();
            }
        }
        else if (v.getId() == R.id.bluetoothSwitch) {
            if (bluetoothSwitch.isChecked()) {
                Toast.makeText(this, "Bluetooth On !!!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Bluetooth Off !!!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void onClickToggle(View v){
        if(v.getId() == R.id.wifiToggle) {
            if(wifiToggle.isChecked()) {
                Toast.makeText(this,"WIFI Toggle On !!!",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this,"WIFI Toggle Off !!!",Toast.LENGTH_SHORT).show();
            }
        }
        else if (v.getId() == R.id.bluetoothToggle) {
            if (bluetoothToggle.isChecked()) {
                Toast.makeText(this, "Bluetooth Toggle On !!!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Bluetooth Toggle Off !!!", Toast.LENGTH_SHORT).show();
            }
        }
    }



    @Override
    public void  onClick(View v) {
        String message ="";
        message += "WIFI : " + (wifiSwitch.isChecked() ? "On" : "Off");
        message += "\nBluetooth : " + (bluetoothSwitch.isChecked() ? "On" : "Off");
        message += "\nWIFI Toggle : " + (wifiToggle.isChecked() ? "On" : "Off");
        message += "\nBluetooth Toggle : " + (bluetoothToggle.isChecked() ? "On" : "Off");

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}