import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringEqualTest {
	public static void main(String[] args) {
		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program" + "ming";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s1.intern());
		
		Scanner sc = new Scanner(System.in);
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(map.getClass().toGenericString());
	    while(sc.hasNext()){
	        String[] strs = sc.nextLine().split(",");
	        int a =Integer.parseInt(strs[0]);
	        int b =Integer.parseInt(strs[1]);
	        int c =Integer.parseInt(strs[2]);
	        int ret=a+b+c;
	        if (ret%2==1) {
				
			}
	        System.out.println(strs);
	    }
		
	}
}