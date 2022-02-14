package com.example.alunos.alugueltemporada;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class MainActivity extends AppCompatActivity {

    Spinner spQuartos;
    Button btEnviar;
    TextView tvResultados;
    CalendarView cv_entrada;
    CalendarView cv_saida;

    public void carregados(){
        spQuartos = (Spinner) findViewById(R.id.sp_Quartos);
        btEnviar = (Button) findViewById(R.id.bt_Enviar);
        tvResultados = (TextView) findViewById(R.id.tv_Resultados);
        cv_entrada = (CalendarView) findViewById(R.id.cv_Entrada);
        cv_saida = (CalendarView) findViewById(R.id.cv_saida);
    }

    public void calendarios(){
        cv_entrada.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String  calendario = dayOfMonth+"/"+month+"/"+year;
                Toast.makeText(MainActivity.this,calendario, Toast.LENGTH_LONG).show();
            }
        });

        cv_saida.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                String calendario2 = dayOfMonth+"/"+month+"/"+year;
                Toast.makeText(MainActivity.this,calendario2,Toast.LENGTH_LONG).show();
            }
        });
    }

    public void criaSelecao(){
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(
                this,R.array.quarto, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spQuartos.setAdapter(adapter);
        spQuartos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregados();
        calendarios();



    }

}
