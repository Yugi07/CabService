

package com.tdd.day_30;

public class CabService {
   
  public  double calculateFare(final double distance, final int minute)
    
   double totalFare = 5;
  if(distance<1.0 && minute <=5) {
   return totalFare;
   }
 totalFare = (distance * 10)+minute;

  return totalFare;
     }
 }  
 