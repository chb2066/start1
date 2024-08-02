//기본 사칙연산 및 형 변환, 문자열, 입출력 정리
import java.util.*;

public class st1 {
	public static void main(String[] args ) {
		
		 Scanner input=new Scanner(System.in);//Scanner 생성
		int a=input.nextInt();//next는 string이 기본형, 뒤에 Int, Long, Float 등 형을 붙여 
		float b=input.nextFloat();		
		int c=(int)b;//형 변환		
		System.out.println("사칙연산");//ln은 줄바꿈, print 단독은 줄 유지, f는 여러 형태를 출력 가능
		System.out.printf("%d\n%d\n%d\n%d\n%f\n%d\n",a+c,a-c, a*c, a/c, a/b, a%c);//합, 차, 곱, 몫, 나누기, 나머지 출력
		double d=(double)b;//double로 형 변환		
		System.out.println("형 변환 후 나누기");
		System.out.println(a/d);//float에서 double로 변경 후 출력
		System.out.println("문자열 출력");
		String s=input.next();
		System.out.println(s);//출력
		System.out.println(s+"를(을) 입력하셨습니다. ");//문자열 이어서 출력->+를 통해 가능
		input.close();//메모리 해제
		
	}
	
	
}
