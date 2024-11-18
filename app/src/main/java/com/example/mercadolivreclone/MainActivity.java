package com.example.mercadolivreclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView viewProdutos;
    private List<Produto> produtos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewProdutos = findViewById(R.id.viewProdutos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        viewProdutos.setLayoutManager(layoutManager);

        criarProdutos();
        ProdutoAdapter produtoAdapter = new ProdutoAdapter(this, produtos);
        viewProdutos.setAdapter(produtoAdapter);
    }

    public void criarProdutos() {
        produtos.add(new Produto("Impressora Multifuncional", "A caminho", "14 de novembro", "Chegará terça-feira dia 19 de novembro", R.drawable.impressora_multifuncional));
        produtos.add(new Produto("Mesa de Escritório", "A caminho", "13 de novembro", "Chegará quinta-feira dia 21 de novembro", R.drawable.mesa_de_escritorio));
        produtos.add(new Produto("Ar Condicionado 9000BTU", "A caminho", "11 de novembro", "Chegará segunda-feira dia 25 de novembro", R.drawable.ar_condicionado));
        produtos.add(new Produto("Notebook Gamer Omen X", "A caminho", "10 de novembro", "Chegará quarta-feira dia 20 de novembro", R.drawable.omen_x));
        produtos.add(new Produto("Cafeteira Elétrica", "A caminho", "8 de novembro", "Chegará segunda-feira dia 18 de novembro", R.drawable.cafeteira_eletrica));
        produtos.add(new Produto("Kit de Panelas Antiaderentes", "A caminho", "7 de novembro", "Chegará terça-feira dia 19 de novembro", R.drawable.kit_panelas));
        produtos.add(new Produto("Geladeira Inox 300L", "A caminho", "6 de novembro", "Chegará quarta-feira dia 20 de novembro", R.drawable.geladeira_inox));
        produtos.add(new Produto("Celular A15", "Entregue", "14 de novembro", "Chegou no dia 15 de novembro", R.drawable.a15));
        produtos.add(new Produto("Fone de Ouvido Bluetooth", "Entregue", "12 de novembro", "Chegou no dia 14 de novembro", R.drawable.fone_de_ouvido));
        produtos.add(new Produto("Microfone Condensador", "Entregue", "9 de novembro", "Chegou no dia 11 de novembro", R.drawable.microfone_condensador));
        produtos.add(new Produto("Xiaomi Watch S3", "Entregue", "5 de novembro", "Chegou no dia 7 de novembro", R.drawable.xiaomi_watch_s3));
        produtos.add(new Produto("Cadeira de Escritório Ergonômica", "Entregue", "4 de novembro", "Chegou no dia 6 de novembro", R.drawable.cadeira_escritorio));
        produtos.add(new Produto("Câmera de Segurança Wi-Fi", "Entregue", "3 de novembro", "Chegou no dia 4 de novembro", R.drawable.camera_de_seguranca));
        produtos.add(new Produto("Lâmpada LED Inteligente", "Entregue", "1 de novembro", "Chegou no dia 4 de novembro", R.drawable.lampada_smart));
    }
}