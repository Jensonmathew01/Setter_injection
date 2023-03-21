package ustbatchno3.di_setterinjection;

public class Roles {
    public String character_name;
    public String responsibility;
	public String getCharacter_name() {
		return character_name;
	}
	public void setCharacter_name(String character_name) {
		this.character_name = character_name;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
    public void display()
    {
    	System.out.println("My name is "+character_name+" My responsibility is "+responsibility);
    }
}
