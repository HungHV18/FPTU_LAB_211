package J1LP0022;

public class Fresher extends Candidates {

    private String graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher() {
        super(all_candidatesType[1]);
        create_Graduation_date();
        create_Graduation_rank();
        create_Education();
    }

    private void create_Graduation_date() {
        System.out.print(input_Message_Graduation_date);
        setGraduation_date(sc.nextLine());
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    private void create_Graduation_rank() {
        System.out.print(input_Message_Graduation_rank);
        setGraduation_rank(sc.nextLine());
    }

    public void setGraduation_rank(String graduation_rank) {
        if (checkGraduation_rank(graduation_rank)) {
            this.graduation_rank = graduation_rank;
        } else {
            System.out.println(error_Message_Graduation_rank);
            create_Graduation_rank();
        }
    }

    private boolean checkGraduation_rank(String graduation_rank) {
        for (String rank : rankOfGraduation) {
            if (graduation_rank.toLowerCase().equals(rank.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private void create_Education() {
        System.out.print(input_Message_Education);
        setEducation(sc.nextLine());
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduation_date() {
        return this.graduation_date;
    }

    public String getGraduation_rank() {
        return this.graduation_rank;
    }

    public String getEducation() {
        return this.education;
    }
}
