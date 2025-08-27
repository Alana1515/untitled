package entidades

import java.math.BigDecimal

class Servico(
    var preco : BigDecimal,
    val ferramentas: String,
    var profissional : Profissional,



    ) {
}