package java_240422.jdbc.board;

import java.util.Date;
import java.util.Objects;

public class Board {
    // 필드(컬럼) 생성
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date date;

    // 생성자
    public Board(int boardNo, String title, String content, String writer, Date date) {
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    // getter 추가
    public int getBoardNo() {
        return boardNo;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getDate() {
        return date;
    }

    // setter 추가
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    // equals와 hashCode, toString 추가
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return boardNo == board.boardNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(boardNo);
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNo=" + boardNo +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date +
                '}';
    }
}
