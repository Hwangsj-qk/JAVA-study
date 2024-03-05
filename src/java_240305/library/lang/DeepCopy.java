package java_240305.library.lang;

// 깊은 복사
public class DeepCopy implements Cloneable {
    int[] array;
    String str;
    int [][] deepArray = {
            {1,2,3}, {4,5,6}
    };     // 차원이 높아질수록 모두 깊은 복사해야 함.
    String[] strArray;

    public DeepCopy(int[] array) {
        this.array = array;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       DeepCopy cloned = (DeepCopy) super.clone();
       // 내부 필드의 참조값(배열, 참조타입 등)을 다시 한 번 복사해야 됨.
       cloned.array = this.array.clone();

       // 2차원 배열의 복제: 배열의 차원마다 모두 복제해야 함. => 아니면 원본까지 바뀔 수 있음.
        cloned.deepArray = this.deepArray.clone();
        for (int i = 0; i < deepArray.length; i++) {
            cloned.deepArray[i] = this.deepArray[i].clone();
        }

        return cloned;
    }
}
