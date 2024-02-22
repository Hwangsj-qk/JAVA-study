package test1_practice;

public class Character {
    // class1 - ex2
    public static void main(String[] args) {
        GameCharacter spiderMan = new GameCharacter("spiderMan", 10, 100);
        GameCharacter IronMan = new GameCharacter("IronMan", 20, 200);

        IronMan.attack();
        spiderMan.takeDamage(20);

        spiderMan.attack();
        IronMan.takeDamage(10);



    }

    }


