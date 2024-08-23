package org.example

import org.example.Races.Dragonborn
import org.example.Util.AttributeDistributor

fun main() {
    val distributor = AttributeDistributor()

    val attributes = mutableListOf<Int>()

    do {
        println("=== Distribua valores para as respectivas habilidades ===")
        println("Força")
        println("Destreza")
        println("Constituição")
        println("Inteligência")
        println("Carisma")

        for (x in 1..6) {
            println("Digite o valor para habilidade:")
            var value = readln().toInt();
            if (value !in 8..15 ) {
                println("Valores de habilidade devem estar entre 8 e 15.")
                break;
            }
            print("Valor adicionado!")
            attributes.add(value);
        }
    } while (!distributor.distributePoints(attributes))

    // Verifica se a distribuição é válida
    if (distributor.distributePoints(attributes)) {
        var myCharacter = Character(Dragonborn(), attributes)
        myCharacter.generateCharacter()
        myCharacter.abilities
        println(myCharacter.abilities)

        println("\n-+- Seus valores de habilidade -+-\n")

        println("Força: " + myCharacter.abilities.strength)
        println("Destreza: " + myCharacter.abilities.dexterity)
        println("Constituição: " + myCharacter.abilities.constitution)
        println("Inteligencia: " + myCharacter.abilities.intelligence)
        println("Sabedoria: " + myCharacter.abilities.wisdom)
        println("Carisma: " + myCharacter.abilities.charisma)
    } else {
        println("Falha na distribuição de atributos.")
    }




}