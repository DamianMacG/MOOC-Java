import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stacks.isEmpty();

    }

    public void add(String value) {
        this.stacks.add(value);
    }

    public ArrayList<String> values() {

        return this.stacks;
    }

    public String take() {
        return this.stacks.remove(this.stacks.size() - 1);
    }

}
