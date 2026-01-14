package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> contentsEnrolled = new LinkedHashSet<>();
    private Set<Content> contentsFinished = new LinkedHashSet<>();

    public void enrollBootcamp(Bootcamp bootcamp) {

    }

    public void progress() {

    }

    public void calculateTotalXp() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsEnrolled() {
        return contentsEnrolled;
    }

    public void setContentsEnrolled(Set<Content> contentsEnrolled) {
        this.contentsEnrolled = contentsEnrolled;
    }

    public Set<Content> getContentsFinished() {
        return contentsFinished;
    }

    public void setContentsFinished(Set<Content> contentsFinished) {
        this.contentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name)
                && Objects.equals(contentsEnrolled, dev.contentsEnrolled)
                && Objects.equals(contentsFinished, dev.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsEnrolled, contentsFinished);
    }
}
