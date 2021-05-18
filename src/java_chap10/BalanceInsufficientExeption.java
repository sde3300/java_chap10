package java_chap10;

// 	컴파일 오류를 체크하는 사용자 예외를 생성하려면 Exception을 상속받고
//	런타임 오류를 체크하는 사용자 예외를 생성하려면 RuntimeException을 상속받아야 함
public class BalanceInsufficientExeption extends Exception{
//	기본 오류 발생 시 동작하는 예외 처리
	public BalanceInsufficientExeption() {}
//	예외 동작 시 메시지를 받는 예외 처리
	public BalanceInsufficientExeption(String message) {
		super(message);
	}
}
