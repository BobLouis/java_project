package homework;
import java.util.Scanner;
import java.util.ArrayList;
public class hw3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ArrayList<Long> pascal_upper = new ArrayList<Long>();
		ArrayList<Long> pascal_lower = new ArrayList<Long>();
		
		pascal_upper.add(1L); pascal_upper.add(2L); pascal_upper.add(1L);
		for(int j=0;j<num-2;++j) {
			pascal_lower.add(1L); 
			for(int i=0;i<(pascal_upper.size()-1);++i) {
				pascal_lower.add(pascal_upper.get(i)+pascal_upper.get(i+1));
			}
			pascal_lower.add(1L);
			pascal_upper.clear();
			pascal_upper.addAll(pascal_lower);
			if(j!=num-3)
				pascal_lower.clear();
		}
		if(num==2) {
			for(int i=0;i<pascal_upper.size();++i) {
				System.out.print(pascal_upper.get(i)+" ");
			}
		}else {
			for(int i=0;i<pascal_lower.size();++i) {
				System.out.print(pascal_lower.get(i)+" ");
			}
		}
	}
}
