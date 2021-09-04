package J1LP0022;

import MainProject.Localized;

public class Solution implements Localized {

    public static void run_J1LP0022() {
        choose_Option_Menu();
    }

    public static void choose_Option_Menu() {
        boolean exitProgram = false;
        while (exitProgram == false) {
            switch (showMenu()) {
                case number_Of_Option_1:
                    Function.create_Experience();
                    break;
                case number_Of_Option_2:
                    Function.create_Fresher();
                    break;
                case number_Of_Option_3:
                    Function.create_Intern();
                    break;
                case number_Of_Option_4:
                    Function.searching();
                    break;
                case number_Of_Option_5:
                    exitProgram = true;
                    break;
                default:
                    System.out.println(user_Manual_Menu_J1LP0022);
            }
        }
    }

    public static String showMenu() {
        System.out.println(contentMenu);
        System.out.println(option_1);
        System.out.println(option_2);
        System.out.println(option_3);
        System.out.println(option_4);
        System.out.println(option_5);
        System.out.println(user_Manual_Menu_J1LP0022);
        return sc.nextLine();
    }
}
