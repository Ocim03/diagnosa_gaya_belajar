package com.codelabs.diagnosagayabelajarsiswa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.codelabs.diagnosagayabelajarsiswa.R;

import java.text.DecimalFormat;

public class DiagnosaActivity extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    Button diagnosa;
    DecimalFormat f = new DecimalFormat("###");

    public static String Visual, Pendengaran, Kinastetik;
    double kemungkinan1 = 1;
    double kemungkinan2 = 2;
    double kemungkinan3 = 3;
    double kemungkinan4 = 4;
    double kemungkinan5 = 5;
    double kemungkinan6 = 6;
    double kemungkinan7 = 7;
    double kemungkinan8 = 8;
    double kemungkinan9 = 9;

    double gaya1 =1;
    double gaya2 =2;
    double gaya3 =3;
    double gaya4 =4;
    double gaya5 =5;
    double gaya6 =6;
    double gaya7 =7;
    double gaya8 =8;
    double gaya9 =9;

    double Kerusakan = 9;

    double G1A, G1B,G1C,G1D, G1E, G1F, G1G, G1H, G1I;
    double G2A, G2B,G2C,G2D, G2E, G2F, G2G, G2H, G2I;
    double G3A, G3B,G3C,G3D, G3E, G3F, G3G, G3H, G3I;
    double G4A, G4B,G4C,G4D, G4E, G4F, G4G, G4H, G4I;
    double G5A, G5B,G5C,G5D, G5E, G5F, G5G, G5H, G5I;
    double G7A, G7B,G7C,G7D, G7E, G7F, G7G, G7H, G7I;
    double G8A, G8B,G8C,G8D, G8E, G8F, G8G, G8H, G8I;
    double G9A, G9B,G9C,G9D, G9E, G9F, G9G, G9H, G9I2;


    double K1;
    double K2;
    double K3;
    double K4;
    double K5;
    double K6;
    double K7;
    double K8;
    double K9;

    double HasilK1;
    double HasilK2;
    double HasilK3;
    double HasilK4;
    double HasilK5;
    double HasilK6;
    double HasilK7;
    double HasilK8;
    double HasilK9;

    double Hasil1;
    double Hasil2;
    double Hasil3;
    double Hasil4;
    double Hasil5;
    double Hasil6;
    double Hasil7;
    double Hasil8;
    double Hasil9;

    double Nilai_bayes1;
    double Nilai_bayes2;
    double Nilai_bayes3;
    double Nilai_bayes4;
    double Nilai_bayes5;
    double Nilai_bayes6;
    double Nilai_bayes7;
    double Nilai_bayes8;
    double Nilai_bayes9;
    double Hasil_total10;

    double Hasil_total;

    double Persentase;
    double Persentase1;
    double Persentase2;
    double Persentase3;
    double Persentase4;
    double Persentase5;
    double Persentase6;
    double Persentase7;
    double Persentase8;
    double Persentase9;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        c1          = findViewById(R.id.checkbox_gejala1);
        c2          = findViewById(R.id.checkbox_gejala2);
        c3          = findViewById(R.id.checkbox_gejala3);
        c4          = findViewById(R.id.checkbox_gejala4);
        c5          = findViewById(R.id.checkbox_gejala5);
        c6          = findViewById(R.id.checkbox_gejala6);
        c7          = findViewById(R.id.checkbox_gejala7);
        c8          = findViewById(R.id.checkbox_gejala8);
        c9          = findViewById(R.id.checkbox_gejala9);
        diagnosa    = findViewById(R.id.btn_diagnosa);


        Teorema();

    }

    private void Teorema() {


        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Visual = f.format(0);
                Pendengaran = f.format(0);
                Kinastetik = f.format(0);

                if(c1.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes1 = HasilK1+0;
                    Hasil_total = Nilai_bayes1 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Visual = f.format(Persentase);

                }

                if(c2.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes2 = HasilK1;
                    Hasil_total = Nilai_bayes2 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Pendengaran = f.format(Persentase);
                }

                if(c2.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya2;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes3 = HasilK1;
                    Hasil_total = Nilai_bayes3 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Kinastetik = f.format(Persentase);

                }

                if(c4.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes4 = HasilK1;
                    Hasil_total = Nilai_bayes4 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Visual = f.format(Persentase);
                }

                if(c5.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes5 = HasilK1;
                    Hasil_total = Nilai_bayes5 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Pendengaran = f.format(Persentase);
                }

                if(c6.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes6 = HasilK1;
                    Hasil_total = Nilai_bayes7 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Kinastetik = f.format(Persentase);
                }

                if(c7.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = (K1*G1A)/(K1 * G1A);
                    HasilK1 = Hasil1;
                    Nilai_bayes7 = HasilK1;
                    Hasil_total = Nilai_bayes7 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Visual = f.format(Persentase);
                }

                if(c8.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes8 = HasilK1;
                    Hasil_total = Nilai_bayes8 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Pendengaran = f.format(Persentase);
                }

                if(c9.isChecked()){
                    K1 = kemungkinan1/Kerusakan;
                    G1A = kemungkinan1/gaya1;
                    Hasil1 = 1.0 / 2;
                    HasilK1 = Hasil1;
                    Nilai_bayes9 = HasilK1;
                    Hasil_total = Nilai_bayes9 + 0;

                    Persentase = (Hasil_total/Hasil_total)*100;
                    Kinastetik = f.format(Persentase);
                }


                if (c1.isChecked()){
                    if(c2.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya2;
                        G2A = 0/gaya2;
                        Hasil1 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1;

                        K2 = kemungkinan1/Kerusakan;
                        G1B = 0/gaya2;
                        G2B = kemungkinan1/gaya2;
                        Hasil2 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK2 = Hasil2;
                        Nilai_bayes2 = HasilK2;
                        Hasil_total = Nilai_bayes1 + Nilai_bayes2;


                        Persentase1 = (Nilai_bayes1/Hasil_total)*100;
                        Persentase2 = (Nilai_bayes2/Hasil_total)*100;
                        Visual = f.format(Persentase1);
                        Pendengaran = f.format(Persentase2);

                    }
                }

                if (c1.isChecked()){
                    if(c3.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya2;
                        G2A = 0/gaya2;
                        Hasil1 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1;

                        K2 = kemungkinan1/Kerusakan;
                        G1B = 0/gaya2;
                        G2B = kemungkinan1/gaya2;
                        Hasil2 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK2 = Hasil2;
                        Nilai_bayes2 = HasilK2;

                        Hasil_total = Nilai_bayes1 + Nilai_bayes2;
                        Persentase1 = (Nilai_bayes1/Hasil_total)*100;
                        Persentase2 = (Nilai_bayes3/Hasil_total)*100;
                        Visual = f.format(Persentase1);
                        Kinastetik = f.format(Persentase2);

                    }
                }

                if (c1.isChecked()){
                    if(c4.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya1;
                        Hasil1 = 1.0;
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1+0;
                        Hasil_total = Nilai_bayes1 + 0;

                        Persentase = (Hasil_total/Hasil_total)*100;
                        Visual = f.format(Persentase);

                    }
                }

                if (c1.isChecked()){
                    if(c5.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya2;
                        G2A = 0/gaya2;
                        Hasil1 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1;

                        K2 = kemungkinan1/Kerusakan;
                        G1B = 0/gaya2;
                        G2B = kemungkinan1/gaya2;
                        Hasil2 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK2 = Hasil2;
                        Nilai_bayes2 = HasilK2;

                        Hasil_total = Nilai_bayes1 + Nilai_bayes2;


                        Persentase1 = (Nilai_bayes1/Hasil_total)*100;
                        Persentase2 = (Nilai_bayes2/Hasil_total)*100;
                        Visual = f.format(Persentase1);
                        Pendengaran = f.format(Persentase2);

                    }
                }

                if (c1.isChecked()){
                    if(c6.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya2;
                        G2A = 0/gaya2;
                        Hasil1 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1;

                        K2 = kemungkinan1/Kerusakan;
                        G1B = 0/gaya2;
                        G2B = kemungkinan1/gaya2;
                        Hasil2 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK2 = Hasil2;
                        Nilai_bayes2 = HasilK2;

                        Hasil_total = Nilai_bayes1 + Nilai_bayes2;


                        Persentase1 = (Nilai_bayes1/Hasil_total)*100;
                        Persentase2 = (Nilai_bayes2/Hasil_total)*100;
                        Visual = f.format(Persentase1);
                        Kinastetik = f.format(Persentase2);

                    }
                }

                if (c1.isChecked()){
                    if(c7.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya1;
                        Hasil1 = 1.0;
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1+0;
                        Hasil_total = Nilai_bayes1 + 0;

                        Persentase = (Hasil_total/Hasil_total)*100;
                        Visual = f.format(Persentase);

                    }
                }

                if (c1.isChecked()){
                    if(c8.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya2;
                        G2A = 0/gaya2;
                        Hasil1 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1;

                        K2 = kemungkinan1/Kerusakan;
                        G1B = 0/gaya2;
                        G2B = kemungkinan1/gaya2;
                        Hasil2 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK2 = Hasil2;
                        Nilai_bayes2 = HasilK2;

                        Hasil_total = Nilai_bayes1 + Nilai_bayes2;


                        Persentase1 = (Nilai_bayes1/Hasil_total)*100;
                        Persentase2 = (Nilai_bayes2/Hasil_total)*100;
                        Visual = f.format(Persentase1);
                        Pendengaran = f.format(Persentase2);

                    }
                }

                if (c1.isChecked()){
                    if(c9.isChecked()){
                        K1 = kemungkinan1/Kerusakan;
                        G1A = kemungkinan1/gaya2;
                        G2A = 0/gaya2;
                        Hasil1 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK1 = Hasil1;
                        Nilai_bayes1 = HasilK1;

                        K2 = kemungkinan1/Kerusakan;
                        G1B = 0/gaya2;
                        G2B = kemungkinan1/gaya2;
                        Hasil2 = (G1A)*(G2B)/(K1 * G1A)+(K1 * G2B);
                        HasilK2 = Hasil2;
                        Nilai_bayes2 = HasilK2;

                        Hasil_total = Nilai_bayes1 + Nilai_bayes2;


                        Persentase1 = (Nilai_bayes1/Hasil_total)*100;
                        Persentase2 = (Nilai_bayes2/Hasil_total)*100;
                        Visual = f.format(Persentase1);
                        Kinastetik = f.format(Persentase2);

                    }
                }


                startActivity(new Intent(getApplicationContext(), HasilDiagnosaActivity.class));
            }
        });
    }
}