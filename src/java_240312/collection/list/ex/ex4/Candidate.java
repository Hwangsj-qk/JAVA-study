package java_240312.collection.list.ex.ex4;

public class Candidate {
    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        votes = 0;
    }

    public void receiveVote() {
        votes++;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    @Override
    public String toString() {
        return "이름: '" + name + '\'' +
                ", 투표 수: " + votes +
                '}';
    }
}
