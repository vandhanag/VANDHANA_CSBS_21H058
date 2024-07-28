interface Character {
    void attack();
}

class Wizard implements Character {
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}

class Warrior implements Character {
    public void attack() {
        System.out.println("Warrior swings a sword!");
    }
}

abstract class CharacterFactory {
    public abstract Character createCharacter();
}

class WizardFactory extends CharacterFactory {
    public Character createCharacter() {
        return new Wizard();
    }
}

class WarriorFactory extends CharacterFactory {
    public Character createCharacter() {
        return new Warrior();
    }
}

public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        CharacterFactory wizardFactory = new WizardFactory();
        Character wizard = wizardFactory.createCharacter();
        wizard.attack();

        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        warrior.attack();
    }
}
