package wavesolutions.co.ke.models;

public class makeOrder extends Response{
	
	private String pigBreed;
	private int number;
	private int age;
	private int males;
	private int females;
	
	public makeOrder(String pigBreed,int number,int age,int males,int females){
		this.pigBreed=pigBreed;
		this.number = number;
		this.age = age;
		this.males = males;
		this.females = females;
	}
	
	public String getpigBreed(){
		return pigBreed;
	}
	public void setpigBreed(String pigBreed){
		this.pigBreed = pigBreed;
	}
	
	public int getnumber(){
		return number;
	}
	public void setnumber(int number){
		this.number = number;
	}
	
	public int getage(){
		return age;
	}
	public void setage(int age){
		this.age = age;
	}
	
	public int getmales(){
		return males;
	}
	public void setmales(int males){
		this.males = males;
	}
	
	public int getfemales(){
		return females;
	}
	public void setfemales(int females){
		this.females = females;
	}
}
