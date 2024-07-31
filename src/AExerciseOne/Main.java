package AExerciseOne;


public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise One");
        System.out.println("------------------------------------------------");
        FootballPlayerMutable footballPlayerMutable =
                new FootballPlayerMutable("Messi", "DC", "37");
        System.out.println("---------MUTABLE PLAYER---------");
        System.out.println("Before Modification: ");
        System.out.println(footballPlayerMutable);

        System.out.println("After Modification: ");
        footballPlayerMutable.setName("Neymar");
        footballPlayerMutable.setPosition("EI");
        footballPlayerMutable.setAge("33");
        System.out.println(footballPlayerMutable);

        System.out.println("After Modification whit method MUTABLE: ");
        System.out.println(mutable(footballPlayerMutable));
        System.out.println("------------------------------------------------");

        System.out.println("---------IMMUTABLE PLAYER---------");
        FootballPlayerImmutable footballPlayerImmutable =
                new FootballPlayerImmutable("De bruyne", "MC", "34");
        System.out.println("Before Modification: ");
        System.out.println(footballPlayerImmutable);

        System.out.println("After Modification: ");
        footballPlayerImmutable.setName("Lamin Yamal");
        footballPlayerImmutable.setPosition("ED");
        footballPlayerImmutable.setAge("17");
        System.out.println(footballPlayerImmutable);

        System.out.println("Update Object");
        FootballPlayerImmutable updateObject = footballPlayerImmutable.setName("Lamin Yamal");
        System.out.println(updateObject);

    }

    public static Object mutable(Object obj) {
        FootballPlayerMutable player = new FootballPlayerMutable();
        player.setName("Mbbappe");
        player.setPosition("EI");
        player.setAge("25");
        return player;
    }
}