package java_chap10;

public class NullPointerExceptionEx {
	
	   public static void main(String[] args) {
//		   참조변수 사용 시 참조변수에 null이 저장되어 있는 상태에서 해당 변수의 멤버에 접근하려 할 경우 발생
		   try 	{
			String data = null;
			System.out.println(data.toString());
		   }
		   catch(Exception e) {
			System.out.println("오류가 발생했습니다.");  
		   }
	  }
	   
}

