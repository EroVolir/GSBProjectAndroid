package com.example.gsbproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.ErrorHandler;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.GET;

    public class LoginActivity extends AppCompatActivity {

        private EditText txtLogin;
        private EditText txtPassword;
        private String login;
        private String motdepasse;

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
        }

        public void onClickBtn(View v)
        {
            txtLogin = findViewById(R.id.editTextID);
            txtPassword = findViewById(R.id.editTextPassword);
            login = txtLogin.getText().toString();
            motdepasse = txtPassword.getText().toString();
            if (login != null && motdepasse !=null ) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("login", login);
                bundle.putString("password", motdepasse);
                intent.putExtras(bundle);
                startActivity(intent);
            }
            else
                {
                    Toast.makeText(LoginActivity.this, "Erreur de connexion, le login et/ou le mot de passe est vide !", Toast.LENGTH_SHORT).show();
            }
        }
    }
