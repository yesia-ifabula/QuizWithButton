package com.yesia.quizwithbutton;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_soal)
    ImageView ivSoal;
    @BindView(R.id.tv_soal)
    TextView tvSoal;
    @BindView(R.id.btnn_pilihan_a)
    Button btnnPilihanA;
    @BindView(R.id.btnn_pilihan_b)
    Button btnnPilihanB;
    @BindView(R.id.btnn_pilihan_c)
    Button btnnPilihanC;
    @BindView(R.id.btnn_pilihan_d)
    Button btnnPilihanD;
    @BindView(R.id.btn_penjelasan_next)
    Button btnPenjelasanNext;
    @BindView(R.id.btn_soal_next)
    Button btnSoalNext;
    @BindView(R.id.tv_penjelasan)
    TextView tvPenjelasan;

    int nomor = 0;
    public static int hasil, benar, salah;
    public static MediaPlayer mediaPlayer;

    String[] pertanyaan_kuis = new String[]{
            "1. salah satu personil snsd yang keluar dari groupnya pada tahun 2014, dan saya merasa sangat sedih adalah?",
            "2. Siapakah biasku di DBSK?",
            "3. Yang Bukan Anggota Blackpink antara lain?",
            "4. Aku harus nyanyi lagu apa hari minggu?",
            "5. ITZY adalah salah satu girlsband naungan agensi?"
    };

    String[] jawaban_kuis = new String[]{
            "A. Yuri", "B. Tifany", "C. Jessica", "D. Krystal",
            "A. Junsu", "B. Yunho", "C. Jaejoong", "D.Changmin",
            "A. Jennie", "B. Lisa", "C. Rose", "D. Jia",
            "A. kada tahu", "B. molla", "C. terserah", "D. apa aja deh boleh",
            "A. YG", "B. JYP", "C. SM", "D. Starship",
    };

    String[] jawaban_benar = new String[]{
            "C. Jessica",
            "A. Junsu",
            "D. Jia",
            "B. molla",
            "B. JYP",
    };
    String[] penjelasan_jawaban = new String[]{
            "Jessica adalah bias saya",
            "Junsu juga adalah bias saya",
            "Aggota Blackpink adalah Jennie, Jisoo, Lisa dan Rose",
            "Ya molla, siapa yang tau coba",
            "ITZY adalah jebolan agensi JYP",
    };
    int[] suaraSoal = new int[]{

            R.raw.listening_part_one_q_satu,
            R.raw.listening_part_one_q_dua,
            R.raw.listening_part_one_q_tiga,
            R.raw.listening_part_one_q_empat,
            R.raw.listening_part_one_q_lima
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        tvSoal.setText(pertanyaan_kuis[nomor]);
        btnnPilihanA.setText(jawaban_kuis[0]);
        btnnPilihanB.setText(jawaban_kuis[1]);
        btnnPilihanC.setText(jawaban_kuis[2]);
        btnnPilihanD.setText(jawaban_kuis[3]);


        //reset nilai ketika mengulang soal
        benar = 0;
        salah = 0;



    }

    @OnClick({R.id.btnn_pilihan_a, R.id.btnn_pilihan_b, R.id.btnn_pilihan_c, R.id.btnn_pilihan_d, R.id.btn_penjelasan_next, R.id.btn_soal_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnn_pilihan_a:
                break;
            case R.id.btnn_pilihan_b:
                break;
            case R.id.btnn_pilihan_c:
                break;
            case R.id.btnn_pilihan_d:
                break;
            case R.id.btn_penjelasan_next:
                break;
            case R.id.btn_soal_next:
                break;
        }
    }
}