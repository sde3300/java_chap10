package java_chap10;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog); // 클래스 타입 변환
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
//	매개변수로 Animal 클래스 타입의 변수를 받는 메서드
//	매개변수에 자식 클래스 타입의 객체를 저장하는 것은 자동 타입 변환이다
	public static void changeDog(Animal animal) {
//		부모 클래스 타입의 변수를 다시 자식 클래스 타입 변수에 저장
//		강제 타입 변환, 원본이 자식 클래스 타입의 객체였을 경우 다시 자식 클래스 타입의 변수에 저장할 수 있음
//		if (animal instanceof Dog) {
//		Dog dog = (Dog)animal;
//		}
		try {
		
		}
		catch (ClassCastException e) {
			
		}
		Dog dog = (Dog)animal;
		System.out.println("정상적으로 타입 변환 완료");
	}
}

//	Animal 클래스 선언
	class Animal{}
	class Dog extends Animal {} //Animal 클래스를 상속받는 Dog 클래스
	class Cat extends Animal {} //Animal 클래스를 상속받는 cat 클래스
