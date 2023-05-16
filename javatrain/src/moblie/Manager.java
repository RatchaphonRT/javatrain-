package moblie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Manager {
	public static void main(String[] args) {
		Iphone iphonNum1 = new Iphone();
		Iphone iphonNum2 = new Iphone();
		Iphone iphonNum3 = new Iphone();
		iphonNum1.makeCall("0123456789");
		iphonNum1.recieveCall("987654321");
		iphonNum1.slideToUnlock();
		System.out.println(iphonNum1.playSong("Hello Song"));
		System.out.println(iphonNum1.playVideo("Hello Video"));
		System.out.println(iphonNum1.getLocation());
		List<Iphone> iphoneList=new ArrayList<Iphone>();
		iphoneList.add(iphonNum1);
		iphoneList.add(iphonNum2);
		iphoneList.add(iphonNum3);
		System.out.println("IPhone List ");  
		for(Iphone iphone:iphoneList) {
			System.out.println(iphone);  
		}
		HashMap<String, Iphone> iphoneHashMap = new HashMap<String, Iphone>();
		iphoneHashMap.put("0258963789", iphonNum1);
		iphoneHashMap.put("0853697412", iphonNum2);
		iphoneHashMap.put("0895374248", iphonNum3);
		System.out.println("IPhone HashMap ");  
		for(Map.Entry<String, Iphone>  i  :iphoneHashMap.entrySet()) {
			System.out.println("Key : " + i.getKey() +" value : " + i.getValue());  
		}
	}
}
