package java_240226.polymorphism.ex.ex4;

public class Gingerbread extends Cookie{
    @Override
    public void run() {
        System.out.println("진저브레드 맨이 달립니다!");
    }


    @Override
    public void jump() {
        System.out.println("진저 브레드맨이 낮게 점프합니다! ");
    }

    public void specialSkill() {
        System.out.println("진저브레드 맨이 밀가루를 쏩니다! ");
    }

}
