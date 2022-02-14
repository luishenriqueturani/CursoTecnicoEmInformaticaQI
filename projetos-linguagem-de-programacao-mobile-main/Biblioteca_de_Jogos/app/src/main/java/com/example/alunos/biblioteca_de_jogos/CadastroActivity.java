package com.example.alunos.biblioteca_de_jogos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    EditText etId;
    EditText etNome;
    EditText etPreco;
    EditText etPlataforma;
    Button btCadastrar;
    Spinner spGenero;
    String classi;
    String GeneroG;


    public void carregaElementos(){
        etId = (EditText) findViewById(R.id.et_id);
        etNome = (EditText) findViewById(R.id.et_nome);
        etPreco = (EditText) findViewById(R.id.et_preco);
        spGenero= (Spinner) findViewById(R.id.sp_genero);
        etPlataforma = (EditText) findViewById(R.id.et_plataforma);
        btCadastrar = (Button) findViewById(R.id.bt_cadastrar);
    }
    public String criaSelecao() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.genero, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spGenero.setAdapter(adapter);

        spGenero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String genero=(String) adapterView.getItemAtPosition(i);
                GeneroG = genero;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    return GeneroG;
    }
    public void cadastrar(){
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ControladorBanco crud = new ControladorBanco(getBaseContext());
                String nome = etNome.getText().toString();
                float preco = Float.parseFloat(etPreco.getText().toString());
                String genero = GeneroG;
                String plataforma = etPlataforma.getText().toString();

                int id = Integer.parseInt(etId.getText().toString());
                if(GeneroG.equals("Terror") || GeneroG.equals("Adulto")){
                    classi="+18";
                }else if (GeneroG.equals("FPS") || GeneroG.equals("RPG")){
                    classi="+16";
                }else if (GeneroG.equals("Sobrevivência") || GeneroG.equals("RTS")){
                    classi="+14";
                }else if (GeneroG.equals("Aventura") || GeneroG.equals("Corrida")){
                    classi="+10";
                }else {
                    classi="Livre";
                }
                String resultado = crud.inserirDados(id, nome, preco, genero, plataforma, classi);

                Toast.makeText(CadastroActivity.this, resultado, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(CadastroActivity.this, ListagemActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        carregaElementos();
        cadastrar();
        criaSelecao();
    }
}
