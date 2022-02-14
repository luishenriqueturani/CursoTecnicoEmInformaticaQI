package com.example.alunos.menupadrao;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItens;
    ArrayAdapter<String> adapter;
    ArrayList<String> alItens;

    private void carregaElementos(){
        lvItens = (ListView) findViewById(R.id.lv_item);
    }

    private void  carregaListView(){
        alItens = new ArrayList<>();
        alItens.add("Item 1");
        alItens.add("Item 2");
        alItens.add("Item 3");
        adapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, alItens);
        lvItens.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu_limpar:
                alItens.clear();
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "ListView Vasio!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_recarregar:
                carregaListView();
                return true;
            case R.id.menu_sobre:
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).
                        setTitle(R.string.app_name).setMessage("Versão 1.0").create();
                alertDialog.show();
                return true;
        }
        return false;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //verifica se o item clicado é uma lv
        if (v.getId()==R.id.lv_item){
            //carrega o menu
            getMenuInflater().inflate(R.menu.itens, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //pega o id do item selecionado (posição do sub menu)
        int id = item.getItemId();
        //Transforma o adapter em um menu de contexto
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        //posição do item do menu (Posição do list view)
        int pos = menuInfo.position;
        //valor selecionado (valor do texto do list view)
        String itemSelecionado = alItens.get(pos);
        switch (id){
            case R.id.menu_detalhes:
                Toast.makeText(MainActivity.this, itemSelecionado, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_excluir:
                alItens.remove(pos);
                adapter.notifyDataSetChanged();
                return true;

        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
