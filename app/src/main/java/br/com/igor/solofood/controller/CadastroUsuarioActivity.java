package br.com.igor.solofood.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.igor.solofood.R;
import br.com.igor.solofood.model.Usuario;

public class CadastroUsuarioActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtTelefone;
    EditText txtEmail;
    EditText txtSenha;
    Button cadastrar;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        txtNome = findViewById(R.id.nomeCadastro);
        txtTelefone = findViewById(R.id.foneCadastro);
        txtEmail = findViewById(R.id.emailCadastro);
        txtSenha = findViewById(R.id.senhaCadastro);
        cadastrar = findViewById(R.id.botaoCadastrar);
        login = findViewById(R.id.botaoTelaInicial);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = txtNome.getText().toString();
                String telefone = txtTelefone.getText().toString();
                String email = txtEmail.getText().toString();
                String senha = txtSenha.getText().toString();

                Usuario usuario = new Usuario(nome, telefone, email, senha);


                if(validate(nome, telefone, email, senha)){
                    cadastrar(usuario);
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void cadastrar(Usuario usuario) {

        Intent intent = new Intent(getApplicationContext(), PedidoActivity.class);
        startActivity(intent);
    }

    private boolean validate(String nome, String telefone, String email, String senha) {

        if (nome == null || nome.trim().length() == 0) {
            Toast.makeText(this, "Digite um nome", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(telefone == null || telefone.trim().length() == 0){
            Toast.makeText(this, "Digite um telefone", Toast.LENGTH_SHORT).show();
        }

        if(email == null || email.trim().length() == 0){
            Toast.makeText(this,"Digite um email", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (senha == null || senha.trim().length() == 0) {
            Toast.makeText(this, "Digite uma senha", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}
