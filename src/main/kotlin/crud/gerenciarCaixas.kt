package br.unipar.crud

import entidades.CaixaDAgua
import enumeradores.Material
import java.math.BigDecimal

fun criarTabelaCaixa(){
    val connectar = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432/",
        usuario ="postgres",
        senha = "postgres"
    )

    val sql = "CREATE TABLE IF NOT EXISTS CaixaDAgua (" +
            "id serial NOT NULL PRIMARY KEY, " +
            "capacidade float, " +
            "cor varchar(255), " +
            "peso float, " +
            "preco varchar(255), " +
            "altura float, " +
            "profundidade float, " +
            "largura varchar(255), " +
            "duracao float, " +
            "conteudo float, " +
            "material varchar(255)" +
            ")"

    val banco = connectar.connectarComBanco()// vai criar uma tabela se caso não existi outra
    var enviarParaBanco = banco!!.createStatement().execute(sql)

    println(enviarParaBanco) // tem que retorna false ou 01 para dar certo

    banco.close()// vai encerrear a conneccao com o banco

}

fun cadastrarCaixa(){
    /*
    * val capacidade: Int,
    val cor: String,
    val peso: Double,
    val preco: BigDecimal?,
    val altura: Double,
    val profundidade: Double,
    val largura: Double,
    val duracao: Int,
    val conteudo: String,
    val material: Material
    * FERRO, PVC, PLASTICO, ACO
    * */

    println("Escolha o mateiral do qual a caixa e composto ")
    println("1- ferro")
    println("2- pvc")
    println("3- plastico")
    println("3- aço")

    val opcao = readln().toInt()
    var material : Material

    when(opcao){
        1-> material = Material.FERRO
        2 -> material = Material.PVC
        3 -> material = Material.PLASTICO
        4 -> material = Material.ACO
        else -> material = Material.PLASTICO
    }
    println("Digite a capacidade da Caixa D'Agua")
    val capacidade =  readln().toInt()

    println("Digite a cor da caixa")
    var cor = readln()

    println("Digite a o peso da caixa ")
    var peso = readln().toDouble()

    println("imforme o preço da caixa ")
    val preco = readln().toBigDecimal()

    println("Dogite a altura da caixa")
    val alturaCaixa = readln().toDouble()

    println("Dogite a altura da profundidade")
    val profundidadeCaixa = readln().toDouble()

    println("Dogite a largura da caixa")
    val larguraCaixa = readln().toDouble()

    println("Dogite a duração da caixa")
    val duracaoCaixa = readln().toInt()

    println("Dogite o conteudo da caixa")
    val conteudoCaixa = readln()


    // salvar as variaves dentro da classe CaixadAgua
    // conectar o atributo da classe a variavel que o usuario digitou
    CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = alturaCaixa,
        profundidade = profundidadeCaixa,
        largura = larguraCaixa,
        duracao = duracaoCaixa,
        conteudo = conteudoCaixa

    )
}
fun editarCaixa(){

}
fun listarCaixas(){


}
fun excluirCaixa(){

}