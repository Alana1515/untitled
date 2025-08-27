package entidades

import enumeradores.Material
import enumeradores.Setor
import enumeradores.Sexo
import java.math.BigDecimal

class Profissional(
    val salario: BigDecimal,
    val funcao: String,
    val experincia: String,
    val habilidade: String,
    val uniforme: String,
    sexo: Sexo,
    nome: String,
    cpf: Int,
    idade: Int,
    val setor: Setor,
    val material: Material,



    ) : Pessoa(
    nome = nome,
    cpf = cpf,
    idade = idade,
    sexo = sexo){


    override fun receberConta(conta: Conta, pagar:BigDecimal){// adicionar paramentros

        // overrede vai sobrescrever o metodo que ja esta na super classe assim fanzendo o POLIMORFISMO

        conta.saldo = conta.saldo.subtract(pagar) /// subtract vem de subitrair do saldo


    }
}