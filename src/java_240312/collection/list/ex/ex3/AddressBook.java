package java_240312.collection.list.ex.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private List<Friends> friendsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // 삽입
    public void addFriend() {
        System.out.print("친구 이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("친구 이메일을 입력하세요: ");
        String email = scanner.nextLine();
        System.out.print("친구 전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();

        friendsList.add(new Friends(name, email, phoneNumber));
        System.out.println("주소록에 추가되었습니다.");

    }
    // 삭제
    public void deleteFriend() {

        System.out.print("삭제할 이름을 입력하세요: ");
        String name = scanner.nextLine();


        Iterator<Friends> iterator = friendsList.iterator();
        int index = 0;

        while (iterator.hasNext()){
            Friends next = iterator.next();
            if(next.getName().equals(name)) {
                iterator.remove();      // 안전한 삭제
            }
        }
        System.out.println(name + "님의 주소록 정보가 삭제되었습니다. ");
    }

    // 조회
    public void searchFriend() {
        System.out.print("찾으실 연락처의 이름을 입력하세요: ");
        String name = scanner.nextLine();
        boolean isSearched = false;

        for (Friends friends : friendsList) {
            if(name.equals(friends.getName())) {
                System.out.println(friends.toString());
                isSearched = true;
            }
        }
        if (isSearched == false) {
            System.out.println("입력된 정보가 없습니다. ");
        }
    }

    // 출력
    public void printAllFriend() {
        System.out.println("모든 연락처를 출력합니다. ");
        for (Friends friends : friendsList) {
            System.out.println(friends.toString());
            System.out.println();
        }
        }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        AddressBook addressBook = new AddressBook();
        while(true) {
            System.out.println("""
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택 >
                    """);
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    addressBook.addFriend();
                    break;
                case 2:
                    addressBook.deleteFriend();
                    break;
                case 3:
                    addressBook.searchFriend();
                    break;
                case 4:
                    addressBook.printAllFriend();
                    break;
                case 5:
                    System.out.println("종료합니다. ");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. ");

            }
        }
    }
}
