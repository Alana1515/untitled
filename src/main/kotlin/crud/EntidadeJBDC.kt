package br.unipar.crud

import  java.sql.Connection
import java.sql.DriverManager

class EntidadeJBDC {

    val conectar = EntidadeJBDC(
        val usuario: String,
        val url: String,
        val senha: String
    )
    fun connectarComBanco() : Connection?{
        try{
            val conneccao : Connection =
                DriverManager.getConnection(
                    this.url, this.usuario, this.senha
                )
            println("Connectou!")

            return conneccao
        }catch (erro : Exception){
            println(erro.printStackTrace())
        }
        return null
    }



}