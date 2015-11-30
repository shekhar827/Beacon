package com.chatak.beacon.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.BeanUtils;

public final class CommonUtil {
	
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

  public static boolean isNullAndEmpty(String data) {
    return (data == null || "".equals(data.trim()));
  }

  public static boolean isListNotNullAndEmpty(List list) {
    return (list != null && !list.isEmpty());
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

  /**
   * Method to copy the the list of beans properties from source to destination
   * class bean
   * 
   * @param sourceList
   * @param D
   * @return
   * @throws InstantiationException
   * @throws IllegalAccessException
   */
  @SuppressWarnings("unchecked")
  public static <Source, Destination> List<Destination> copyListBeanProperty(Iterable<Source> sourceList,
                                                                             Class Destiniation) throws InstantiationException,
                                                                                                IllegalAccessException {
    List<Destination> list = new ArrayList<Destination>();
    for(Source source : sourceList) {
      list.add((Destination) copyBeanProperties(source, Destiniation));
    }
    return list;
  }

	@SuppressWarnings("unchecked")
	public static <Source, Destination> Set<Destination> copySetBeanProperty(Iterable<Source> sourceList, Class Destiniation)
			throws InstantiationException, IllegalAccessException {
		Set<Destination> list = new HashSet<Destination>();
		for (Source source : sourceList) {
			list.add((Destination) copyBeanProperties(source, Destiniation));
		}
		return list;
	}
  
  /**
   * Method to copy the the bean properties from source to destination class
   * bean
   * 
   * @param source
   * @param Destination
   * @return
   * @throws InstantiationException
   * @throws IllegalAccessException
   */
  @SuppressWarnings("unchecked")
  public static <Source, Destination> Destination copyBeanProperties(Source source, Class Destination) throws InstantiationException,
                                                                                                      IllegalAccessException {
    Destination destination = (Destination) Destination.newInstance();
    BeanUtils.copyProperties(source, destination);
    return destination;
  }

  /**
   * This method is used to copy the not null properties from source object to
   * destination object.
   * 
   * @param source
   * @param destination
   * @throws Exception
   */
  public static <Source, Destination> void copyProperties(Source source, Destination destination) throws Exception {
    for(Method method : source.getClass().getDeclaredMethods()) {
      try {
        String methodName = method.getName();
        if(methodName.startsWith("get")) {
          methodName = methodName.replaceFirst("get", "set");
          Object value = method.invoke(source, null);
          if(value != null) {
            Method method2 = destination.getClass().getMethod(methodName, value.getClass());
            method2.invoke(destination, value);
          }
        }
      }
      catch(Exception e) {
      }
    }
  }

  public static String getCardType(String pan) {
    String type = null;
    Pattern pattern;
    Matcher matcher;
    final String VISA = "^4[0-9]{12}(?:[0-9]{3})?$";
    pattern = Pattern.compile(VISA);
    matcher = pattern.matcher(pan);
    if(matcher.matches()) {
      return "VISA";
    }
    final String MC = "^5[1-5][0-9]{14}$";
    pattern = Pattern.compile(MC);
    matcher = pattern.matcher(pan);
    if(matcher.matches()) {
      return "MC";
    }
    final String AMEX = "^3[47][0-9]{13}$";
    pattern = Pattern.compile(AMEX);
    matcher = pattern.matcher(pan);
    if(matcher.matches()) {
      return "AMEX";
    }
    final String DISCOVER = "^6(?:011|5[0-9]{2})[0-9]{12}$";
    pattern = Pattern.compile(DISCOVER);
    matcher = pattern.matcher(pan);
    if(matcher.matches()) {
      return "DISCOVER";
    }
    final String JCB = "^(?:2131|1800|35\\d{3})\\d{11}$";
    pattern = Pattern.compile(JCB);
    matcher = pattern.matcher(pan);
    if(matcher.matches()) {
      return "JCB";
    }
    final String DINERS = "^3(?:0[0-5]|[68][0-9])[0-9]{11}$";
    pattern = Pattern.compile(DINERS);
    matcher = pattern.matcher(pan);
    if(matcher.matches()) {
      return "DINERS";
    }
   

    return type;
  }
  
  /** Method to update the Parameter Version Number
   * 
   * @param currentVersion
   * @return
   * @throws Exception
   */
  public static String updateParameterVersion(String currentVersion) throws Exception {
    if (currentVersion == null || currentVersion.length() != 7) {
      throw new Exception("Invalid current version number");
    }
    String prefix = currentVersion.substring(0, 5);
    String suffix = currentVersion.substring(5);
    String parameterVersionPrefix = getParameterVersionPrefix();
    if (prefix.equals(parameterVersionPrefix)) {
      String number = String.valueOf((Integer.parseInt(suffix) + 1)).length() == 1 ? "0" + String.valueOf((Integer.parseInt(suffix) + 1)) : String.valueOf((Integer.parseInt(suffix) + 1));
      return parameterVersionPrefix + number;
    }
    return generateParameterVersion();
  }

  /** Method to generate the Parameter Version Number
   * 
   * @return
   */
  public static String generateParameterVersion() {
    return getParameterVersionPrefix() + "01";
  }

  private static String getParameterVersionPrefix() {
    Calendar calendar = Calendar.getInstance();
    String hourOfTheYear = String.valueOf(((calendar.get(Calendar.DAY_OF_YEAR) - 1) * 24) + (calendar.get(Calendar.HOUR_OF_DAY)));
    String lastDegitOfTheYear = String.valueOf(calendar.get(Calendar.YEAR)).substring(3);
    String versionPrefix = lastDegitOfTheYear + hourOfTheYear;
    return versionPrefix;
  }

	/** Method to generate the Parameter Version Number
	 * 
	 * @return
	 */
	public static String generateYHHHCC() {
		return getYHHHCCPrefix() + "01";
	}

	private static String getYHHHCCPrefix() {
		Calendar calendar = Calendar.getInstance();
		String hourOfTheYear = String.valueOf(((calendar.get(Calendar.DAY_OF_YEAR) - 1) * 24) + (calendar.get(Calendar.HOUR_OF_DAY)));
		String lastDegitOfTheYear = String.valueOf(calendar.get(Calendar.YEAR)).substring(3);
		String versionPrefix = lastDegitOfTheYear + hourOfTheYear;
		return versionPrefix;
	}
  /** Method to convert the byte array to hex string
   * 
   * @param bytes
   * @return
   */
	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
	
  public static void main(String[] args) {
    System.out.println(CommonUtil.getCardType("6011111115111116"));

  }

  /*
   * public static Long getLongAmount(Double amount){ return (amount == null ?
   * null : ((long) (amount * HUNDRED))); } public static Double
   * getDoubleAmount(Long amount){ return (amount == null ? null : ((double)
   * (amount / HUNDRED))); }
   */
}
