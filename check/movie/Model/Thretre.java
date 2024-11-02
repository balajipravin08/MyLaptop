package Model;

public class Thretre {
    private int id ;
    private String thretreName;
    private String location;
    private boolean ac;
    private int capacity;
    
    public Thretre(int id,String thretreName,String location,boolean ac, int capacity){
        this.id=id;
        this.thretreName=thretreName;
        this.location=location;
        this.ac=ac;
        this.capacity=capacity;
    }
    public Thretre(String thretreName,String location,boolean ac ,int capacity){
        this.thretreName=thretreName;
        this.location=location;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getId() {
        return id;
    }
    public String getThretreName() {
        return thretreName;
    }
    public String getLocation() {
        return location;
    }
    public boolean isAc() {
        return ac;
    }
    public int getCapacity(){
    	return capacity;
    }

    public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("---------------------------------------------\n");
		sb.append(String.format("|%-20s : %-20s|\n", "Thretre Id",  getId()));
		sb.append(String.format("|%-20s : %-20s|\n", "Thretre Name",  getThretreName()));
		sb.append(String.format("|%-20s : %-20s|\n", "Thretre Location",  getLocation()));
		sb.append(String.format("|%-20s : %-20s|\n", "Thretre Type", isAc()));
		sb.append(String.format("|%-20s : %-20s|\n", "Thretre Capacity", getCapacity()));
		sb.append("---------------------------------------------\n");
		return sb.toString();
	}
}
