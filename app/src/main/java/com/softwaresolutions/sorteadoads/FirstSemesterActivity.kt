package com.softwaresolutions.sorteadoads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class FirstSemesterActivity : AppCompatActivity() {

    lateinit var sorteado : TextView
    val alunos = arrayOf(
            "ADIEL PAULINO BRANCHES DA SILVA\n",
            "ADRIANO BARBOSA DA SILVA\n",
            "ALLAN ERIC DOS SANTOS PIRES\n",
            "ANDREW ANDREW DOURADO MOURA\n",
            "ANGELO GABRIEL NUNES PINHEIRO DA SILVA\n",
            "ANNE GABRYELLA SOUZA DIAS\n",
            "BRUNO DOURADO MACHADO\n",
            "CARLOS VITÓRIO\n",
            "DARLAN SIDNEY DO CARMO CAVALCANTI\n",
            "EDUARDA ISABELLY GONZAGA DA SILVA\n",
            "EMILIA GABRIELLY PEREIRA BARBOSA\n",
            "ERIC NEANDRO DA SILVA MELO\n",
            "ERNESTH TRINDADE DOS SANTOS\n",
            "ESTOU FALANDO COM QUEM\n",
            "EVENILDO SANTOS CALDEIRA\n",
            "FABIO WESLEY ANTUNES GOMES\n",
            "GABRIEL DE ALBUQUERQUE GUEDES\n",
            "GABRIEL DE SOUZA AFONSO\n",
            "GUILHERME LEMOS SIMOES\n",
            "IGOR VALENTE PINHEIRO\n",
            "IVAN BRAGA DE FIGUEIREDO JUNIOR\n",
            "JHONATAN GUIMARÃES RODRIGUES\n",
            "JOSÉ ROBERTO SEABRA DOS SANTOS\n",
            "KEVEN MACEDO ALEXANDRINO\n",
            "LINCOLN LIMA PONTES\n",
            "LIVIA RODRIGUES SILVA\n",
            "LUCAS SOUZA DE MENEZES\n",
            "LUCIANO LIMA DA CONCEICAO\n",
            "MAHARA THAUANA SILVA DE ARAUJO\n",
            "MANUELLY CLAUDIA BARROS\n",
            "MARIANY DE SOUZA GUIMARÃES\n",
            "MIKAELLA AYESHA DE SOUZA FURTADO\n",
            "NYCOLE GRAZIELLY PIO RODRIGUES\n",
            "RAISSA FERNANDES PIMENTEL\n",
            "ROBERT ELBER ROSAS DE ABREU\n",
            "SAVIO RAMOS LEMOS\n",
            "WENDEL GABRIEL DE MIRANDA TEIXEIRA\n",
            "WERNESON LOPES DO NASCIMENTO",
            "WHENDEL DE MELO SOUZA\n",
            "WICTOR HUGO ALBINO DA SILVA\n",
            "YAGO FERREIRA SILVA DOS SANTOS\n",
            "YGOR FABRÍCIO DE SOUSA BARBOSA")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_semester)
        sorteado = findViewById(R.id.tx_sorteado) as TextView

    }
    fun sortearAluno( view: View){
        val totalIntensArray = alunos.size
        val randomNumbers = Random.nextInt(totalIntensArray)

        sorteado.setText(alunos[randomNumbers])
    }

}