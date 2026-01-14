package domain;

public class Course extends Content {

    private int courseLoad;

    public Course() {
    }

    @Override
    public double calculateXp() {
        return XP_PADRAO * courseLoad;
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
