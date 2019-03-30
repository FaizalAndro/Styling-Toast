package com.faizalkhan.gradleproject;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showButton(View view){
        switch (view.getId()){

            case R.id.errorBtn:
                Toasty.error(this, "Error", Toasty.LENGTH_SHORT).show();
                break;
            case R.id.successBtn:
                Toasty.success(this, "Success", Toasty.LENGTH_SHORT).show();
                break;
            case R.id.infoBtn:
                Toasty.info(this, "Info", Toasty.LENGTH_SHORT).show();
                break;
            case R.id.warnBtn:
                Toasty.warning(this, "Warning", Toasty.LENGTH_SHORT).show();
                break;
            case R.id.imgBtn:
                Toasty.normal(this, "Image", Toasty.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_attach_money_black_24dp)).show();
                break;
        }
    }
}
