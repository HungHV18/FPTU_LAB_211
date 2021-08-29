
package J1LP0021;

import java.util.*;

public interface Localized {
    
    ArrayList<Student> allStudent = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    String input_Message_ID = "ID Student: ";
    String input_Message_Name = "Name of student: ";
    String input_Message_Semester = "Semester: ";
    String input_Message_Course = "Course name: ";
    String error_Message_courseName = "There are only three courses: Java, .Net, C, C++";

    String welcome_Message = "WELCOME TO STUDENT MANAGEMENT";   
    String menu_Option_1 = "1. Create";
    String menu_Option_2 = "2. Find and Sort";
    String menu_Option_3 = "3. Update/Delete";
    String menu_Option_4 = "4. Report";
    String menu_Option_5 = "5. Exit";
    String user_Manual_Menu = "Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program\n";
    
    String next_Student_Message = "\nNext Student: ";
    String input_Message_Continue = "Do you want to continue (Y/N)?";
    String input_Message_Search = "Search name student: ";
    String input_Message_Update_Or_Delete = "Do you want to update (U) or delete (D) student?";
    String error_Message_Search = "Student not found!";

    String[] all_Course_Name = {"Java", ".Net", "C", "C++"};
    String option_1 = "1";
    String option_2 = "2";
    String option_3 = "3";
    String option_4 = "4";
    String option_5 = "5";
    String choose_Yes = "y";
    String choose_No = "n";
    String choose_Update = "u";
    String choose_Delete = "n";

}
