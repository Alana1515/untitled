package org.example.crud

import entidades.CaixaDAgua
import enumeradores.Material

fun cadastrarCaixa(){
    /*
    val capacidade: Int,
    val cor: String,
    val peso: Double,
    val preco: BigDecimal?,
    val altura: Double,
    val profundidade: Double,
    val largura: Double,
    val duracao: Int,
    val conteudo: String,
    val material: Material
    FERRO, PVC, PLASTICO, ACO
     */
    println("Escolha o material de qual a caixa é composta")
    println("1 - Ferro")
    println("2 - PVC")
    println("3 - Plastico")
    println("4 - Aco")
    val opcao = readln().toInt()
    var material : Material
    when (opcao){
        1 -> material = Material.FERRO
        2 -> material = Material.PVC
        3 -> material = Material.PLASTICO
        4 -> material = Material.ACO
        else -> material = Material.PLASTICO
    }

    println("Capacidade da caixa de Litros:" )
    val capacidade = readln().toInt()

    println("Cor da caixa:" )
    val cor = readln()

    println("Peso da caixa: ")
    val peso = readln().toDouble()

    println("Preço da caixa: ")
    val preco = readln().toBigDecimal()

    println("Altura da caixa: ")
    val altura = readln().toDouble()

    println("Profundidade da caixa: ")
    val profundidade = readln().toDouble()

    println("Largura da caixa: ")
    val largura = readln().toDouble()

    println("Duração da caixa: ")
    val duracao = readln().toInt()

    println("Conteudo da caixa: ")
    val conteudo = readln()

    //Salvar as variaveis agora dentro da classe
    CaixaDAgua(
        capacidade = capacidade,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundidade,
        largura = largura,
        duracao = duracao,
        conteudo = conteudo

    )
}


fun editarCaixa(){
}


fun listarCaixas(){
}


fun excluirCaixa(){
}