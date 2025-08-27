package entidades

import enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua (//os 2 parenteses Construtor da classe
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
    //val dimenssao : Array <Double>, // Altura, Largura. Profundidade

)//Aqui vai todos os atributos da classe
{


}