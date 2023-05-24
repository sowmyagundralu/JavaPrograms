package com.mobileapp.model;

import com.mobileapp.exceptions.MobileNotFoundException;
import com.mobileapp.service.MobileService;

public class MobileServiceImpl implements MobileService {

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		int count=0;
		Mobile[] mobiles=allMobiles();
		for(Mobile mobile:mobiles) {
			if(mobile.getMobileId()==id)
			{
				count++;
				return mobile;
				
			}
		}
		if(count==0)
		 throw new MobileNotFoundException("mobile is not found");	
		return null;
	}

	@Override
	public Mobile[] getAll() {
		
		Mobile[] mobiles=allMobiles();
		return mobiles;
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		int count=0;
		Mobile[] mobiles=allMobiles();
		for(Mobile mobile:mobiles) {
			if(mobile.getBrand().equals(brand))
				count++;
		}
		Mobile[] mobilesbybrand=new Mobile[count];
		if(count>0)
		{
		int j=0;
		for(int i=0;i<mobiles.length;i++)
		{
			if(mobiles[i].getBrand().equals(brand))
			{
				mobilesbybrand[j]=mobiles[i];
				j++;
			}
		}
		}
		else
			throw new MobileNotFoundException("mobile is not found");	
		return mobilesbybrand;
	}
	private Mobile[] allMobiles()
	{
		Mobile[] mobiles=new Mobile[7];
		mobiles[0]=new Mobile("A113",9999,"Samsung",1);
		mobiles[1]=new Mobile("F21",6000,"oppo",3);
		mobiles[2]=new Mobile("S16",8000,"oppo",5);
		mobiles[3]=new Mobile("RENO8T",7500,"vivo",2);
		mobiles[4]=new Mobile("k6",9500,"lenevo",6);
		mobiles[5]=new Mobile("A113",10000,"Samsung",8);
		mobiles[6]=new Mobile("W30",12000,"Samsung",4);
		
		return mobiles;
	}

}
