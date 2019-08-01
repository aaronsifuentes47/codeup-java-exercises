import java.util.Arrays;

public class ServerNameGenerator {
    private String[] adjectives = {"Vengeful", "Spiteful", "Raging", "Arrogant", "Vindictive", "Indignant", "Unforgiving", "Relentless", "Inexorable", "Dumb"};
    private String[] nouns = {"Ferret", "Chinchilla","Pika","Axolotl","Bunny", "Weasel", "Sloth", "Hummingbird", "Puppy", "Hamster"} ;


    public String randomNum(String[] array) {
        int random = (int) Math.floor(Math.random() * array.length);
        return array[random];
    }


    public static void main(String[] args) {

        ServerNameGenerator sng = new ServerNameGenerator();
        System.out.println(Arrays.toString(sng.adjectives));
        System.out.println(Arrays.toString(sng.nouns));
        for (int i = 0;i<10;i++) {
            System.err.printf("%s-%s%n", sng.randomNum(sng.adjectives),sng.randomNum(sng.nouns));
        }
    }
}
