package com.example.mercadolivreclone;

import static android.widget.Toast.*;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder> {
    private Context contexto;
    private List<Produto> produtos;

    public ProdutoAdapter(Context contexto, List<Produto> produtos) {
        this.contexto = contexto;
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.produto_detalhe, parent, false);
        return new ProdutoViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, int position) {
        Produto produto = produtos.get(position);
        holder.textoStatus.setText(produto.getStatus());
        holder.textoDataCompra.setText(produto.getDataCompra());
        holder.textoDataEntrega.setText(produto.getDataEntrega());
        holder.imagemProduto.setImageResource(produto.getImagem());
        holder.itemView.setOnClickListener(v -> {
            mostrarTela(produto);
        });
    }

    private void mostrarTela(Produto produto) {
        AlertDialog.Builder builder = new AlertDialog.Builder(contexto);
        builder.setTitle(produto.getNome());

        View dialogView = LayoutInflater.from(contexto).inflate(R.layout.dialog_produto, null);
        ImageView imageView = dialogView.findViewById(R.id.imagem);
        TextView textView = dialogView.findViewById(R.id.nome);

        imageView.setImageResource(produto.getImagem());
        textView.setText(produto.getNome());

        builder.setView(dialogView);
        builder.setPositiveButton("Fechar", (dialog, which) -> dialog.dismiss());

        builder.show();
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public class ProdutoViewHolder extends RecyclerView.ViewHolder {
        private TextView textoStatus;
        private TextView textoDataCompra;
        private TextView textoDataEntrega;
        private ImageView imagemProduto;

        public ProdutoViewHolder(@NonNull View itemView) {
            super(itemView);
            textoStatus = itemView.findViewById(R.id.textoStatus);
            textoDataCompra = itemView.findViewById(R.id.textoDataCompra);
            textoDataEntrega = itemView.findViewById(R.id.textoDataEntrega);
            imagemProduto = itemView.findViewById(R.id.imagem);
        }
    }
}
