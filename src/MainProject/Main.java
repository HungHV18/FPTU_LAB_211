package MainProject;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name exercise: ");
        switch(sc.nextLine().toUpperCase()){
            case "J1LP0021":
                J1LP0021.Solution.run_J1LP0021();
                break;
            case "J1LP0022":
                J1LP0022.Solution.run_J1LP0022();
                break;
        }
    }
}
