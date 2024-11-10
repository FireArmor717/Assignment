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
    //Method to print details
    public void printDetails(){
        System.out.println("ID"+id);
        System.out.println("Name:"+name);
        System.out.println("Department"+department);
    }
}
