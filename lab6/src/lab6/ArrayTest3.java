package lab6;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] seat = new int [100][10];
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j]=i*j;
			}
		}
		
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(seat[i][j]+" ");
	
			}
			
			System.out.print("\n");
		}
	}
}
