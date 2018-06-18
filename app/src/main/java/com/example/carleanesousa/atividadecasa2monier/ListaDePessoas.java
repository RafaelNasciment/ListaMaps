package com.example.carleanesousa.atividadecasa2monier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListaDePessoas extends AppCompatActivity {
    ListView lista;
    String[] nomes ={"João","Maria", "José","Julesca",
            "Suzane","Janiele","Jaqueline", "Eliane","Rafael","Carleane",
            "Larah", "Sarah","Aline","Beijamin","Carlene",
            "Graça","Kauãn", "Arthur", "Carol", "Marcela"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_pessoas);

        lista = (ListView) findViewById(R.id.List_nomes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nomes);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Intem clicado"
                        + i,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
