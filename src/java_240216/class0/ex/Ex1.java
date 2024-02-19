package java_240216.class0.ex;

public class Ex1 {
    public static void main(String[] args) {

        Movie movie1;
        movie1 = new Movie();
        movie1.title = "웡카";
        movie1.review = "초콜릿이 먹고싶은 영화";

        Movie movie2;
        movie2 = new Movie();
        movie2.title = "포레스트 검프";
        movie2.review = "인생 영화";

//        System.out.println(movie1);
//        System.out.println(movie2);

        Movie[] movies = new Movie[2];
        movies[0] = movie1;
        movies[1] = movie2;

        for (int i = 0; i < movies.length; i++) {
            System.out.println("[영화 이름: " + movies[i].title + ", 영화 리뷰: " + movies[i].review + "]" );

        }
    }
}
