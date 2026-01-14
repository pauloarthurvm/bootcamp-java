package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> contentsEnrolled = new LinkedHashSet<>();
    private Set<Content> contentsFinished = new LinkedHashSet<>();

    public void enrollBootcamp(Bootcamp bootcamp) {
        this.contentsEnrolled.addAll(bootcamp.getContents());
        bootcamp.getEnrolledDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = contentsEnrolled.stream().findFirst();
        if (content.isPresent()) {
            contentsFinished.add(content.get());
            contentsEnrolled.remove(content.get());
        } else {
            System.err.println("No enrolled content available!");
        }
    }

    public double calculateTotalXp() {
        return this.contentsFinished
                .stream()
                .mapToDouble(c -> c.calculateXp())
                .sum();
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
