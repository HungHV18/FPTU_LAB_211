package J1LP0022;

import java.util.*;

interface Localized {

    Scanner sc = new Scanner(System.in);
    String[] all_candidatesType = {"0", "1", "2"};

    ArrayList<Experience> all_Experience = new ArrayList<>();
    ArrayList<Fresher> all_Fresher = new ArrayList<>();
    ArrayList<Intern> all_Intern = new ArrayList<>();

    String number_Of_Option_1 = "1";
    String number_Of_Option_2 = "2";
    String number_Of_Option_3 = "3";
    String number_Of_Option_4 = "4";
    String number_Of_Option_5 = "5";

    String contentMenu = "CANDIDATE MANAGEMENT SYSTEM";
    String option_1 = "1.	Experience";
    String option_2 = "2.	Fresher";
    String option_3 = "3.	Internship";
    String option_4 = "4.	Searching";
    String option_5 = "5.	Exit";
    String user_Manual_Menu = "Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program";

    String content_ShowExperienceName = "===========EXPERIENCE CANDIDATE============";
    String content_ShowFresherName = "==========FRESHER CANDIDATE==============";
    String content_ShowInternName = "===========INTERN CANDIDATE==============";

    String input_Message_CandidateName = "Input Candidate name (First name or Last name): ";
    String input_Message_TypeOfCandidate = "Input type of candidate: ";
    
    String input_Message_Continue = "Do you want to continue (Y/N)?. ";
    String option_Yes = "y";
    String option_No = "n";
    String error_Message_Continue = "Chooses Y to continues, N to return main screen";
    
    int length_birthDate = 4;
    int year_birthDate = 1900;
    int expInYear_Min = 0;
    int expInYear_Max = 100;
    String[] domainEmail = {"@fpt.edu.vn", "@gmail.com"};
    String[] rankOfGraduation = {"Excellence", "Good", "Fair", "Poor"};

    String input_Message_CandidateID = "Candidate ID: ";
    String input_Message_FirstName = "First Name: ";
    String input_Message_LastName = "Last Name: ";
    String input_Message_BirthDate = "Birth Date: ";
    String input_Message_Address = "Address: ";
    String input_Message_Phone = "Phone: ";
    String input_Message_Email = "Email: ";

    String error_Message_BirthDate = "Birth Date format not correct!";
    String error_Message_Phone = "Phone format not correct";
    String error_Message_Email = "Email format not correct";

    String input_Message_ExpInYear = "Year of experience: ";
    String input_Message_ProSkill = "Professional Skill: ";

    String error_Message_ExpInYear = "Year of Experience is number from 0 to 100";

    String input_Message_Graduation_date = "Graduated time: ";
    String input_Message_Graduation_rank = "Rank of Graduation: ";
    String input_Message_Education = "University: ";

    String error_Message_Graduation_rank = "Graduation rank with one of 4 values: Excellence, Good, Fair, Poor";

    String input_Message_Majors = "Majors: ";
    String input_Message_Semester = "Semester: ";
    String input_Message_UniversityName = "University Name: ";

    String error_Message_Search = "Candidate not found";

    String info_Format = "%-15s|%-10s|%-15s|%-15s|%-15s|%-5s\n";
}
