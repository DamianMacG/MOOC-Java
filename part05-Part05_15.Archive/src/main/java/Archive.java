import java.util.Objects;

public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Archive archive = (Archive) obj;
        return Objects.equals(identifier, archive.identifier);
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}