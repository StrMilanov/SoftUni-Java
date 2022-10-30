package SoftUniJavaFundamentals.Ex_06.P01_AdvertisementMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] phrasesArray = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] eventsArray = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authorsArray = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] citiesArray = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        List<Phrases> phrasesList = new ArrayList<>();
        List<Events> eventsList = new ArrayList<>();
        List<Authors> authorsList = new ArrayList<>();
        List<Cities> citiesList = new ArrayList<>();

        for (String phrase : phrasesArray) {
            Phrases newPhrase = new Phrases(phrase);
            phrasesList.add(newPhrase);
        }
        for (String event : eventsArray) {
            Events newEvent = new Events(event);
            eventsList.add(newEvent);
        }
        for (String name : authorsArray) {
            Authors newAuthor = new Authors(name);
            authorsList.add(newAuthor);
        }
        for (String city : citiesArray) {
            Cities newCity = new Cities(city);
            citiesList.add(newCity);
        }


        for (int i = 0; i < n; i++) {
            int phraseIndex = getRandom(phrasesList.size());
            int eventIndex = getRandom(eventsList.size());
            int authorIndex = getRandom(authorsList.size());
            int cityIndex = getRandom(citiesList.size());

            System.out.printf("%s %s %s - %s\n", phrasesList.get(phraseIndex), eventsList.get(eventIndex), authorsList.get(authorIndex), citiesList.get(cityIndex));
        }



    }

    // --- GET RANDOM NUMBER ---
    private static int getRandom(int listLength){
        Random rnd = new Random();

        return rnd.nextInt(listLength);
    }

}
