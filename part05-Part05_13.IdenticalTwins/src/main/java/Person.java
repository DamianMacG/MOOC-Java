
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        // convert the object into a Person object
        Person comparedPerson = (Person) compared;

        // if the values of the object variables are equal, the objects are equal
        return this.name == comparedPerson.name &&
                Objects.equals(this.birthday, comparedPerson.birthday) &&
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight;
    }
}

// Alternate method - getclass() is an inherited method and more strict than
// instanceof,
// This checks if the objects are of the same class. This is a stricter check
// than instanceof and ensures that the objects are of exactly the same type
// (not just a subtype). This can be useful when you want to ensure that only
// objects of the exact same class are considered equal.

// public boolean equals(Object obj) {
// if (this == obj) {
// return true;
// }
// if (obj == null) {
// return false;
// }
// if (getClass() != obj.getClass()) {
// return false;
// }
// final Person other = (Person) obj;
// if (this.height != other.height) {
// return false;
// }
// if (this.weight != other.weight) {
// return false;
// }
// if (!Objects.equals(this.name, other.name)) {
// return false;
// }
// if (!Objects.equals(this.birthday, other.birthday)) {
// return false;
// }
// return true;
// }
