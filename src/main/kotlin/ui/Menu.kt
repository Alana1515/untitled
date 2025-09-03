package org.example.ui

import br.unipar.crud.cadastrarCaixa

fun menu() {
    do {
        println("1 - Cadastrar Caixa DAgua")
        println("2 - Editar Caixa DAgua")
        println("3 - Listar Caixa DAgua")
        println("4 - Excluir Caixa DAgua")
        println("0 - Sair")

        var opcao = readln().toInt()

        when (opcao) {
            0 -> println("Adeus amigo!")
            1 -> cadastrarCaixa()
            2 -> println("Cadastrando caixa...")
            3 -> println("Editando caixa...")
            4 -> println("Excluindo caixa...")
            else -> println("Opção inválida!")
        }
    } while (opcao != 0)
}