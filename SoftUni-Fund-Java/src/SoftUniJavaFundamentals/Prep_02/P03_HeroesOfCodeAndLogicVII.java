package SoftUniJavaFundamentals.Prep_02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroHPMap = new LinkedHashMap<>();
        Map<String, Integer> heroMPMap = new LinkedHashMap<>();

        // PICK HEROES
        int heroesAmount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < heroesAmount; i++) {
            String splitRegex = " ";
            String heroData = scanner.nextLine();
            String name = heroData.split(splitRegex)[0];
            int HP = Integer.parseInt(heroData.split(splitRegex)[1]);
            int MP = Integer.parseInt(heroData.split(splitRegex)[2]);

            if (HP > 100) {
                HP = 100;
            }
            if (MP > 200) {
                MP = 200;
            }

            heroHPMap.put(name, HP);
            heroMPMap.put(name, MP);
        }

        // PLAY GAME
        String splitRegex = " - ";
        String[] command = scanner.nextLine().split(splitRegex);
        while (!command[0].equals("End")) {
            switch (command[0]) {

                case "CastSpell":
                    String heroNameCast = command[1];
                    String spellName = command[3];
                    int requiredMP = Integer.parseInt(command[2]);
                    if (heroMPMap.get(heroNameCast) >= requiredMP) {
                        heroMPMap.put(heroNameCast, heroMPMap.get(heroNameCast) - requiredMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroNameCast, spellName, heroMPMap.get(heroNameCast));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroNameCast, spellName);
                    }
                    break;

                case "TakeDamage":
                    String heroNameDMG = command[1];
                    String attacker = command[3];
                    int damage = Integer.parseInt(command[2]);
                    if (heroHPMap.get(heroNameDMG) > damage) {
                        heroHPMap.put(heroNameDMG, heroHPMap.get(heroNameDMG) - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroNameDMG, damage, attacker, heroHPMap.get(heroNameDMG));
                    } else {
                        System.out.printf("%s has been killed by %s!\n", heroNameDMG, attacker);
                        heroHPMap.remove(heroNameDMG);
                        heroMPMap.remove(heroNameDMG);
                    }
                    break;

                case "Recharge":
                    String heroNameRecharge = command[1];
                    int amountMP = Integer.parseInt(command[2]);
                    int missingMP = 200 - heroMPMap.get(heroNameRecharge);
                    if (amountMP >= missingMP) {
                        amountMP = missingMP;
                    }
                    heroMPMap.put(heroNameRecharge, heroMPMap.get(heroNameRecharge) + amountMP);
                    System.out.printf("%s recharged for %d MP!\n", heroNameRecharge, amountMP);
                    break;

                case "Heal":
                    String heroNameHeal = command[1];
                    int amountHP = Integer.parseInt(command[2]);
                    int missingHP = 100 - heroHPMap.get(heroNameHeal);
                    if (amountHP >= missingHP) {
                        amountHP = missingHP;
                    }
                    heroHPMap.put(heroNameHeal, heroHPMap.get(heroNameHeal) + amountHP);
                    System.out.printf("%s healed for %d HP!\n", heroNameHeal, amountHP);
                    break;
            }

            command = scanner.nextLine().split(splitRegex);
        }

        // PRINT REMAINING PARTY MEMBERS
        for (Map.Entry<String, Integer> hero : heroHPMap.entrySet()) {
            System.out.printf("%s\n HP: %d\n MP: %d\n", hero.getKey(), hero.getValue(), heroMPMap.get(hero.getKey()));
        }


    }
}
