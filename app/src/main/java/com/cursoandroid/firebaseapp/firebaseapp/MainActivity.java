package com.cursoandroid.firebaseapp.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseDatabase = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseDatabase.child("usuarios");
    private DatabaseReference produtoReferencia = databaseDatabase.child("produtos").child("001");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Usuario usuario = new Usuario();
//        usuario.setNome("Ana Helena");
//        usuario.setSobrenome("Silva");
//        usuario.setIdade(25);
//        usuario.setSexo("Feminino");
//
//        usuarioReferencia.child("003").setValue(usuario);

//        Produto produto = new Produto();
//        produto.setDescricao("Notebook WP40");
//        produto.setCor("Branco");
//        produto.setFabricante("HP");
//
//        produtoReferencia.child("001").setValue(produto);

//        produtoReferencia.addValueEventListener(new ValueEventListener(){
//
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Log.i("Firebasex",dataSnapshot.getValue().toString());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });

        usuarioReferencia.addValueEventListener(new ValueEventListener(){

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i("Firebasex",dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
