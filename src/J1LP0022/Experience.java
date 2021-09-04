package J1LP0022;

public class Experience extends Candidates {

    private String expInYear;
    private String proSkill;

    public Experience() {
        super(all_candidatesType[0]);
        create_ExpInYear();
        create_ProSkill();
    }

    private void create_ExpInYear() {
        System.out.print(input_Message_ExpInYear);
        setExpInYear(sc.nextLine());
    }

    public void setExpInYear(String expInYear) {
        if (checkExpInYear(expInYear)) {
            this.expInYear = expInYear;
        } else {
            System.out.println(error_Message_ExpInYear);
            create_ExpInYear();
        }
    }

    private boolean checkExpInYear(String expInYear) {
        try {
            int year = Integer.parseInt(expInYear);
            return year >= expInYear_Min && year <= expInYear_Max;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void create_ProSkill() {
        System.out.print(input_Message_ProSkill);
        setProSkill(sc.nextLine());
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return this.expInYear;
    }

    public String getProSkill() {
        return this.proSkill;
    }
}
