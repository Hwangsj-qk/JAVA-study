package java_240222.inheritance;

public class Inheritance3 {
    // 슈퍼 클래스
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        String color = cellPhone.color;
        String model = cellPhone.model;
        cellPhone.bell();

        // 서브 클래스: 슈퍼 클래스 + 추가 기능
        DmbCellPhone dmbCellPhone = new DmbCellPhone();
        String color1 = dmbCellPhone.color;
        int channel = dmbCellPhone.channel;
        dmbCellPhone.bell();
        dmbCellPhone.turnOnDmb();
    }
}
