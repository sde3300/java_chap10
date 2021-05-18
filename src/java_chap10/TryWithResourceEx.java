package java_chap10;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:\\workplace\\Java602\\resource.txt")) {
			fis.read();
			throw new Exception();
		}
		
		catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
