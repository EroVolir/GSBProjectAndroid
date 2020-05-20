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

public class PraticienActivity extends AppCompatActivity {
    Button btn;
    String login;
    String motdepasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        login = bundle.getString("login");
        motdepasse = bundle.getString("password");

        setContentView(R.layout.activity_praticien);
        btn = (Button)findViewById(R.id.open_activity_button);

        GsbService service = RetrofitClientInstance.getRetrofitInstance(login, motdepasse).create(GsbService.class);
        Call<Praticiens> call = service.getAllPraticiens();
        call.enqueue(new Callback<Praticiens>() {
            @Override
            public void onResponse(Call<Praticiens> call, Response<Praticiens> response) {
                Praticiens praticiens = response.body();
                String resultat = "";
                for (Praticien p : praticiens.getPraticiens()) {
                    resultat += p.toString();
                }
                TextView textView = findViewById(R.id.textViewResultatPraticien);
                textView.setText(resultat);
            }

            @Override
            public void onFailure(Call<Praticiens> call, Throwable t) {
                Toast.makeText(PraticienActivity.this, "Quelque chose a mal tourné... Rééssayez plus tard !", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickBtnRetour(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("login", login);
        bundle.putString("password", motdepasse);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}