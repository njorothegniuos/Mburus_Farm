package wavesolutions.co.ke.bl;

import java.util.ArrayList;
import java.util.List;

import wavesolutions.co.ke.Utils.Utils;
import wavesolutions.co.ke.models.PigBreed;
import wavesolutions.co.ke.models.makeOrder;


public class AnimalServiceImpl {
	List<PigBreed> Largewhite = new ArrayList<>();
	List<PigBreed> Landrace = new ArrayList<>();
	List<PigBreed> Hampshire = new ArrayList<>();
	
	List<makeOrder> order = new ArrayList<>();
	
	Utils u = new Utils();
	
	public AnimalServiceImpl(){
		Largewhite.add(new PigBreed(100,"Large white","Large white"));
		Landrace.add(new PigBreed(101,"Landrace","Landrace"));
		Hampshire.add(new PigBreed(102,"Hampshire","Hampshire"));
		
		order.add(new makeOrder("",0,0,0,0));
	}
    
	    //create a method to return list of pig breeds
		public List<PigBreed> getPigBreeds(){
			List<PigBreed> pb = new ArrayList<>();
			try{
			pb.add(new PigBreed(100,"Large white","Large white"));
			pb.add(new PigBreed(101,"Landrace","Landrace"));
			pb.add(new PigBreed(102,"Hampshire","Hampshire"));
			}catch(Exception ex){
				u.LogError("AnimalServiceImpl-getPigBreeds", ex);
			}
			return pb;	
		}
		
		//METHOD TO RETURN a pig breed (breed code,breed,description)
		public List<PigBreed> getPigBreed(String pgBreed){
			try{
			switch (pgBreed.toLowerCase()) {
			case "large white":
				return Largewhite;
			case "landrace":
				return Landrace;
			case "hampshire":
				return Hampshire;
			}
			}catch(Exception ex){
				u.LogError("AnimalServiceImpl-getPigBreed", ex);			
			}
			return null;
		}
		 //create a method to get a list of pig breed orders
		public List<makeOrder> getOrders(){
			try{
			
			}catch(Exception ex){
				u.LogError("AnimalServiceImpl-getPigBreeds", ex);
			}
			return order;	
		}
		//method to make an order of pigs by breed,number of pigs and specify age(months),no. of males, no. of females
		public boolean placeOder(String pigBreed,int number,int age,int males,int females){
			try{
			if(pigBreed!="" && number !=0 && age!=0){
				  order.add(new makeOrder(pigBreed,number,age,males,females));
				return true;
			}else{
				
				return false;
			}
		}catch(Exception ex){
			u.LogError("AnimalServiceImpl-getPigBreeds", ex);
			return false;
		}
		}
}
