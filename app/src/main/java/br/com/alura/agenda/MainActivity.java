package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Baby", "Barrence", "Silva", "João", "Maria"));
        ListView listaDeAlunos = findViewById(R.id.activity_id_list_name);
        listaDeAlunos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, alunos));
    }
}
