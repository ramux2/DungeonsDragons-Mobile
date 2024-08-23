package org.example

import org.example.Races.Race
import org.example.Util.Abilities

class Character(var race: Race, attributes: List<Int>)  {
    var abilities: Abilities = Abilities(attributes);

    fun generateCharacter() {
        race.applyRacialBonuses(abilities)
    }
}