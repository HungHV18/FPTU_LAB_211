package J1LP0021;

import java.util.*;

public class Solution implements Localized {

    public static void main(String[] args) {
        choose_Option_Menu();
    }

    public static void choose_Option_Menu() {
        boolean exitProgram = false;
        while (exitProgram == false) {
            switch (showMenu()) {
                case option_1:
                    create_Student();
                    break;
                case option_2:
                    find_And_Sort();
                    break;
                case option_3:
                    update_Or_Delete();
                    break;
                case option_4:
                    report();
                    break;
                case option_5:
                    exitProgram = true;
                    break;
                default:
                    System.out.println(user_Manual_Menu);
            }
        }
    }

    public static String showMenu() {
        System.out.println(welcome_Message);
        System.out.println(menu_Option_1);
        System.out.println(menu_Option_2);
        System.out.println(menu_Option_3);
        System.out.println(menu_Option_4);
        System.out.println(menu_Option_5);
        System.out.println(user_Manual_Menu);
        return sc.nextLine();
    }

    public static void create_Student() {
        int count = 1;
        while (count < 4) {
            allStudent.add(new Student());
            System.out.println(next_Student_Message);
            ++count;
        }
        if (isContinue() == true) {
            create_Student();
        }
    }

    public static boolean isContinue() {
        System.out.println(input_Message_Continue);
        switch (sc.nextLine().toLowerCase()) {            
            case choose_Yes:
                return true;
            case choose_No:
                return false;
            default:
                return isContinue();
        }
    }

    public static void find_And_Sort() {
        Collections.sort(allStudent);
        System.out.print(input_Message_Search);
        String nameFind = sc.nextLine();
        for (Student student : allStudent) {
            if (student.get_Name().contains(nameFind)) {
                student.printStudent();
            }
        }
    }

    public static void update_Or_Delete() {
        System.out.println(input_Message_Update_Or_Delete);
        switch (sc.nextLine().toLowerCase()) {
            case choose_Update:
                update_Student();
                break;
            case choose_Delete:
                delete_Student();
                break;
        }
    }

    public static void update_Student() {
        int indexSt = index_By_ID();
        if (indexSt != -1) {
            allStudent.get(indexSt).printStudent();
            allStudent.get(indexSt).create_ID();
            allStudent.get(indexSt).create_Student_Name();
            allStudent.get(indexSt).create_Semester();
            allStudent.get(indexSt).create_Course_Name();
        }
    }

    public static void delete_Student() {
        int indexStudent = index_By_ID();
        if (indexStudent != -1) {
            allStudent.remove(indexStudent);
        }
    }

    public static int index_By_ID() {
        System.out.print(input_Message_ID);
        String ID = sc.nextLine();
        for (int i = 0; i < allStudent.size(); ++i) {
            if (ID.equals(allStudent.get(i).get_ID())) {
                return i;
            }
        }
        System.out.println(error_Message_Search);
        return -1;
    }

    public static void report() {
        HashMap<String, Integer> duplicate_Student = new HashMap<>();
        for (Student student : allStudent) {
            String key = student.get_ID() +"|"+ student.get_Name() +"|"+ student.get_Course_Name();
            if (duplicate_Student.get(key) == null) {
                duplicate_Student.put(key, 1);
            } else {
                duplicate_Student.put(key, duplicate_Student.get(key) + 1);
            }
        }

        Set<String> keySet = duplicate_Student.keySet();
        for (String key : keySet) {
            String studentName = key.substring(key.indexOf("|") + 1, key.lastIndexOf("|"));
            String courseName = key.substring(key.lastIndexOf("|") + 1);
            System.out.printf("%-15s|%-10s|%-5d\n\n", studentName, courseName, duplicate_Student.get(key));
        }
    }

}
