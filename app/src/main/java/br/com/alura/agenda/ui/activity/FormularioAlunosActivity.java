package br.com.alura.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.com.alura.agenda.R;
import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class FormularioAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        setTitle("Novo aluno");
        final AlunoDAO dao = new AlunoDAO();

        final TextView campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final TextView campoTefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final TextView campoEmail = findViewById(R.id.activity_formulario_aluno_email);

        View botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
    botaoSalvar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nome = campoNome.getText().toString();
            String telefone = campoTefone.getText().toString();
            String email = campoEmail.getText().toString();

            Aluno alunoCriado = new Aluno(nome, telefone, email);
            dao.salva(alunoCriado);

            finish();
        }
    });
    }
}