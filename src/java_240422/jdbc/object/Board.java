package java_240422.jdbc.object;

import java.sql.Blob;
import java.util.Date;
import java.util.Objects;

public class Board {
    private int borardNo;
    private String title;
    private String content;
    private String writer;
    private Date date;
    private String filename;
    private Blob filedata;

    public Board(int borardNo, String title, String content, String writer, Date date, String filename, Blob filedata) {
        this.borardNo = borardNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.filename = filename;
        this.filedata = filedata;

    }

    public int getBorardNo() {
        return borardNo;
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

    public String getFilename() {
        return filename;
    }

    public Blob getFiledata() {
        return filedata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return borardNo == board.borardNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(borardNo);
    }

    @Override
    public String toString() {
        return "Board{" +
                "borardNo=" + borardNo +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date +
                ", filename='" + filename + '\'' +
                ", filedata=" + filedata +
                '}';
    }
}
