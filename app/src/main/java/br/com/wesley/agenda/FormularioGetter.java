package br.com.wesley.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.wesley.agenda.modelo.Contato;

public class FormularioGetter {
    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoEmail;

    private Contato contato;

    public FormularioGetter(FormularioActivity Activity){
        campoNome = (EditText) Activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText) Activity.findViewById(R.id.formulario_endereço);
        campoTelefone = (EditText) Activity.findViewById(R.id.formulario_telefone);
        campoEmail = (EditText) Activity.findViewById(R.id.formulario_email);
        contato = new Contato();
    }

    public Contato getAluno() {
        contato.setNome(campoNome.getText().toString());
        contato.setEndereço(campoEndereco.getText().toString());
        contato.setTelefone(campoTelefone.getText().toString());
        contato.setSite(campoEmail.getText().toString());
        return contato;
    }

    public void preencheFormulario(Contato contato) {
        campoNome.setText(contato.getNome());
        campoEndereco.setText(contato.getEndereço());
        campoTelefone.setText(contato.getTelefone());
        campoEmail.setText(contato.getSite());
        this.contato = contato;
    }
}
