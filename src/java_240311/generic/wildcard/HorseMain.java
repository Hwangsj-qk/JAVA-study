package java_240311.generic.wildcard;

public class HorseMain {
    public static void main(String[] args) {
        // 모든 유닛을 태울 수 있는 말
        Horse<Unit> unitHorse = new Horse<>();
        unitHorse.setRider(new Unit());
        unitHorse.setRider(new Knight());
        unitHorse.setRider(new Holyknight());
//        unitHorse.setRider(new String(""));       // 에러

        // 제네릭 타입의 다형성을 활용하기 위해 와일드카드를 활용

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

        // 기사 계급 이상을 태우는 말을 받을 변수
        Horse<? extends Knight> middleHorse;
//        middleHorse = new Horse<Unit>();        // 에러
        middleHorse = new Horse<Knight>();
        middleHorse = new Horse<Holyknight>();

        // Knight의 조상 클래스만 받을 수 잇는 변수
        Horse<? super Knight> donkey;
        donkey = new Horse<Unit>();
        donkey = new Horse<Knight>();
//        donkey = new Horse<Holyknight>();
        donkey = unitHorse;
        donkey = knightHorse;
//        donkey = holyknightHorse;

        // 제한이 없는 와일드 카드로 받는 변수
        Horse<?> everyHorse;
        everyHorse =  unitHorse;
        everyHorse = knightHorse;
        everyHorse = holyknightHorse;


        HorseShop horseShop = new HorseShop();

        // 보급형 말 라인에는 고급 말을 넣을 수 없다.
        horseShop.addEntry(unitHorse);
        horseShop.addEntry(knightHorse);
//        horseShop.addEntry(holyknightHorse);

//        horseShop.addPremium(unitHorse);
        horseShop.addPremium(knightHorse);
        horseShop.addPremium(holyknightHorse);

        horseShop.addBestSeller(unitHorse);
        horseShop.addBestSeller(knightHorse);
        horseShop.addBestSeller(holyknightHorse);



    }
}
