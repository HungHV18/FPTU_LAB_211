package J1LP0022;

import MainProject.Localized;

public class Function implements Localized {

    public static void create_Experience() {
        Experience newExperience = new Experience();
        if (isContinue()) {
            create_Experience();
        }
        newExperience.getInfomation();
        Localized.all_Experience.add(newExperience);
    }

    public static void create_Fresher() {
        Fresher newFresher = new Fresher();
        if (isContinue()) {
            create_Fresher();
        }
        newFresher.getInfomation();
        Localized.all_Fresher.add(newFresher);
    }

    public static void create_Intern() {
        Intern newIntern = new Intern();
        if (isContinue()) {
            create_Intern();
        }
        newIntern.getInfomation();
        Localized.all_Intern.add(newIntern);
    }

    public static boolean isContinue() {
        System.out.println(input_Message_Continue);
        switch (sc.nextLine().toLowerCase()) {
            case choose_Yes:
                return true;
            case choose_No:
                return false;
            default:
                System.out.println(error_Message_Continue);
                return isContinue();
        }
    }

    public static void searching() {
        show_All_CandidateName();
        System.out.print(input_Message_CandidateName);
        String name = sc.nextLine();

        System.out.print(input_Message_TypeOfCandidate);
        String type_Candidate = sc.nextLine();

        if (type_Candidate.equals(all_candidatesType[0])) {
            serach_Experience(name);
        }
        if (type_Candidate.equals(all_candidatesType[1])) {
            search_Fresher(name);
        }
        if (type_Candidate.equals(all_candidatesType[2])) {
            search_Intern(name);
        }
    }

    private static void show_All_CandidateName() {
        if (all_Experience.isEmpty() == false) {
            System.out.println(content_ShowExperienceName);
            for (Experience candidate : all_Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        if (all_Fresher.isEmpty() == false) {
            System.out.println(content_ShowFresherName);
            for (Fresher candidate : all_Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        if (all_Intern.isEmpty() == false) {
            System.out.println(content_ShowInternName);
            for (Intern candidate : all_Intern) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }

    private static void serach_Experience(String name) {
        for (Experience candidate : all_Experience) {
            String nameCandidate = candidate.getFirstName() + candidate.getLastName();
            if (nameCandidate.contains(name)) {
                candidate.getInfomation();
                return;
            }
        }
        System.out.println(error_Message_Search);
    }

    private static void search_Fresher(String name) {
        for (Fresher candidate : all_Fresher) {
            String nameCandidate = candidate.getFirstName() + candidate.getLastName();
            if (nameCandidate.contains(name)) {
                candidate.getInfomation();
                return;
            }
        }
        System.out.println(error_Message_Search);
    }

    private static void search_Intern(String name) {
        for (Intern candidate : all_Intern) {
            String nameCandidate = candidate.getFirstName() + candidate.getLastName();
            if (nameCandidate.contains(name)) {
                candidate.getInfomation();
                return;
            }
        }
        System.out.println(error_Message_Search);
    }
}
