package java_240312.collection.list.ex.ex4;

public class Candidate {
    private String name;
    private int votes;

    public Candidate(String name, int votes) {
        this.name = name;
        this.votes =votes;
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
                ", 투표 수: " + votes;
    }
}
