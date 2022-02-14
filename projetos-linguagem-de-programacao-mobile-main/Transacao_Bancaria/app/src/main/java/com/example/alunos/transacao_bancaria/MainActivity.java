package com.example.alunos.transacao_bancaria;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgTipo;
    RadioGroup rgCli;
    RadioButton rbPoup;
    RadioButton rbCorr;
    RadioButton rbFisica;
    RadioButton rbJuridica;
    Spinner spTransacao;
    EditText etValor;
    Button btEnviar;
    TextView tvResposta;
    Transacao t;

    public void carregaDados(){
        rgTipo = (RadioGroup) findViewById(R.id.rg_tipo);
        rgCli = (RadioGroup) findViewById(R.id.rg_cli);
        rbPoup = (RadioButton) findViewById(R.id.rb_poup);
        rbCorr = (RadioButton) findViewById(R.id.rb_corr);
        rbFisica = (RadioButton) findViewById(R.id.rb_fisica);
        rbJuridica = (RadioButton) findViewById(R.id.rb_juridica);
        spTransacao = (Spinner) findViewById(R.id.sp_transacao);
        etValor = (EditText) findViewById(R.id.et_valor);
        btEnviar = (Button) findViewById(R.id.bt_enviar);
        tvResposta = (TextView) findViewById(R.id.tv_resposta);
        t = new Transacao();
    }
    public void criaSelecao(){
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(
                this,
                R.array.transacao,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTransacao.setAdapter(adapter);
        spTransacao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String nomeItem = (String) adapterView.getItemAtPosition(i);
                if(nomeItem.equals("Depositar")){
                    t.deposito();
                    t.setControl(nomeItem);
                }else if(nomeItem.equals("Saque")){
                    t.saque();
                    t.setControl(nomeItem);
                }else if(nomeItem.equals("Saldo")){
                    t.getSaldo();
                    t.setControl(nomeItem);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private void alert(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("operação realizada com sucesso!");
        builder.create().show();
    }
    private void verificaRadio(){
        rgTipo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i==R.id.rb_poup){
                    t.poupanca();
                }else if (i==R.id.rb_corr){
                    t.corrente();
                }else{
                    Toast.makeText(MainActivity.this,"Erro", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void verificaRadio2(){
        rgCli.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i==R.id.rb_fisica){
                    Toast.makeText(MainActivity.this,"Pessoa Física",Toast.LENGTH_SHORT).show();
                }else if (i==R.id.rb_juridica){
                    Toast.makeText(MainActivity.this,"Pessoa Jurídica",Toast.LENGTH_SHORT).show();
                }else{

                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaDados();
        criaSelecao();
        verificaRadio();
        verificaRadio2();
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t.getControl().equals("Saldo")) {
                    alert();
                }
                else if(t.getControl().equals("Depositar")){
                    alert();
                } else if(t.getControl().equals("Saque")){
                    alert();
                }
                if (!t.getControl().equals("Saldo")){
                    t.setValor(Float.parseFloat(etValor.getText().toString()));
                }

                tvResposta.setText(t.toString());
            }

        });
    }
}
