
package asmt0629.num3;

// (1)
class Point {
	private int x, y;

	public void Point(int x, int y) {
		x = x;
		y = y;
	} // 현재 코드에서는 메서드 안의 지역변수에 똑같은 변수값을 대입하고 있습니다. 
//	  클래스의 멤버변수에 매개변수로 받은 값을 대입하기 위해서는 대입받는 변수를 
//	  this.x, this.y와 같이 작성해야합니다. 
}

// (2)
class MyMath {
	
//	public int getRandom() {
//		return (int) Math.random();
//	}

//	public double getRandom() {
//		return Math.random();
//	}
	
} // 메서드 이름이 중복되었습니다. 
// 같은 이름의 메서드를 오버로딩하기 위해서는 괄호 내의 매개변수를 
// 다르게 작성해야 합니다. 

// (3)
class MyClass {
	private String getName() {
		return "MyClass";
	}

//	public static String getClassName() {
//		return getName();
//	}
} // getClassName() 메서드는 static 함수인 반면 getName메서드는 멤버 함수이며
// 객체 생성 이전에 멤버 함수를 실행할 수 없습니다. 

public class ex05 {

}
