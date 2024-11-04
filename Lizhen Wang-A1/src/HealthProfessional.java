public class HealthProfessional {
    private int id;
    private String name;
    private String department;
    //Default Constructor
    public HealthProfessional(){
        this.id = 0;
        this.name = "None";
        this.department = "None";
    }
    //All fields' Constructor
    public HealthProfessional(int id,String name,String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
}
