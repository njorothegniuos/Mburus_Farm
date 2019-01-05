package com.wavesolutions.co.ke;

import java.util.List;

import javax.jws.WebService;

import wavesolutions.co.ke.bl.AnimalServiceImpl;
import wavesolutions.co.ke.models.PigBreed;
import wavesolutions.co.ke.models.makeOrder;

@WebService(endpointInterface="com.wavesolutions.co.ke.IAnimal",portName="Mburus_FarmPort",serviceName="Mburus_FarmService")
public class Animal implements IAnimal {
	AnimalServiceImpl anmlserv = new AnimalServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.wavesolutions.co.ke.IAnimal#getPigBreeds()
	 */
	@Override
	public List<PigBreed> getPigBreeds(){
	   return anmlserv.getPigBreeds();
	}
	
	/* (non-Javadoc)
	 * @see com.wavesolutions.co.ke.IAnimal#getPigBreed(java.lang.String)
	 */
	@Override
	public List<PigBreed> getPigBreed(String pgBreed){
		return anmlserv.getPigBreed(pgBreed);
	}
	
	/* (non-Javadoc)
	 * @see com.wavesolutions.co.ke.IAnimal#placeOder(java.lang.String, int, int, int, int)
	 */
	@Override
	public boolean placeOder(String pigBreed,int number,int age,int males,int females){
		return anmlserv.placeOder(pigBreed, number, age, males, females);
	}

	@Override
	public List<makeOrder> getOrders() {
		return anmlserv.getOrders();
	}
}
