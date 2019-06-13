import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Comparator<Hero> comparator;
        comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };
        Map<Hero, Flower> heroFlowerMap = new TreeMap<>(comparator);
        heroFlowerMap.put(hulk,rose);
        heroFlowerMap.put(thor,rose);
        heroFlowerMap.put(scarletWitch,rose);
        heroFlowerMap.put(vision,tulip);
        heroFlowerMap.put(captainAmerica,lily);
        heroFlowerMap.put(blackWidow,violet);
        heroFlowerMap.put(doctorStrange,violet);
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(heroFlowerMap.containsValue(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for(Hero hero : heroFlowerMap.keySet()){
            Flower flower = heroFlowerMap.get(hero);
            System.out.println(flower.getName());
        }

    }
}