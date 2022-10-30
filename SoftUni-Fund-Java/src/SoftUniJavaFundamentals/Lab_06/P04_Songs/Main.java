package SoftUniJavaFundamentals.Lab_06.P04_Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] songArray = scanner.nextLine().split("_");

            Song newSong = new Song();
            newSong.setSong(songArray[0], songArray[1], songArray[2]);
            songList.add(newSong);

        }

        String operator = scanner.nextLine();
        for (Song song : songList) {
            if (song.getTypeList().equals(operator) || operator.equals("all")){
                System.out.println(song.getName());
            }
        }

    }
}
