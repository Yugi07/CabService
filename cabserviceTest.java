package com.tdd.day_30;

import org.junit.Test;

public class CabServiceTest {

   @Test
   public void testCalculateFare_Should_Return_Total_Fare() {
    
    cabService cabService = new cabService();

    final double distance = 260;
    final int minute = 90;
    double totalFare = cabService.calculateFare(distance,minute);
   
 
     assertEquals(2690, totalFare,0);
     }
 
 
   @Test
   public void testCalculateFare_Should_Return_min_Fare() {
    
    cabService cabService = new cabService();

    final double distance = 0.5;
    final int minute = 5;
    double totalFare = cabService.calculateFare(distance,minute);
   
 
     assertEquals(5, totalFare,0);
     }
  }  