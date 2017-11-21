package test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class JsonTest {
	public static void main(String[] args) {
		Gson gson=new Gson();
		Map dataMap=new HashMap();
		Map subMap=new HashMap();
		dataMap.put("number1",123456000);
		dataMap.put("number2",123);
		dataMap.put("string1","10000000000000000000");
		
		subMap.put("sub", 1200);
		dataMap.put("subMap", subMap);
		
		
		String result=gson.toJson(dataMap);
		System.out.println(result);
		System.out.println("==============================================================");
		
		Map reuturnMap=gson.fromJson(result, Map.class);
		System.out.println(reuturnMap);
	}
}
