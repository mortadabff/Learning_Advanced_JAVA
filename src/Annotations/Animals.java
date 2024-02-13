package Annotations;

public class Animals {

	private String categorie;
	private String name;
	
	
	
	public Animals(String categorie, String name) {
		super();
		this.categorie = categorie;
		this.name = name;
	}
	

	public void hub() {
		System.out.println("hub hub ");
		
	}
	
	@RunMethod(times=4 )
	public void move(){
		System.out.println(name +"is  moving  ");
		
	}
	@Important
	public void dance() {
		System.out.println(name +"is  dancing  ");

		
	}
	
}
