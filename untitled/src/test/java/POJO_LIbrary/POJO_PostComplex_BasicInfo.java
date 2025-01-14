package POJO_LIbrary;

public class POJO_PostComplex_BasicInfo {
    String FirstName;
    String LastName;
    int Id;
    String Designation;
    String MentorName;
    String CourseName;
    POJO_PostComplex_Address[] Address;

    public POJO_PostComplex_Address[] getAddress() {
        return Address;
    }

    public void setAddress(POJO_PostComplex_Address[] address) {
        Address = address;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMentorName() {
        return MentorName;
    }

    public void setMentorName(String mentorName) {
        MentorName = mentorName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }


}
