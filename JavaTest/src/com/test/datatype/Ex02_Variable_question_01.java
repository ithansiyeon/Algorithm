package com.test.datatype;

public class Ex02_Variable_question_01 {
	public static void main(String[] args) {

   //문제. 9개 자료형 x 10문장 -> 주변 데이터 검색 -> 자료형 선택 -> 변수 생성 -> 값을 대입 -> 문장으로 출력하기 
   
   //70kg 
   // - 45 ~ 130 double
   // - 70.5 소수이하 범위
   
   System.out.println("-----double-----");
   //double
   //1. 
   double weight;
   weight = 52.5;
   System.out.println("제 몸무게는 "+weight+"kg입니다");
   //System.out.println(weight);
   
   //2.
   double waist_size = 27.2;
   System.out.println("내 허리 사이즈는 "+waist_size+"입니다.");
   
   //3.
   double foot_size = 235.7;
   System.out.println("제 신발 사이즈는 "+foot_size+"입니다.");
   
   //4.
   double circle_area = 3.14*5*5;
   System.out.println("원의 넓이: "+circle_area+"입니다.");
   
   //5.
   double earth_circumference  = 40234000.71435;
   System.out.println("지구의 둘레: "+ earth_circumference+"입니다.");
   
   //6.
   double light_speed  = 299792458.235799;
   System.out.println("빛의 속도: "+light_speed+" m/s 입니다.");
   
   //7.
   double garbage_weight = 246834.123;
   System.out.println("쓰레기 무게: "+garbage_weight+" 톤 입니다.");
   
   //8.
   double tree_height = 24683499.4;
   System.out.println("나무의 높이: "+tree_height+" m 입니다.");
   
   //9.
   double average = (100+31.8+53+29.9+56.3+78)/6;
   System.out.println("과목별 평균: "+average+"점 입니다.\n");
   
   
   System.out.println("-------int-------");
   //int 
   //1.
   int apple = 5;
   System.out.println("제가 가지고 있는 사과는 "+apple+"개 입니다.");
   
   //2.
   int family_member = 4;
   System.out.println("우리 집 가족 구성원은 "+family_member+"명 입니다.");
   
   //3.
   int finger = 10;
   System.out.println("사람의 손가락 개수는 "+finger+"개 입니다.");
   
   //4.
   int guests = 129;
   System.out.println("파티에 초대된 손님들은 "+guests+"명 입니다.");
   
   //5.
   int clothes = 2500;
   System.out.println("옷의 재고가 "+clothes+"개 입니다.");
   
   //6.
   int students = 30;
   System.out.println("학원 학생 수는 "+students+"명 이다.");
   
   //7.
   int books = 70;
   System.out.println("내가 살면서 읽은 책은 총 "+books+"개 입니다.");
   
   //8.
   int max  = 55;
   System.out.println("55,32,10 숫자중 최댓값은 "+max+"이다.");
   
   //9.
   int penalty_points  = -3;
   System.out.println("지각시 벌점:"+penalty_points+"점 이다.\n");
   
   
   System.out.println("------short------");
   //short
   //1.
   short car = 3;
   System.out.println("나는 자동차가 "+car+"대 가지고 있다.");
   
   //2.
   short bottle = 5;
   System.out.println("물병을 "+bottle+"개 정도 샀다.");
   
   //3.
   short cat = 1;
   System.out.println("나는 고양이를 "+cat+"마리 키우고 있다.");
   
   //4.
   short age = 24;
   System.out.println("나는 "+age+"살 이다.");
   
   //5.
   short cookies = 50;
   System.out.println("나는 쿠키 "+cookies+"개 정도 구웠다.");
   
   //6.
   short wrong_number = 3;
   System.out.println("나는 "+wrong_number+"개 틀렸다.");
   
   //7.
   short hours = 8;
   System.out.println("나는 학원에서 "+hours+"시간정도 보낸다.");
   
   //8.
   short employees = 10000;
   System.out.println("올해 상반기 S 전자에서 "+employees+"명 뽑는다.");
   
   //9.
   short travel_country = 5;
   System.out.println("해외를 "+travel_country+"번 가보았다.\n");
   
   
   System.out.println("-------float-------");
   
   //1.
   float height = 161.7f;
   System.out.println("나는 키가 "+height+"cm이다.");
   
   //2.
   float pi = 3.14f;
   System.out.println("원주율은 "+pi+"입니다.");
   
   //3. 
   float face_size = 15.5f;
   System.out.println("제 얼굴 사이즈는 "+face_size+"cm 입니다~! ^^");
   
   //4. 
   float annual_percentage_rate = 3.3f;
   System.out.println("연이율:"+annual_percentage_rate+"이다.");
   
   //5. 
   float math_grade = 90.7f;
   System.out.println("수학점수:"+math_grade+"점 이다.");
   
   //6. 
   float rectangular_volume = 1345.7F;
   System.out.println("직사각형 부피:"+rectangular_volume+"cm^3 이다.");
   
   //7. 
   float hair_length = 106.3F;
   System.out.println("머리카락 길이:"+hair_length+"cm 이다.");
   
   //8. 
   float Avogadro_constant = 60221407600000000000000F;
   System.out.println("아보가드로 수:"+Avogadro_constant+"1/mol이다.");
   
   //9. 
   float square_area = 25.5F;
   System.out.println("직사각형 넓이:"+square_area+"cm^2 이다.\n");
   
   System.out.println("------long------");
   //long   
   //1.
   long money = 200000000L;
   System.out.println("통장 잔고에 "+money+"원 있습니다.");
   
   //2.
   long balance = 50000;
   System.out.println("통장 잔고에 "+balance+"원 있어~");
   
   //3.
   long leg = 4L;
   System.out.println("강아지 다리의 개수는 "+leg+"입니다.");
     
   //4.
   long invitation = 412435L;
   System.out.println("초대장을 "+invitation+"개 보냈다.");
   
   //5.
   long country = 206L;
   System.out.println("전체 국가 수:"+country+"개 입니다.");
   
   //6.
   long stars = 18795349739457L;
   System.out.println("총 별의 개수:"+stars+"개 입니다.");
   
   //7.
   long stones = 194803285533L;
   System.out.println("바닷가에 있는 돌맹이의 개수는 "+stones+"일 입니다.");
   
   //8.
   long bucket_list = 100000L;
   System.out.println("나의 버킷리스트 개수는 "+bucket_list+"개 이다.");
   
   //9.
   long profit = 1800000000L;
   System.out.println("회사 수익:"+profit +"원 입니다.\n");
   
   
   System.out.println("------String------");
   //String
   //1.
   String message = "너 자신을 알아라!";
   System.out.println("소크라테스는 "+message+"는 명언을 남겼다.");
   
   //2.
   String phonenumber = "010-0000-0000";
   System.out.println("내 전화번호는 "+phonenumber+"이다.");
   
   //3.
   String dream = "건물주";
   System.out.println("내 꿈은 "+dream+"가 되는 것이다.");
   
   //4.
   String address = "송파구 오금동 117-5번지";
   System.out.println("내 주소는 "+address+"입니다.");
   
   //5.
   String name = "한시연";
   System.out.println("내 이름은 "+name+"입니다.");
   
   //6.
   String brand = "질스튜어트";
   System.out.println("내가 선호하는 가방 브랜드 이름은 "+brand+"이다.");
   
   //7.
   String gift = "최신형 노트북";
   System.out.println("내가 갖고 싶은 선물은 "+gift+"이다.");
   
   //8.
   String language = "JAVA";
   System.out.println("내가 가장 좋아하는 언어는 "+language+"이다.");
   
   //9.
   String studentnumber = "201621570";
   System.out.println("내 학번은 "+studentnumber+"이다.");
   
   
   System.out.println("-------char-------");
   //char
   //1.
   char bloodtype = 'A';
   System.out.println("나의 혈액형 타입은"+bloodtype+"형입니다.");
   
   //2. 
   char figure  = '♥';
   System.out.println("좋아하는 도형:"+figure+"이다.");
   
   //3.
   char exam = 'A';
   System.out.println("대단하다 "+exam+"받은게~");
   
   //4.
   char week = '일';
   System.out.println("나는 매주"+week+"등산을 간다.");
   
   //5.
   char firstname = '한';
   System.out.println("나의 성은 "+firstname+"입니다.");
   
   //6.
   char gender = '여';
   System.out.println("성별:"+gender);
   
   //7.
   char number = '7';
   System.out.println("1~9 중에 좋아하는 숫자: "+number);
   
   //8.
   char alphabet = 'H';
   System.out.println("가장 좋아하는 알파벳은 "+alphabet+"이다.");
   
   //9.
   char level = '상';
   System.out.println("상,중,하 중 고른 난이도는 "+level+"이다.\n");
   
   System.out.println("-------byte-------");
   //byte
   //1.
   byte coffee = 10;
   System.out.println("나는 오늘 커피를 "+coffee+"개 마셨다.");
   
   //2.
   byte grape = 6;
   System.out.println("혜린아 포도"+grape+"개 사오렴");
   
   //3.
   byte broken = 2;
   System.out.println("고장난 개수가 "+broken+"개 이다.");
   
   //4.
   byte sleeping_hours = 6;
   System.out.println("가장 이상적인 수면 시간은"+sleeping_hours+"시간 이다.");
   
   //5.
   byte minutes = 60;
   System.out.println("1시간은 "+minutes+"분 이다.");

   //6.
   byte boxs = 34;
   System.out.println("남은 박스의 개수는 "+boxs+"개 이다.");
   
   //7.
   byte toes = 10 ;
   System.out.println("사람의 발가락 총개수는 "+toes+"개 입니다.");
   
   //8.
   byte rooms = 4 ;
   System.out.println("저희 집의 방 개수는 "+rooms+"개 입니다.");
   
   //9.
   byte children = 2 ;
   System.out.println("내 자식들은 "+children+"명 입니다.\n");

   System.out.println("--------boolean-------");
   //boolean
   //1.
   boolean problem = true;
   System.out.println("이 명제는 "+problem+"야~!");
   
   //2. 
   boolean truth = false;
   System.out.println("세상은 "+truth+"인 거 같아");
   
   
   //3.
   boolean love = true;
   System.out.println("내 사랑은 "+love+"진실 이야");
   
   //4.
   boolean word = true;
   System.out.println("너가 불러 주면 항상 리턴 "+word+"로 응답할게~");
   
   //5.
   boolean liar = false;
   System.out.println("틀린을 영어로 "+liar+"라고 한다.");
   
   //6.
   boolean result = true;
   System.out.println("이 사건은 "+result+"로 밝혀졌다.");
   
   //7.
   boolean fake = false;
   System.out.println("이 돈은 "+fake+"였다.");
   
   //8.
   boolean correct = true;
   System.out.println("2+3 = 5이 "+correct+"라고 한다.");
   
   //9.
   boolean identification = false;
   System.out.println("이 신분증은 "+identification+"이다.\n");
   
   System.out.println("-------the end-------");

		
		
		
		
		
		
	
	
		
		
		
	}
}
