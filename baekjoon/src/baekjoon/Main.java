package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 	3 16
 ------------
	3
	5
	7
	11
	13
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//dго╬о~~~~
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		boolean flag = true;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=N;i<=M;i++) {
			if(i != 1) {
				flag = true;
				for(int j=2;j<=i-1;j++) {
					if(i%j == 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println(i);
				}
			}
		}
	}
}
