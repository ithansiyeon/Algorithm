package com.test.object;

public class Packer {
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;

	
	public void packing(Pencil pencil) {
		String c= pencil.getHardness();
		System.out.printf("포장 전 검수: %s 진하기 연필입니다.\n",c);
		if(c.equals("4B") || c.equals("3B") || c.equals("2B")
				||c.equals("B")||c.equals("HB")
				||c.equals("H")||c.equals("2H")
				||c.equals("3H")||c.equals("4H")) {
			System.out.println("포장을 완료했습니다.");
			pencilCount+=1;
		}
		else {
				System.out.printf("이런 %s 진하기는 취급하지 않습니다.\n",c);
				System.out.println("잘못된 진하기 포장입니다.");
			}
		
	}
	public void packing(Eraser eraser) {
		String c = eraser.getSize();
		System.out.printf("포장 전 검수: %s 사이즈 지우개입니다.\n",c);
		if(c.equals("Large")||c.equals("Medium")
						   ||c.equals("Small")) {
			System.out.println("포장을 완료했습니다.");
			eraserCount+=1;
		}
		else {
			System.out.printf("이런 %s 사이즈는 취급하지 않습니다.\n",c);
			System.out.println("잘못된 사이즈 포장입니다.");
		}
	}
	
	public void packing(BallPointPen ballPointPen) {
		String color = ballPointPen.getColor();
		double thickness = ballPointPen.getThickness();
		System.out.printf("포장 전 검수 : %s 색상 %.1f mm볼펜입니다.\n",color,thickness);
		if(thickness==0.3 || thickness==0.5 || thickness==0.7
				|| thickness==1.0 || thickness==1.5) {
			System.out.println("포장을 완료했습니다.");
			ballPointPenCount+=1;
		}
		else {
			System.out.printf("이런 %.1f mm는 취급하지 않습니다.\n",thickness);
			System.out.println("잘못된 두께 포장입니다.");
		}
	}
	public void packing(Ruler ruler) {
		int length=ruler.getLength();
		String shape = ruler.getShape();
		System.out.printf("%d cm %s입니다.\n",length,shape);
		if((shape.equals("줄자") || shape.equals("운형자")||
				shape.equals("삼각자")) && (length==30 || length==50 || length==100)) {
			System.out.println("포장을 완료했습니다.");
			rulerCount+=1;
		}
		else {
			if(!(shape.equals("줄자") || shape.equals("운형자"))) {
			System.out.printf("이런 %s 모양은 취급하지 않습니다.\n",shape);
			System.out.println("잘못된 모양 포장입니다.");
			}
			else if(!(length==30 || length==50 || length==100)){
				System.out.printf("이런 %dcm 길이는 취급하지 않습니다.\n",length);
				System.out.println("잘못된 길이 포장입니다.");
			}
			else {
				System.out.printf("이런 %s 모양과 %dcm 길이는 취급하지 않습니다.",shape,length);
				System.out.println("잘못된 모양과 길이 포장입니다.");
			}
		}
	}
	public void countPacking(int type) {
		System.out.println("===================");
		System.out.println("     포장 결과");
		System.out.println("===================");
		if(type==0) {
			System.out.printf("연필 %d회\n",pencilCount);
			System.out.printf("지우개 %d회\n",eraserCount);
			System.out.printf("볼펜 %d회\n",ballPointPenCount);
			System.out.printf("자 %d회\n",rulerCount);
			
		}
		else if(type==1) {
			System.out.printf("연필 %d회\n",pencilCount);
		}
		else if(type==2) {
			System.out.printf("지우개 %d회\n",eraserCount);
		}
		else if(type==3) {
			System.out.printf("볼펜 %d회\n",ballPointPenCount);
		}
		else if(type==4) {
			System.out.printf("자 %d회\n",rulerCount);
		}
	}
}
