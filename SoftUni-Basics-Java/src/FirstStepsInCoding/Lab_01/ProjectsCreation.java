package FirstStepsInCoding.Lab_01;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOfArchitect = scan.nextLine();
        int numberOfProjects = Integer.parseInt(scan.nextLine());
        int hoursPerProject = 3;

        int hoursWorkTotal = numberOfProjects * hoursPerProject;
        System.out.printf("The architect %s will need %d hours to complete %d project/s."
                , nameOfArchitect, hoursWorkTotal, numberOfProjects);

    }
}
