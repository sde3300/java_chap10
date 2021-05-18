package java_chap10;

public class CatchByExceptionKindEx {

	public static void main(String[] args) {
		try {
//			매개 변수가 없을 경우 ArrayIndexOutOfBoundsException 발생
			String data1 = args[1];
			String data2 = args[2];
//			정상적인 숫자가 아닐 경우 NumberFormatException 발생
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchBy");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
//		다른 오류가 발생할 가능성이 존재하나 정확히 어떠한 오류가 발생할지 모를 경우에 사용
//		Exception 클래스는 예외의 최상위 클래스이기 때문에 Exception을 가장 앞쪽에 입력했을 경우 다른 예외처리가 동작하지 않음
//		Exception 클래스를 사용할 경우 가장 마지막에 입력해야 한다
		catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
//		오류가 있으나 없으나 무조건 실행
		finally {
			System.out.println("다시 실행하세요.");
		}
	}

}

// catch문이 두개, try부분에서 오류 2개가 발생 가능성이 있음, ArrayIndexOutOfBoundsException는 첫번째 catch 실행후 finally로 감, NumberFormatException는 두번째 catch 실행후 finally로 감, 다른 오류가 있을 가능성이 있으면 새로운 catch를 추가
