package br.com.camilabalat.agenda;

import android.app.Fragment;
import android.widget.EditText;
import android.widget.RatingBar;

import br.com.camilabalat.agenda.modelo.Aluno;

public class FormularioHelper {

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity){

        EditText campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        EditText campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        EditText campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        EditText campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        RatingBar campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);

    }

    public Aluno pegaAluno(){
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }
}
