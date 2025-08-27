package entidades

import enumeradores.Sexo
import java.math.BigDecimal

class Cliente(
    nome : String,
    idade : Int,
    cpf : Int,
    sexo : Sexo,
    val endereco : String,
    val estadocivil : String,
    val pedidos: Array<String>
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo) {

    // comportamento




}