package Test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Dog dg1= new Dog();
		dg1.setName("菲菲");
		dg1.setStrain("秋田");
		Dog dg2= new Dog();
		dg2.setName("欧欧");
		dg2.setStrain("雪纳瑞");
		Map dogMap = new HashMap();
		dogMap.put("菲菲", dg1);
		dogMap.put("欧欧", dg2);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入狗的名称：");
		String name = input.nextLine();
		if (dogMap.containsKey(name)) {
			Dog dog = (Dog) dogMap.get(name);
			System.out.println("Map中存在指定对象，对象信息如下：");
			System.out.print(dog.getName());
			System.out.print("  ");
			System.out.println(dog.getStrain());	
		} else {
			System.out.println("没有这只狗");
		}
	}
}


