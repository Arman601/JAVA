interface College {
    void CollegeName();

    void CollegeAddress();

    void CollegeWebsite();

    default void EntranceExam() { // Default method added in Java 8 for backward compatibility

        System.out.println("Student should clear Entrance Exam for admission");

    }

    static void fees() { // static method can be accessed by interface but not inherited
        System.out.println("student fees based on stream");
    }

}

class ErStudent implements College {
    @Override
    public void CollegeName() {
        System.out.println("CollegeName: DSCET");
    }

    @Override
    public void CollegeAddress() { // backward compativity
        System.out.println("CollegeAddress: Chennai");
    }

    @Override
    public void CollegeWebsite() {
        System.out.println("CollegeWebsite: www.dscet.ac.in");

    }
}

class MedicalStudent implements College {
    @Override
    public void CollegeName() {
        System.out.println("CollegeName: DSCET");
    }

    @Override
    public void CollegeAddress() {
        System.out.println("CollegeAddress:  Chennai");
    }

    @Override
    public void CollegeWebsite() {
        System.out.println("CollegeWebsite: www.dscet.ac.in");

    }

    @Override
    public void EntranceExam() {
        System.out.println("Medical student should clear Entrance Exam for admission");

    }

}

public class StudentInformationSystem {
    public static void main(String[] args) {
        ErStudent stu = new ErStudent();
        MedicalStudent medi = new MedicalStudent();
        stu.CollegeName();
        stu.CollegeAddress();
        stu.CollegeWebsite();

        System.out.println();

        medi.CollegeName();
        medi.CollegeAddress();
        medi.CollegeWebsite();
        medi.EntranceExam();

        College.fees();
    }
}



OUTPUT:
CollegeName: DSCET
CollegeAddress: Chennai
CollegeWebsite: www.dscet.ac.in

CollegeName: DSCET
CollegeAddress:  Chennai
CollegeWebsite: www.dscet.ac.in
Medical student should clear Entrance Exam for admission
student fees based on stream
