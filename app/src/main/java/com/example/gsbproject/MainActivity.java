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
    private Button btn ;
    private String login;
    private String motdepasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.open_activity_button);

        Bundle bundle = getIntent().getExtras();
        login = bundle.getString("login");
        motdepasse = bundle.getString("password");

        GsbService service = RetrofitClientInstance.getRetrofitInstance(login, motdepasse).create(GsbService.class);
        Call<Visiteurs> call = service.getAllVisiteurs();
        Call<Praticiens> call2 = service.getAllPraticiens();

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
                Toast.makeText(MainActivity.this, "Quelque chose a mal tourné pour les visiteurs... Rééssayez plus tard !", Toast.LENGTH_SHORT).show();
            }

        });


        call2.enqueue(new Callback<Praticiens>() {
            @Override
            public void onResponse(Call<Praticiens> call2, Response<Praticiens> response) {
                Praticiens praticiens = response.body();
                String resultat = "";
                for (Praticien p : praticiens.getPraticiens()) {
                    resultat += p.toString();
                }
                //Toast.makeText(MainActivity.this, resultat, Toast.LENGTH_SHORT).show();
                TextView textView = findViewById(R.id.textViewPraticiensResultat);
                textView.setText(resultat);
            }

            @Override
            public void onFailure(Call<Praticiens> call2, Throwable t2) {
                Toast.makeText(MainActivity.this, "Quelque chose a mal tourné pour les praticiens... Rééssayez plus tard !", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onClickBtn(View v)
    {
        Intent intent = new Intent(getApplicationContext(), PraticienActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("login", login);
        bundle.putString("password", motdepasse);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
