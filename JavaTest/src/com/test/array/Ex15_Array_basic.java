package com.test.array;

import java.util.Arrays;

public class Ex15_Array_basic {
	public static void main(String[] args) {
		//자바(객체 지향 프로그래밍 언어) : 제어문, 배열, 클래스
		//Ex15_Array_basic.java
		
		//-자료구조 : 배열
		//-알고리즘 : 제어문+배열
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//project();
		//m7();
		//m8();
		//m9();
		m10();
		//제어문,배열이 중요 
		
	}

	private static void m10() {
		
		//성적 데이터 
		// - 학생 3명
		// - 과목 3과목
		// - 점수 0 ~ 100
		// - 총점, 평균
		
		int count = 3;
		String[] name = new String[count];
		int[][] score = new int [count][3];
		
		name[0] = "홍길동";
		name[1] = "아무개";
		name[2] = "하하하";
		
		for(int i=0;i<score.length;i++) {
			// 학생 1명
			for(int j=0;j<score[0].length;j++) {
				//1 과목 
				score[i][j] = (int)(Math.random()*41)+60; // 60~100점
				
			}
		}
		//성적표 출력

		//int sum=0; 3명의 3과목 누적
		System.out.println("==============================================");
		System.out.println("                   성적표");
		System.out.println("==============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for(int i=0;i<score.length;i++) {
			
			System.out.printf("%s\t",name[i]);
//			System.out.printf("%d\t",score[i][0]);
//			System.out.printf("%d\t",score[i][1]);
//			System.out.printf("%d\t",score[i][2]);
			
			int sum=0; // 다른 사람끼리의 총점과 섞이지 x
			for(int j=0;j<score[0].length;j++) {
				System.out.printf("%6d\t",score[i][j]);
				sum+=score[i][j]; //한사람 국,영,수
				
			}
			System.out.printf("%6d\t%6.1f",sum,sum/3.0); 
			System.out.println();
		}
		
		
	}
	//이용해서 문제 풀어
	private static void m9() { //문제 base
		
	int [][] nums = new int [5][5];
		
		int n =1;
		//입력
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<=i;j++) {
				nums[i][j] = n; 
				n++;
			}
		}
		//출력 (수정 금지)
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				System.out.printf("%5d",nums[i][j]); //한층
			}
			System.out.println();
		}
	}

	private static void m8() {
		
		//배열 초기화 리스트
		int[] num1= new int[] {10,20,30};
		int[] num2 = {10,20,30};
		
		int[][] num3 = new int[][] {{10,20,30},{40,50,60}}; // {A,B} -> {{},{}}
		int[][] num4 = {{1,2,3},{4,5,6}};
		
		//= new int[2][2][3]
		int[][][] num5 = {{{10,20,30},{40,50,60}},{{70,80,90},{100,110,120}}};
		
		int[][][] num6 = {
							{
								{10,20,30},
								{40,50,60}
								},
								{
									{70,80,90},
									{100,110,120}
									}
								};
		
		
		
	}

	private static void m7() {
		
		//다차원 배열
		// - 배열은 차수를 가진다.
		// - 1차원 배열
		// - 2차원 배열
		// - 3차원 배열
		
		// - 1차원 배열
		int[] num1 = new int[3];
		// - 2차원 배열
		int[][] num2 = new int[2][3]; //층호실 2행 3열 -> 6개
		
		num2[0][0] = 100;
		num2[0][1] = 200;
		num2[0][2] = 300;
		
		num2[1][0] = 400;
		num2[1][1] = 500;
		num2[1][2] = 600;
		
		//System.out.println(num2.length); //앞의 숫자를 반환한 것
		System.out.println();
		
		//2차원 배열 탐색 -> 2중 for문
		for(int i=0;i<num2.length;i++) { //행,층 2
			
			for(int j=0;j<num2[0].length;j++) { //열,호수 , 안에 들어있는 배열이 2개 들어 인데 안에 3개라서
				//System.out.println(i+ "," +j); // 배열 방의 변화
				System.out.printf("nums2[%d][%d] = %d\n",
										i,j,num2[i][j]); 
				
			}
			
		}
		
		//자료형?
		//1. num2 -> int[][] int 2차원 배열
		//2. num2[0][0] -> int
		//3. num2[0] int[] -> int 1차원 배열 (***)
		
		//3차원 배열
		int[][][] num3 = new int[2][2][3]; // 12개, 3중 for문
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<3;k++) {
					num3[i][j][k]=i*j*k;
				}
			}
		}
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<3;k++) {
					System.out.println(num3[i][j][k]);
				}
			}
		}
		
		//1차원 배열에만 사용
		System.out.println(Arrays.toString(num2)); 
		
		
		
	}

	private static void project() {
		//프로젝트 > 학사 관리 시스템 
		// - 회원 > 학생회원 x 1000명 :: 테스트용 데이터, 더미 데이터 
		// - 회원 정보
		// 	  a.이름: 문자열
		//	  b.나이: 숫자
		//	  c.성별: 숫자(1-남자,2-여자)
		//	  d.주소: 문자열
		
		int count = 1000; //인원수 
		
		//회원 저장 저장소(배열 or 컬렉션)
		String[] name = new String[count];
		int[] age = new int[count];
		int[] gender = new int[count];
		String[] address = new String[count];
		
		// 난수화
		// - Math.random()
		
		//기초 데이터 
		String[] n1= {"김","이","박","최","정","한","지","임","유"};
		
		String[] n2 = {"대","은","창","미","준","수","영","우","진","인","재","하","훈","석","동","시"};
		
		String[] a1 = {"서울시","인천시","대전시","광주시","부산시"};
		String[] a2 = {"동대문구","서대문구","중구","남대문구","북구"};
		String[] a3 = {"력삼동","대치동","논현동","양재동","도곡동"};
		
		
		
		
	
		
//		int index = -1;
//		
//		String name2 ="";
//		
//		index = (int)(Math.random()*n1.length); // 0~9 방번호를 벗어나지는 않는 임의의 숫자
//		name2=n1[index];
//		
//		index = (int)(Math.random()*n2.length);
//		name2+=n2[index];
//		index = (int)(Math.random()*n2.length);
//		name2+=n2[index];
//		
//		System.out.println(name2);
		
		for(int i=0;i<count;i++) {
			//이름 
			name[i] = 
					n1[(int)(Math.random() * n1.length)]
					+n2[(int)(Math.random() * n2.length)]
					+n2[(int)(Math.random() * n2.length)]
							;	
			        
			//나이 
			age[i] = (int)(Math.random()*41)+20; // 0~40 -> 20~60
			
			//성별 
			gender[i]=(int)(Math.random()*2)+1; //1~2사이 난수 
			
			//주소
			address[i]=	a1[(int)(Math.random()*a1.length)]+ " "
						+a2[(int)(Math.random()*a2.length)] + " "
						+a3[(int)(Math.random()*a3.length)] + " "
						+((int)(Math.random()*30)+1)+"번지";
		}
		//확인
		for(int i=0;i<count;i++) {
			System.out.printf("%s\t%d\t%s\t%s\n"
									,name[i]
									,age[i]
									,gender[i] == 1 ?"남자":"여자"
									,address[i]);
		}
		
	}
		
	

	private static void m6() {
		//dump() 메소드
		String[] colors = {"빨강","노랑","파랑","검정","보라","주황"};
		
		colors[4]="Black";
		
		//배열 탐색 + 출력 -> 개발자용 
		System.out.println(Arrays.toString(colors)); // dump 덤어쓰워 
		
	}

	private static void m5() {
		
		//배열 초기화 리스트, 배열 초기자
		int[] nums = new int[5];
				//패턴이 없어 
		nums[0]=100;
		nums[1]=80;
		nums[2]=99;
		nums[3]=75;
		nums[4]=91;
		
		int[] nums2 = new int[] {100,80,99,75,91}; //{} 초기화 리스트, 6줄을 한줄로 줄여준것
		for(int num:nums2) {
			System.out.println(num);
		}
		
		String[] names = new String[] {"홍길동","아무개","유재석"};
		
		System.out.println(names[0]);
		
		int[] nums3 = {10,20,30,40,50}; //대괄호를 생략해서 쓸수 있음 *****
		
		int[] nums4;
		nums4 = new int[] {10,20,30}; 
		
		int a;
		a = 10;
		
		//int[] nums5;
		//nums5 = {10,20,30}; //모든 걸 선언 하는 거는 앞에 꺼를 빼먹으면 안돼 
		
	}

	private static void m4() {
		//int num
		//System.out.println(num);
		
		//배열 초기화 , 0도 데이터임 수많은 데이터 중에 하나임 -> 클래스 생성자
		// - 모든 참조형에 해당하는 자료형은 생성된 직 후 변수들이 특정값으로 자동 초기화가 된다.
		//1. 정수 -> 0 
		//2. 실수 -> 0.0
		//3. 문자 -> \0(널문자)
		//4. 논리 -> false
		//5. 참조 -> null(원래 null상태인데 아무것도 안넣어져 있어)
		
		int[] nums = new int[5];
		for(int num:nums) {
			System.out.println(num);
		}
		double[] nums2 = new double[3];
		System.out.println(nums2[0]);
		
		boolean[] flags = new boolean[3];
		System.out.println(flags[0]);
		
		String[] names = new String[3];
		System.out.println(names[0]);
	}

	private static void m3(){
	//배열 탐색
		String[] names = new String[5];
		
		names[0]="홍길동";
		names[1]="아무개";
		names[2]="유재석";
		names[3]="강호동";
		names[4]="신동엽";
		
		//순차 탐색 - 일반 for문(여러가지 제어가 가능)
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		//순차 탐색 - 향상된 for문
		// - for (변수 : 배열) {}
		// - 무조건 0~ 끝방까지 탐색 
		// - 읽기 전용(배열의 요소를 수정할 수 없다.), 읽을 용도 
		
		for(String name :names) {
			System.out.println(name);
			//요소 집합 
		} // 자동으로 돌음
		System.out.println();
		
		//배열 데이터 가공 
		for(int i=0;i<names.length;i++) {
			names[i] +="님";
		}
		System.out.println();
		
		for(String name :names) {
			System.out.println(name);
			//요소 집합 
		} // 자동으로 돌음
		System.out.println();
		
		for(String name :names) {
			name+="씨";
		} 
		System.out.println();
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println();
	}

	private static void m2() {
		// 배열 선언하기
		// - 자료형[] 변수명 = new 자료형[길이]
		
		//int kor; //int
		//int[] kors; //자료형: int[] integer 배열 -> int 1차원 배열입니다.
		
		//int 변수 3개를 연속으로 만들어라
		
		
		int[] kors = new int[300]; // 접근 수단 주소값을 기억하는 변수 하나 kors
		
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		
		//int total =kors[0] + kors[1] + kors[2]; // kor1+kor2+kor3
		int total = 0;
		for(int i=0;i<kors.length;i++) {
			total+=kors[i]; // 누적을 시켜, 프로그래밍 요소로 이용할 수 있어, for문을 자주 써
		}
		
		double avg = (double)total / kors.length; 
		
		
		System.out.printf("총점: %d점, 평균: %.1f점\n",total,avg);
		
		
		
		
		
		
	}

	private static void m1() {
		
		//배열, Array
		// - 같은 자료형의 변수를 줄지어 모아놓은 집합 
		// - 변수(단독주택), 배열(연립주택)
		// - 집합 자료형
		
		// - 참조형 자료형(Reference Type)
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//추가사항]학생 300명
		int kor1;
		int kor2;
		int kor3;
		//+ 297
		kor1=100;
		kor2=90;
		kor3=80;
		//+ 297
		int total = kor1+kor2+kor3; //+kor4+kor5+..+297
		double avg = total / 3.0; 	// 소수이하를 표현하는 실수, 캐스팅도 가능
									//300.0
		
		System.out.printf("총점: %d점, 평균: %.1f점\n",total,avg);
		
		
		
	}
	
	
	
	
	

}
