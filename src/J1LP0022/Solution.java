package J1LP0022;

import MainProject.Localized;

public class Solution {

    public static void run_J1LP0022() {
        choose_Option_Menu();
    }

    public static void choose_Option_Menu() {
        boolean exitProgram = false;
        while (exitProgram == false) {
            switch (showMenu()) {
                case Localized.number_Of_Option_1:
                    Function.create_Experience();
                    break;
                case Localized.number_Of_Option_2:
                    Function.create_Fresher();
                    break;
                case Localized.number_Of_Option_3:
                    Function.create_Intern();
                    break;
                case Localized.number_Of_Option_4:
                    Function.searching();
                    break;
                case Localized.number_Of_Option_5:
                    exitProgram = true;
                    break;
                default:
                    System.out.println(Localized.user_Manual_Menu_J1LP0022);
            }
        }
    }

    public static String showMenu() {
        System.out.println(Localized.contentMenu);
        System.out.println(Localized.option_1);
        System.out.println(Localized.option_2);
        System.out.println(Localized.option_3);
        System.out.println(Localized.option_4);
        System.out.println(Localized.option_5);
        System.out.println(Localized.user_Manual_Menu_J1LP0022);
        return Localized.sc.nextLine();
    }
}
