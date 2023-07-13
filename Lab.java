public class Lab {
    public static void main(String[] args) {

        Studen studen = new Studen("65022000","John Doe",1,4);

        studen.showDetails();

        studen.Name ="John DoE";

        studen.idEdit("68022888");
        studen.addmissionYearEdit(10);
        studen.gpaEdit(3.5);
        studen.showDetails();

    }
    
}
class Studen{
    public String Name;
    private String ID;
    private int addmissionYear;
    private double GPA;

    Studen(String ID,String Name,int addmissionYear,double GPA){
        this.Name = Name;
        this.ID = ID;
        this.addmissionYear = addmissionYear;
        this.GPA = GPA;
    }
    public void idEdit(String ID){
        this.ID = ID;
    }
    public void addmissionYearEdit(int addmissionYear){
        this.addmissionYear = addmissionYear;
    }
    public void gpaEdit(double GPA){
        this.GPA = GPA;
    }
    public void showDetails(){
        System.out.println("ID: "+this.ID);
        System.out.println("Name: "+this.Name);
        System.out.println("addmissionYear: "+this.addmissionYear);
        System.out.println("GPA: "+this.GPA);
        System.out.println("");
    }
}