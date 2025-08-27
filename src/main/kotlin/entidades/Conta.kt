package entidades

import java.math.BigDecimal

class Conta(
    val pessoa: Pessoa,
    var saldo: BigDecimal,
    val idConta: Long
) {

}