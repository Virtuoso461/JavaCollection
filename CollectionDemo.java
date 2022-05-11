package StudyDay2;
import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("1");
		c1.add("2");
		
		Object[] objs = c1.toArray();
		for(int i=0;i<objs.length;i++) {
			String s = (String)objs[i];
			System.out.println(s);
		}
	}
}
