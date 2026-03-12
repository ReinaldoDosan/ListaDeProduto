package com.example.listadeproduto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeproduto.Adapter.AdapterProdutos
import com.example.listadeproduto.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewProdutos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerViewProdutos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewProdutos.setHasFixedSize(true)

        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProdutos = AdapterProdutos(this, listaProdutos)
        recyclerViewProdutos.adapter = adapterProdutos

        val produto1 = Produto(
            R.drawable.img1,
            nome = "Monitor",
            descricao = "Monitor de 24 polegadas",
            preco = "R$ 1000,00"
        )

        listaProdutos.add(produto1)
    }
}
