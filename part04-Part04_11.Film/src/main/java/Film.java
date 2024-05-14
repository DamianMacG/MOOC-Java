public class Film {
    private String name;
    private int rating;

    public Film(String filmName, int filmAgeRating) {
        name = filmName;
        rating = filmAgeRating;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return rating;
    }

}
