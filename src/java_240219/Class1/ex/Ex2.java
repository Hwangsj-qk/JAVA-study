package java_240219.Class1.ex;

public class Ex2 {
    public static void main(String[] args) {
        GameCharcter gameCharcter = new GameCharcter("스파이더맨", 12, 130);
        GameCharcter gameCharcter1 = new GameCharcter("아이언맨", 30, 200);

        GameCharcter [] gameCharcters = {gameCharcter1, gameCharcter};


        gameCharcter.attack();



    }



}
