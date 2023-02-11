package SoftUniJavaAdvanced.Ex_06.P06_PokemonTrainer;

import java.util.*;

public class Main {

    private static final String SPLIT_REGEX = "\\s+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Tournament")) {
            String trainer = input.split(SPLIT_REGEX)[0];
            String pokeName = input.split(SPLIT_REGEX)[1];
            String pokeElement = input.split(SPLIT_REGEX)[2];
            int pokeHealth = Integer.parseInt(input.split(SPLIT_REGEX)[3]);

            Pokemon pokemon = new Pokemon(pokeName, pokeElement, pokeHealth);

            if (trainersMap.isEmpty() || !trainersMap.containsKey(trainer)) {
                trainersMap.put(trainer, new Trainer(trainer));
                trainersMap.get(trainer).getPokemonList().add(pokemon);
            } else {
                trainersMap.get(trainer).getPokemonList().add(pokemon);
            }

            input = scanner.nextLine();
        }


        // >> TOURNAMENT <<
        String inputElement = scanner.nextLine();
        while (!inputElement.equals("End")) {

            for (Map.Entry<String, Trainer> trainer : trainersMap.entrySet()) {

                // Check if Trainer has any Pokémon
                if (!trainer.getValue().getPokemonList().isEmpty()) {

                    if (hasPokemonWithElement(trainer.getValue(), inputElement)) {
                        trainer.getValue().setBadgesAmount(trainer.getValue().getBadgesAmount() + 1);
                    } else {
                        trainer.getValue().getPokemonList().forEach(pokemon -> pokemon.setHealth(pokemon.getHealth() - 10));
                    }

                    // Remove dead Pokemon
                    trainer.getValue().getPokemonList().removeIf(pokemon -> pokemon.getHealth() <= 0);
                }
            }

            inputElement = scanner.nextLine();
        }


        // OUTPUT
        List<Trainer> trainerList = new ArrayList<>();
        for (Map.Entry<String, Trainer> trainer : trainersMap.entrySet()) {
            trainerList.add(trainer.getValue());
        }

        trainerList.stream()
                .sorted(Comparator.comparing(Trainer::getBadgesAmount).reversed())
                .forEach(System.out::println);

//        // FIXME - WHY NOT WORKING???
//        trainerList.sort(Comparator.comparing(Trainer::getBadgesAmount).reversed());
//        for (Trainer trainer : trainerList) {
//            System.out.printf("%s %d %d%n", trainer.getName(), trainer.getBadgesAmount(), trainer.getPokemonList().size());
//        }

    }


    // CHECK ELEMENT
    private static boolean hasPokemonWithElement(Trainer trainer, String element) {
        boolean hasElement = false;
        for (Pokemon pokemon : trainer.getPokemonList()) {
            if (pokemon.getElement().equals(element)) {
                hasElement = true;
                break;
            }
        }
        return hasElement;
    }


}
