import java.util.Objects;

public abstract class Act {
    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Act (String name, String country){
        this.name=name;
        this.country=country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Act act = (Act) o;
        return Objects.equals(name, act.name) &&
                Objects.equals(country, act.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    public abstract boolean containsArtist(Artist artist);
}
