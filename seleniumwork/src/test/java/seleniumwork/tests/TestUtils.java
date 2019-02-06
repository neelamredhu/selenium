package seleniumwork.tests;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.jboss.aerogear.security.otp.Totp;

public class TestUtils {
	
	public String generateTwoFactorCode() {
		String otpKeyStr = "LJKGE52QMFFVCQ3LNJYDOZSQJE"; // <- this 2FA secret key.
		Totp totp = new Totp(otpKeyStr);
		String twoFactorCode = totp.now(); // <- got 2FA coed at this time!
		System.out.println("PassCode: " +twoFactorCode);
		
		return twoFactorCode;
	}
	

	public HashMap<String, String> loadProperties() {
		String propertyFile = "src/test/resources/application.properties";
	
		HashMap<String, String> myMap = new HashMap<>();
		
		try(
			FileInputStream fileInputStream = new FileInputStream(propertyFile);
		){
			Properties properties = new Properties();
			properties.load(fileInputStream);
			
			Set<Object> propKeys = properties.keySet();
			propKeys.forEach(key -> myMap.put(key.toString(), properties.get(key).toString()));
			
			System.out.println("Map : "+myMap.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return myMap;
	}
}
