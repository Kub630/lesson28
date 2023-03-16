public class Student {
    private String name;
    private int howmanycourses;
    private String profession;
    private int howoldishe;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowmanycourses() {
        return howmanycourses;
    }

    public void setHowmanycourses(int howmanycourses) {
       this.howmanycourses = howmanycourses;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getHowoldishe() {
        return howoldishe;
    }

    public void setHowoldishe(int howoldishe) {
        if (howoldishe>0){
        this.howoldishe = howoldishe;
    }
}
}
