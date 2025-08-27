package entidades

import enumeradores.Sexo
import java.math.BigDecimal

open class Pessoa(
    val nome: String,
    val cpf: Int,
    val sexo : Sexo,
    val idade : Int
) {

    open fun receberConta(conta: Conta, receber: BigDecimal) { // open para o metodo ser herdado para outras classes

        conta.saldo = conta.saldo.add(receber)

    }
}