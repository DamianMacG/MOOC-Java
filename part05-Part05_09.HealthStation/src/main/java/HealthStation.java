
public class HealthStation {
    private int count = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count++;
        return person.getWeight();

    }

    public void feed(Person person) {
        int newWeight = person.getWeight();
        person.setWeight(newWeight + 1);
    }

    public int weighings() {

        return count;
    }

}
