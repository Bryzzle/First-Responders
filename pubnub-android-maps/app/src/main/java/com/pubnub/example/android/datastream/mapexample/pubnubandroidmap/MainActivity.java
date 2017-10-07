package com.pubnub.example.android.datastream.mapexample.pubnubandroidmap;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

<<<<<<< HEAD
    public void Sim1_screen(View view) {
        Intent intent = new Intent(this, Sim1.class);
        startActivity(intent);
=======
        private void updateLocation(final LatLng location) {
            this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mPoints.add(location);

                    if (MainActivity.this.mMarker != null) {
                        MainActivity.this.mMarker.setPosition(location);
                    } else {
                        MainActivity.this.mMarker = mMap.addMarker(new MarkerOptions()
                                .position(location)
                                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_car)));
                    }


                /* this is how you make a line if you want it !!!*/

//                if (MainActivity.this.mPolyline != null) {
//                    MainActivity.this.mPolyline.setPoints(mPoints);
//                } else {
//                    MainActivity.this.mPolyline = mMap.addPolyline(new PolylineOptions().color(Color.BLUE).addAll(mPoints));
//                }


                    mMap.moveCamera(CameraUpdateFactory.newLatLng(location));
                }
            });
>>>>>>> 45a30a5144e46d4ccbe07c5aa103f2aa0ff247e0
        }

    public void Sim2_screen(View view){
        Intent intent = new Intent(this, Sim2.class);
        startActivity(intent);
    }
}
