package com.ofss;
import java.util.logging.*;
public class MainApp {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger("MainApp");
		HelloWorld hw=new HelloWorld();
		if (log.isLoggable(Level.INFO))
		{
			log.info(hw.sayHello());
			log.info("Total amount payable after interest ig "+hw.calculateSimpleInterest(1000, 0.1, 1));
		}
		
		System.out.println("Adding this code at "+new java.util.Date());
		System.out.println("That's all, let's go for lunch");
		System.out.println("Attempt1: CI integration Demo");
	}

}
