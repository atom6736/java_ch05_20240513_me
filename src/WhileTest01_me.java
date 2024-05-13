
public class WhileTest01_me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;  //보통은 몇번 회전해야 할지 모를때 while문을 씀. 또는 특정한 조건 되면 멈추게.
		while(i<=100) {
			System.out.println(i);
			i++; // i=i+1
			
		}
		
// 만일 for 문으로 만든다면 for(int i=1;i<=100;i++) 이렇게 함.
		
		int j=1;
		while(true) {  // 무한루프
			j++;
			System.out.println(j);
			
			if(j==10000) {
				break;  // 10000이 되면 무한루프를 중단해라 명령.
		
			
			
			}
		for(int k=1;k<=10;k++) { // 1 2 3 5 7 8 10.. 즉 3 6 9인 3의 배수만 빠짐.
			if(k%3==0) {
				continue;
			}
			System.out.println(k); 
		}
		
		}
		
		
	}

}
