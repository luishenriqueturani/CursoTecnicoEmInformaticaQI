package com.example.alunos.avatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rbMasc;
    RadioButton rbFem;
    CheckBox cbSaia;
    CheckBox cbVestido;
    CheckBox cbSalto;
    CheckBox cbSandalia;
    CheckBox cbBiquini;
    CheckBox cbTenisF;
    CheckBox cbBarba;
    CheckBox cbOculos;
    CheckBox cbCalcao;
    CheckBox cbCalca;
    CheckBox cbSapato;
    CheckBox cbTenis;
    RadioButton rbBolsinha;
    RadioButton rbEspadachim;
    RadioButton rbArk;
    RadioButton rbLOL;
    Button btGerar;
    TextView tvResposta;
    LinearLayout llMuie;
    LinearLayout llHomi;
    Array a;

    public void carregaElementos(){
        rbMasc = (RadioButton) findViewById(R.id.rb_Masc);
        rbFem = (RadioButton) findViewById(R.id.rb_Fem);
        cbSaia = (CheckBox) findViewById(R.id.cb_saia);
        cbVestido = (CheckBox) findViewById(R.id.cb_vestido);
        cbSalto = (CheckBox) findViewById(R.id.cb_salto);
        cbSandalia = (CheckBox) findViewById(R.id.cb_sandalia);
        cbBiquini = (CheckBox) findViewById(R.id.cb_biquini);
        cbTenisF = (CheckBox) findViewById(R.id.cb_tenis_f);
        cbBarba = (CheckBox) findViewById(R.id.cb_barba);
        cbOculos = (CheckBox) findViewById(R.id.cb_oculos);
        cbCalcao = (CheckBox) findViewById(R.id.cb_calcao);
        cbCalca = (CheckBox) findViewById(R.id.cb_calca);
        cbSapato = (CheckBox) findViewById(R.id.cb_sapato);
        cbTenis = (CheckBox) findViewById(R.id.cb_tenis);
        rbBolsinha = (RadioButton) findViewById(R.id.rb_bolsinha);
        rbEspadachim = (RadioButton) findViewById(R.id.rb_espadachim);
        rbArk = (RadioButton) findViewById(R.id.rb_ark);
        rbLOL = (RadioButton) findViewById(R.id.rb_lol);
        btGerar = (Button) findViewById(R.id.bt_gerar);
        tvResposta = (TextView) findViewById(R.id.tv_resposta);
        a = new Array();
    }
    public void limpa(){
        if(rbMasc.isChecked()){

        }
        if(rbFem.isChecked()){

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
