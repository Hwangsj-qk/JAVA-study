package quiz_240401_6.q4;

import java.util.*;

public class Quiz4 {
    public static void main(String[] args) {
        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을")));

       List<City> joined = new ArrayList<>();
        for (int i = 0; i < itinerary.size(); i++) {
            joined.add(itinerary.get(i));
        }






    }

    static class City {
        String name;
        List<String> attractions;

        public City(String name, List<String> attractions) {
            this.name = name;
            this.attractions = attractions;
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", attractions=" + attractions +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            City city = (City) o;
            return Objects.equals(name, city.name) && Objects.equals(attractions, city.attractions);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, attractions);
        }
    }


}
