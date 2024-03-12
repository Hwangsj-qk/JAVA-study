package java_240312.collection.list.ex.ex4;

import java_240312.collection.list.ex.ex3.Friends;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    List<Candidate> candidates = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Candidate> candidates = new ArrayList<>();
        VotingSystem votingSystem = new VotingSystem();
        Candidate candidate1 = new Candidate("고길동");
        Candidate candidate2 = new Candidate("둘리");
        Candidate candidate3 = new Candidate("마이콜");
        Candidate candidate4 = new Candidate("희동이");


        System.out.println("투표를 시작합니다");
        votingSystem.startVoting();

            System.out.println("최종 결과입니다.");
            for (Candidate candidate : candidates) {
                votingSystem.printResults();
            }





    }


    public void startVoting() {
        while (true) {
            System.out.println("""
                         후보 목록:
                         1. 고길동
                         2. 둘리
                         3. 마이콜
                         4. 희동이
                    """);
            System.out.print("투표할 번호를 입력하세요: ");
            int votingNumber = scanner.nextInt();

            if (candidates.indexOf(votingNumber) + 1 == votingNumber) {
                candidates.get(votingNumber - 1).receiveVote();
            } else if (votingNumber == 0) {
                System.out.println("투표를 종료합니다.");
                return;
            } else {
                System.out.println("잘못된 번호 입니다. ");
            }
        }
    }

        public void printResults () {
            System.out.println("최종 결과 입니다.");
            for (Candidate candidate : candidates) {
                System.out.println(candidates);
            }
        }


    }