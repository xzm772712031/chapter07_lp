package Test04;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
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
		Map<String,Penguin> penguinMap=new HashMap<String,Penguin>();
		penguinMap.put("1",pg1);
		penguinMap.put("2",pg2);
		penguinMap.put("3",pg3);
		penguinMap.put("4",pg4);	
		System.out.println("使用Iterator遍历，所有企鹅的昵称和品种分别是：");
		Set<String> keys=penguinMap.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			String key=it.next(); 
			Penguin pg=penguinMap.get(key);  
			System.out.print(pg.getName());
			System.out.print("  ");
			System.out.println(pg.getSex());
		}
		System.out.println("使用foreach语句遍历，所有企鹅的昵称和品种分别是：");
		 for(String key:keys){
			 Penguin pg=penguinMap.get(key);  
			 System.out.print(pg.getName());
				System.out.print("  ");
				System.out.println(pg.getSex());	
		}
	}
}
