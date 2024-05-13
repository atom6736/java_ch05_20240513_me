
public class ForTest01me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i; 코딩도 스타일이 있음 과거에는 먼저 선언하고 썼지만 요새는 아래처럼 동시에 선언
		//for i in range(1,11): # 1~10까지 10번 for문이 반복. 몇번 반복시킬 것인지가 중요.
		for(int i=1;i<=10;i=i+1) {   //초, 조, 증 보통 for문에 넣는 변수들은 보통 i,j,k를 많이 사용함.
			System.out.println(i); // i=i+1는 증감식인데, i++로 슬 수 있다.
			
		}
		for(int i=1;i<=100;i++) {   //초, 조, 증 보통 for문에 넣는 변수들은 보통 i,j,k를 많이 사용함.
			System.out.println(i); // i=i+1는 증감식인데, i++로 슬 수 있다.
			//i가 지역변수로 쓰였으므로 위에서와 같은 i를 써도 컴은 다른 것으로 이해한다. 그래도 j라고 다르게 서주는게 좋다.
		}
		
//		for(int i=1;i<=100;i=i+2) {   //초, 조, 증 보통 for문에 넣는 변수들은 보통 i,j,k를 많이 사용함.
//			System.out.println(i); // i=i+1는 증감식인데, i++로 슬 수 있다.
//			//i가 지역변수로 쓰였으므로 위에서와 같은 i를 써도 컴은 다른 것으로 이해한다. 그래도 j라고 다르게 서주는게 좋다.
//		}
//		
		for(int k=100;k>=0;k--) { 
			System.out.println(k); 
			
		}
		//
		int sum = 0; //sum 정수 변수를 선언과 동시에 0으로 초기화
		for(int i=1;i<=100;i++) {
			sum = sum + i;		
			
		}
		System.out.println("sum의 값:" + sum);	
	
		// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오.

		int sum1 = 0; //sum 정수 변수를 선언과 동시에 0으로 초기화
		for(int i=3;i<=100;i=i+3) {
			sum1 = sum1 + i;		
					}
		System.out.println("1~100사이의 3의 배수의 총합 sum1:" + sum1);	

		int sum2 = 0; //sum 정수 변수를 선언과 동시에 0으로 초기화
		for(int i=3;i<=100;i=i++) {
			if (i%3==0) {
				sum2 = sum2 + i;
		}			
		System.out.println("1~100사이의 3의 배수의 총합 sum2 :" + sum2);
					}
	
					
		
	}
}


