package quiz_240229_2.quiz5;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("메일 발송 성공: " + message);
    }
}
