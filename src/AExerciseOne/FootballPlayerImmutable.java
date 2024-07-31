package AExerciseOne;

public final class FootballPlayerImmutable {
    private final String name;
    private final String position;
    private final String age;

    public FootballPlayerImmutable(String name, String position, String age){
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getAge() {
        return age;
    }

    public FootballPlayerImmutable setName(String name){
        return new FootballPlayerImmutable(name,this.position,this.age);
    }

    public FootballPlayerImmutable setPosition(String position){
        return new FootballPlayerImmutable(this.name, position,this.age);
    }

    public FootballPlayerImmutable setAge(String age){
        return new FootballPlayerImmutable(this.name,this.position,age);
    }

    @Override
    public String toString() {
        return "FootballPlayerImmutable{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
