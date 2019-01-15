package br.com.camilabalat.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.com.camilabalat.agenda.dao.AlunoDAO;
import br.com.camilabalat.agenda.modelo.Aluno;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        AlunoDAO dao = new AlunoDAO(this);
        List<Aluno> alunos = dao.buscaAlunos();
        dao.close();

        ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);
        ArrayAdapter<Aluno> adapter = new ArrayAdapter<Aluno>(this,  android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

        Button novoAluno = (Button) findViewById(R.id.novo_alunos);


        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intentVaiProFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });

//        String [] alunos= {"Daniel","Ronaldo", "Jeferson", "Felipe","Ronaldo", "Jeferson", "Felipe","Ronaldo", "Jeferson", "Felipe","Ronaldo", "Jeferson", "Felipe"};
//        ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
//        listaAlunos.setAdapter(adapter);
//
//        Button novoAluno = (Button) findViewById(R.id.novo_alunos);
//
//        novoAluno.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)  {
//                Intent intentVaiProFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
//                startActivity(intentVaiProFormulario);
//            }
//        });
    }
}