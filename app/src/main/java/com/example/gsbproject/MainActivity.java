package com.example.gsbproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {
    Button btn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.open_activity_button);

        GsbService service = RetrofitClientInstance.getRetrofitInstance().create(GsbService.class);
        Call<Visiteurs> call = service.getAllVisiteurs();
        call.enqueue(new Callback<Visiteurs>() {
            @Override
            public void onResponse(Call<Visiteurs> call, Response<Visiteurs> response) {
                Visiteurs visiteurs = response.body();
                String resultat = "";
                for (Visiteur v : visiteurs.getVisiteurs()) {
                    resultat += v.toString();
                }
                TextView textView = findViewById(R.id.textViewResultat);
                textView.setText(resultat);
            }

            @Override
            public void onFailure(Call<Visiteurs> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Quelque chose a mal tourné... Rééssayez plus tard !", Toast.LENGTH_SHORT).show();
            }

        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });
    }

    public void nextActivity(){
        startActivity(new Intent(getApplicationContext(), PraticienActivity.class));
    }
}
