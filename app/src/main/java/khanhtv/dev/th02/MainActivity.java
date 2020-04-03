package khanhtv.dev.th02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtUsername, txtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.username);
        txtPass = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = "admin";
                String pass = "admin";
                if (txtUsername.getText().toString().equals(user)  && txtPass.getText().toString().equals(pass)){
                    Intent intent = new Intent(MainActivity.this, UCActivity.class);
                    String a = txtUsername.getText().toString();
                    intent.putExtra("data", a.toString());
                    startActivity(intent);
                }
            }
        });

    }
}
