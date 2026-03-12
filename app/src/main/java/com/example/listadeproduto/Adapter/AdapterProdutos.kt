package com.example.listadeproduto.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeproduto.R
import com.example.listadeproduto.model.Produto

class AdapterProdutos(private val context: Context, private val produtos: MutableList<Produto>) :
    RecyclerView.Adapter<AdapterProdutos.ProdutoViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProdutoViewHolder {
        val viewLista = LayoutInflater.from(context).inflate(R.layout.hardware_item, parent, false)
        return ProdutoViewHolder(viewLista)
    }

    override fun onBindViewHolder(
        holder: ProdutoViewHolder,
        position: Int
    ) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco
    }

    override fun getItemCount(): Int = produtos.size

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.imageProduto)
        val nome: TextView = itemView.findViewById(R.id.textNomeProduto)
        val descricao: TextView = itemView.findViewById(R.id.textDecricaoProduto)
        val preco: TextView = itemView.findViewById(R.id.precoProduto)
    }
}
