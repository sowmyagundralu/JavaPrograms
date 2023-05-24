package com.mobileapp.model;

import com.mobileapp.exceptions.MobileNotFoundException;
import com.mobileapp.service.MobileService;

public class MobileMain {

	public static void main(String[] args) {
		
       try
       {
    	   MobileService mobile=new MobileServiceImpl();
    	   System.out.println("get by id details are.....");
           System.out.println(mobile.getById(2));
           Mobile[] all=mobile.getAll();
           System.out.println("mobile details are......");
           for(Mobile alldetails:all)
           {
        	   System.out.println(alldetails);
           }
           
          Mobile[] brand= mobile.getByBrand("oppo");
          System.out.println("get by brand details are.....");
          for(Mobile branddetails:brand)
          {
        	  System.out.println(branddetails);
          }
           
       }
       catch(Exception e)
       {
    	   System.out.println(e.getMessage());
       }
	}

}
