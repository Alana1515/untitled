package br.unipar.crud

import java.sql.Connection
import java.sql.DriverManager

class EntidadeJDBC(
    val usuario: String,
    val url: String,
    val senha:String

) {
    fun connectarComBanco() : Connection?{ // ? aceita o valor null
        // quando precisa fazer algo que possa falhar
        try {
            val conneccao : Connection =
                DriverManager.getConnection(// cada banco tem o seu driver
                    // quando instanciar os atributos abaixar
                    this.url, this.usuario, this.senha
                )
            println("Connectou")

            return conneccao
        }catch (erro : Exception){
            println(erro.printStackTrace())
        }
        return  null


    }

}