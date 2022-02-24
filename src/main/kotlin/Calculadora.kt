//William Branco Campos Braz/*
import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    fun forcaPeso(massa: Float): Float {
        return massa * 10
    }

    fun forcaCentripeta(massa: Int, velocidade: Int, raio: Int): Int {
        return massa * (velocidade * velocidade) / raio
    }

    fun impulso(forca: Int, tempo: Int): Int {
        return forca * tempo
    }

    fun forcaElastica(constanteMola: Int, deformacaoMola: Int): Int {
        return constanteMola * deformacaoMola
    }

    fun velocidadeMedia(deslocamento: Int, tempo: Int): Int {
        return deslocamento / tempo
    }

    fun mru(posicaoInicial: Int, velocidade: Int, instante: Int): Int {
        return posicaoInicial + (velocidade * instante)
    }
    fun mruv(posicaoInicial: Int, velocidadeinicial: Int, tempo: Int, aceleracao: Int): Int {
        return posicaoInicial + (velocidadeinicial * tempo) + ((aceleracao * (tempo * tempo)) / 2)
    }
}