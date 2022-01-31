package com.codelabs.diagnosagayabelajarsiswa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.codelabs.diagnosagayabelajarsiswa.R;

import static java.lang.Integer.parseInt;

public class HasilDiagnosaActivity extends AppCompatActivity {

    TextView n1, n2, n3, hasil, text_hasil, nama;
    Button simpan;
    DataHelper dbHelper;

    public static String Visual, Pendengaran, Kinastetik;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_diagnosa);

        dbHelper = new DataHelper(this);

        n1 = findViewById(R.id.nilai1);
        n2 = findViewById(R.id.nilai2);
        n3 = findViewById(R.id.nilai3);
        hasil = findViewById(R.id.nilai);
        text_hasil = findViewById(R.id.hasil);
        nama    = findViewById(R.id.nama);
        simpan = findViewById(R.id.simpan);

        Visual = ""+DiagnosaActivity.Visual+"%";
        Pendengaran = ""+DiagnosaActivity.Pendengaran+"%";
        Kinastetik = ""+DiagnosaActivity.Kinastetik+"%";

        n1.setText(Visual);
        n2.setText(Pendengaran);
        n3.setText(Kinastetik);

        int A = parseInt(DiagnosaActivity.Visual);
        int B = parseInt(DiagnosaActivity.Pendengaran);
        int C = parseInt(DiagnosaActivity.Kinastetik);

        if(A >= B){
            if(A >= C){
                nama.setText("VISUAL");
                hasil.setText(n1.toString());
                text_hasil.setText("MENUURUT DIAGNOSA SISTEM SISWA MEMILIKI GAYA PEMBELAJARAN VISUAL");
            }
        }

        if(B > A){
            if(B >= C){
                nama.setText("PENDENGARAN");
                hasil.setText(n2.toString());
                text_hasil.setText("MENUURUT DIAGNOSA SISTEM SISWA MEMILIKI GAYA PEMBELAJARAN PENDENGARAN");
            }
        }

        if(C > B){
            if(C > A){
                nama.setText("VISUAL");
                hasil.setText(n3.toString());
                text_hasil.setText("MENUURUT DIAGNOSA SISTEM SISWA MEMILIKI GAYA PEMBELAJARAN KINASTETIK");
            }
        }



        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("INSERT INTO tiga(nama, nilai, hasil, Visual, Kinestetik, Pendengaran) values('" +
                        nama.getText().toString()+"','" +
                        hasil.getText().toString()+"','" +
                        text_hasil.getText().toString()+"','" +
                        n1.getText().toString()+"','" +
                        n3.getText().toString()+"','" +
                        n2.getText().toString()+"')");

                startActivity(new Intent(getApplicationContext(), RiwayatActivity.class));
                Toast.makeText(getApplicationContext(), "Data Berhasil Tersimpan", Toast.LENGTH_LONG).show();
            }
        });
    }

}