package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question02_09 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		m9(row,col);
		
		
	}
	private static void m9(int row, int col) {
		int [][] nums = new int [row][col];
		


		int k=1;//증가용
		int sero=0;//세로값
		int garo=-1;//가로값
		int direction=1;//방향전환용 열 증가-> 행증가 -> 열 감소 ..이런식으로 가서
		int size = nums[0].length;
		int size1 = nums.length;
		while(0<=size) {

			for(int i=0; i<size; i++) {//사이즈만큼 증가한다.

				garo+=direction;//가로로 가는걸 더한다.

				nums[sero][garo]=k;//가로의 값이변경된다.

				k++;//넣고자 하는 값증가

			}

			size--;//처음에 5개였다면 그다음에 4개, 4개 이런식으로 가므로 줄여준다.
			size1--;


			for(int i=0; i<size1; i++) { //사이즈입력한거에서 하나 준만큼 반복한다.

				sero+=direction;//세로로 가는걸 의미한다.
				nums[sero][garo]=k;//세로값이 증가하는 이유는 일일이 더하기 때문이다.
				k++;//넣고자 하는 값증가


			}

			direction=direction*-1;//방향전환

			//direction의값이 음수일때는 밑에서 위로 올라가는 방향을 표현하고

			//양수일때는 위에서 밑으로 내려오는 세로방향에 대한 표현이 간다.

		}
	
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				{
					System.out.printf("%4d",nums[i][j]);
				}
				
			}
			System.out.println();
		}
	/*
	 
		while(0<=size) {

			for(int i=0; i<size; i++) {//사이즈만큼 증가한다.

				garo+=direction;//가로로 가는걸 더한다.

				nums[sero][garo]=k;//가로의 값이변경된다.

				k++;//넣고자 하는 값증가

			}

			size--;//처음에 5개였다면 그다음에 4개, 4개 이런식으로 가므로 줄여준다.



			for(int i=0; i<size; i++) { //사이즈입력한거에서 하나 준만큼 반복한다.

				sero+=direction;//세로로 가는걸 의미한다.
				nums[sero][garo]=k;//세로값이 증가하는 이유는 일일이 더하기 때문이다.
				k++;//넣고자 하는 값증가


			}

			direction=direction*-1;//방향전환

			//direction의값이 음수일때는 밑에서 위로 올라가는 방향을 표현하고

			//양수일때는 위에서 밑으로 내려오는 세로방향에 대한 표현이 간다.

		}
	
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				if(nums[i][j]==0) {
					System.out.printf("%4d",nums[i][j]);
				}
				
			}
			System.out.println();
		}	
	 */
	}
}
