package java_240311.generic.wildcard;

public class HorseMain {
    public static void main(String[] args) {
        // 모든 유닛을 태울 수 있는 말
        Horse<Unit> unitHorse = new Horse<>();
        unitHorse.setRider(new Unit());
        unitHorse.setRider(new Knight());
        unitHorse.setRider(new Holyknight());
//        unitHorse.setRider(new String(""));       // 에러

        // 기사 계급 이상만 탈 수 있는 말
        Horse<Knight> knightHorse = new Horse<>();
//        knightHorse.setRider(new Unit());     // 에러 (부모 클래스는 자식 클래스에 대한 정보가 없음)
        knightHorse.setRider(new Knight());
        knightHorse.setRider(new Holyknight());

        // 성기사만 탈 수 있는 말
        Horse<Holyknight> holyknightHorse = new Horse<>();
//        holyknightHorse.setRider(new Unit());
//        holyknightHorse.setRider(new Knight());
        holyknightHorse.setRider(new Holyknight());
    }
}
