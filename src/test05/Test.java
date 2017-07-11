package test05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		List penList = new ArrayList();
		Penguin pg1 = new Penguin();
		pg1.setName("欧欧");
		pg1.setSex("Q仔");
		Penguin pg2 = new Penguin();
		pg2.setName("亚亚");
		pg2.setSex("Q妹");
		Penguin pg3 = new Penguin();
		pg3.setName("菲菲");
		pg3.setSex("Q妹");
		Penguin pg4 = new Penguin();
		pg4.setName("美美");
		pg4.setSex("Q妹");
		penList.add(pg1);
		penList.add(pg2);
		penList.add(pg3);
		penList.add(pg4); 
	    System.out.println("共计有" + penList.size() + "只企鹅。");
		System.out.println("分别是：");
		for (int i = 0; i < penList.size(); i++) {
			Penguin pg = (Penguin) penList.get(i);
			System.out.print(pg.getName());
			System.out.print("  ");
			System.out.println(pg.getSex());
		}
		Scanner input = new Scanner(System.in);
		System.out.println("请输入狗的名称：");
		String name = input.nextLine();
		Iterator it = penList.iterator();
		while(it.hasNext()) {
			Penguin pg = (Penguin) it.next();
			if(pg.getName().equals(name)) {
				System.out.print(pg.getName());
				System.out.print("  ");
				System.out.println(pg.getSex());
				break;
			}
			else{
				System.out.println("没有这只企鹅");
				break;
			}
			
		}
		/*penList.remove(penList.size()-1);
		penList.remove(pg4);
		System.out.println("删除之后还有" + penList.size() + "只企鹅。");
		System.out.println("分别是：");
		for (int i = 0; i < penList.size(); i++) {
			Penguin pg = (Penguin) penList.get(i);
			System.out.print(pg.getName());
			System.out.print("  ");
			System.out.println(pg.getSex());
		}
		if(penList.contains(pg4))
			System.out.println("集合中包含美美的信息");
		else
			System.out.println("集合中不包含美美的信息");*/
	}
	
}


