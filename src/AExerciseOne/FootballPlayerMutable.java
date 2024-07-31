package AExerciseOne;

public class FootballPlayerMutable {
    private String name;
    private String position;
    private String age;

    public FootballPlayerMutable() {
    }

    public FootballPlayerMutable(String name, String position, String age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FootballPlayerMutable{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
