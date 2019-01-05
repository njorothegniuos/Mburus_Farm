package com.wavesolutions.co.ke;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import wavesolutions.co.ke.models.PigBreed;
import wavesolutions.co.ke.models.makeOrder;

@WebService(name="Mburus_Farm",targetNamespace="http://www.wavesolutions.co.ke")
public interface IAnimal {
	
	@WebMethod(action="fetch_PigBreeds",operationName="fetchPigBreeds")
	public abstract List<PigBreed> getPigBreeds();
	@WebMethod
	public abstract List<PigBreed> getPigBreed(String pgBreed);
	@WebMethod
	public abstract List<makeOrder> getOrders();
	@WebMethod
	public abstract boolean placeOder(String pigBreed, int number, int age,
			int males, int females);
}