public class GeneralPractitioner {
    private String ConsultationType;

    public GeneralPractitioner(){
        super();
        this.ConsultationType = "General Consultation";
    }
    public GeneralPractitioner(int id,String name,String department,String ConsultationType){
        super(id,name,department)
        this.ConsultationType = ConsultationType;
    }
}
