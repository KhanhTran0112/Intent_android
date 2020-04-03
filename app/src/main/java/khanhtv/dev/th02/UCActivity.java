package khanhtv.dev.th02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UCActivity extends AppCompatActivity {

    TextView txtGreeting;
    ListView listView;
    ArrayList<SinhVien> sinhViens;
    Button btnGetdata;
    SinhVien sv;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_c);

        txtGreeting = findViewById(R.id.txtGreeting);


        intent = getIntent();
        String ten = intent.getStringExtra("data");

        txtGreeting.setText("Xin chào: "+ ten);

        listView = (ListView) findViewById(R.id.lvSinhVien);
        sinhViens = new ArrayList<SinhVien>();
        sinhViens.add(new SinhVien("Trần Văn A", "20"));
        sinhViens.add(new SinhVien("Trần Văn B", "21"));
        sinhViens.add(new SinhVien("Trần Văn C", "22"));
        sinhViens.add(new SinhVien("Trần Văn D", "23"));
        sinhViens.add(new SinhVien("Trần Văn E", "24"));
        sinhViens.add(new SinhVien("Trần Văn F", "25"));

        SinhVienAdapter sinhVienAdapter = new SinhVienAdapter(UCActivity.this, R.layout.item_sinhvien, sinhViens);
        listView.setAdapter(sinhVienAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtGreeting.setText("Đã chọn 1 sinh viên");
                sv = new SinhVien(""+sinhViens.get(position).name, ""+sinhViens.get(position).age);
            }
        });

        btnGetdata = findViewById(R.id.btnGetData);

        btnGetdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(UCActivity.this, KetQua.class);
                intent.putExtra("data1", (Serializable) sv);
                startActivity(intent);
            }
        });
    }
}
