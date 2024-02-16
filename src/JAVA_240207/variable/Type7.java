package JAVA_240207.variable;

public class Type7 {
    public static void main(String[] args) {
        // 문자열 => 기본타입으로 강제 변환(타입 변환)
        String s1 = "60000";
        int i1 = Integer.parseInt(s1);
        
        double d1 = Double.parseDouble("3.14");
        boolean f = Boolean.parseBoolean("false");  // 문자열 "false"를 불리언 false로 변환
        // 타입추론 단축키: ctrl + alt + v
        boolean b = Boolean.parseBoolean("true");

        // 기본타입 => 강제변환(int, double, boolean값을 문자열로 변환)
        String s = String.valueOf(100);
        String s2 = String.valueOf(3.14);
        String s3 = String.valueOf(false);

        
    }
}
