package wavesolutions.co.ke.models;

public class PigBreed extends Response{
	private int breedCode;
	private String pigBreed;
	private String Descr;
	
	public PigBreed(){
		
	}
	public PigBreed(int breedCode,String pigBreed,String Descr){
		this.breedCode=breedCode;
		this.pigBreed = pigBreed;
		this.Descr = Descr;
	}
	
	public int getBreedcode(){
		return breedCode;
	}
	public void setBreedcode(int breedCode){
		this.breedCode = breedCode;
	}
	public String getpigBreed(){
		return pigBreed;
	}
	public void setpigBreed(String pigBreed){
		this.pigBreed=pigBreed;
	}
	public String getDescr(){
		return Descr;
	}
	public void setDescr(String Descr){
		this.Descr =Descr;
	}
}
