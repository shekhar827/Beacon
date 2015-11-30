package com.chatak.beacon.util;

import java.util.List;
import java.util.Random;
import java.util.Set;

public final class CommonUtil {

  private static final Double HUNDRED = 100.00;

  public static boolean isNullAndEmpty(String data) {
    return (data == null || "".equals(data.trim()));
  }

  public static boolean isListNotNullAndEmpty(@SuppressWarnings("rawtypes")
  List list) {
    return (list != null && !list.isEmpty());
  }
  
  
  public static boolean isSetNotNullAndEmpty(@SuppressWarnings("rawtypes")
  Set set) {
    return (set != null && !set.isEmpty());
  }

  public static String generateRandomNumber(int length) {
    StringBuffer sb = new StringBuffer();
    Random random = new Random();
    for(int n = 0; n < length; n++) {
      int j = (Math.abs(random.nextInt()) % 10);
      // If First digit is "0", skip that and get next random
      if(n == 0 && j == 0) {
        n--;
        continue;
      }
      sb.append(Integer.toString(j));
    }
    return sb.toString();
  }

  public static String toAmount(Object object) {
    String amount = "0.00";
    try {
      Double doubleValue = null;
      if(object != null) {
        doubleValue = Double.valueOf(object.toString());
        if(null != doubleValue) {
          amount = String.format("%.2f", doubleValue);
        }
      }
    }
    catch(NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return amount;
  }

  /**
   * This method generate the random numeric value based on length
   * 
   * @param length
   * @return String
   */
  public static String generateRandNumeric(int length) {
    String finalRandString = "";
    Random randomObj = new Random();
    for(int j = 0; j < length; j++) {
      int rand_int = randomObj.nextInt(72);
      finalRandString += rand_int;
      if(finalRandString.length() >= length) {
        finalRandString = finalRandString.substring(0, length);
        break;
      }
    }
    return finalRandString;
  }

  public static Long getLongAmount(Double amount) {
    return (amount == null ? null : ((long) (amount * HUNDRED)));
  }

  public static Double getDoubleAmount(Long amount) {
    return (amount == null ? null : ((double) (amount / HUNDRED)));
  }
}
