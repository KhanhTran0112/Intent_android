package khanhtv.dev.th02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class KetQua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        Intent intent = getIntent();
        SinhVien sv = (SinhVien) intent.getSerializableExtra("data1");

        TextView txtName = (TextView) findViewById(R.id.txtKQName);
        txtName.setText(sv.name.toString());

        TextView txtAge = (TextView) findViewById(R.id.txtKQAge);
        txtAge.setText(sv.age.toString());
    }
}
