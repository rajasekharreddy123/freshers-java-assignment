package com.rajshekar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * class where execution start and the customers actions are being checked
 *
 */
public class App 
{
    String[][] inOutTime  = new String[10][10];
    int[][] itemsLimit = new int[20][20];
    int upper = 50;  //considering a maximum limit of 50 per item
    int lower = 10; // considering a minimum of 10 quantity per item in store
    public static void main( String[] args )
    {
    	int customerID = 0;
    	App appObj = new App();
    	//selecting the random quantity of items 
    	appObj.computingRandomItemSets();
    	//fetching the in-time
        appObj.customerInOutTime(true,customerID);
        
        //fetching the out-time
        appObj.customerInOutTime(false,customerID);
    }
    /*
     * This function gets the current system time to calculate the in-time and out-time 
     * of the customer.
     * if the argument sent is true then it enters it into the in-time variable else it will
     * enter it to the out-time variable.
     */
    public void customerInOutTime(Boolean checkInOrOut,int customerID)
    {
    	App obj = new App();
    	Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	if(checkInOrOut)
    	{
    		obj.inOutTime[0][0] = sdf.format(cal.getTime());
            System.out.println( "in time" + sdf.format(cal.getTime()) );	
    	}
    	else
    	{
    		obj.inOutTime[0][1] = sdf.format(cal.getTime());
    		System.out.println( "out time" + sdf.format(cal.getTime()) );
    	}
    }
    /*
     * This function calculates the quantity and the cost of each item randomly using 
     * the random function  
     */
    public void computingRandomItemSets()
    {
    	for(int i = 0 ; i < 20 ; i++ )
    	{
    		double rand = Math.random();
    		itemsLimit [i][0] = (int) (rand * (upper - lower)) + lower;
    		itemsLimit [i][1] = (int) (rand * 200);
        	System.out.println("number of items" + itemsLimit[i][0] + "  " +  itemsLimit[i][1] );	
    	}
    }
}
