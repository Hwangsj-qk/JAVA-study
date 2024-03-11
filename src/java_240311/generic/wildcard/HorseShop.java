package java_240311.generic.wildcard;

public class HorseShop {
    void addPremium (Horse<? extends Knight> horse) {
        System.out.println("프리미엄 말로 추가: " + horse);
    }
    // extends: 자기 자신 + 자식 클래스(holyKnight)

    void addEntry (Horse<? super Knight> horse) {
        System.out.println("보급형 말로 추가: " + horse);
    }
    // super: 자기 자신 + 부모 클래스(Unit)

    void  addBestSeller(Horse<? extends Unit> horse) {
        System.out.println("베스트셀러 말로 추가: " + horse);
    }



}
