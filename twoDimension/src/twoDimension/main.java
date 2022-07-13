package twoDimension;

public class main {
	public static void main(String[] args) {
		int[][]arr = new int[8][7];
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] = j+(i * arr[i].length)+1;
				System.out.println(arr[i][j]);
			}
		}	
	}
}
