package test;

import java.util.HashMap;
import java.util.Map;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import groovy.lang.GroovyShell;

public class GroovyTest {
	public static void main(String[] args) throws Throwable {
//		groovyOne();
		groovyTwo();


	}
	
	
	public static void groovyOne() throws Exception{
		String script="def compute(def str) {"
				+"def list=[1,2,3,4,5];"
				+ "println(list);"
				+ "println(str);"
				+"};";
		String script01=""
				+"def list=[1,2,3,4,5];"
				+ "println(list);"
				+"";
		ClassLoader parent=ClassLoader.getSystemClassLoader();
		GroovyClassLoader loader=new GroovyClassLoader(parent);
		Class< ?> clazz = loader.parseClass(script);
		GroovyObject clazzObj = (GroovyObject)clazz.newInstance();
		clazzObj.invokeMethod("compute",null);
		System.out.println("over");
	}
	
	public static void groovyTwo(){
		String script="def Gname=DATABLOCK.name;"
				+ "def Gage=DATABLOCK.age;"
				+"def list=[1,2,3,4,5];"
				+ "println(list);"
				+ "def Gmap=[Gname:Gname,Gage:Gage];"
				+"return Gmap.'Gname'+','+Gmap.'Gage'";
		//无需传入ClassLoader,构造会自己new
		GroovyShell shell=new GroovyShell();
		Map<String,Object> dataMap=new HashMap<String,Object>();
		dataMap.put("name", "Gorden");
		dataMap.put("age", 25);
		shell.setVariable("DATABLOCK",dataMap );
		Object o=shell.evaluate(script);
		System.out.println(o);
		
		
		
//		System.out.println(GroovyTest.class.getClassLoader());
	}
	

	
}
