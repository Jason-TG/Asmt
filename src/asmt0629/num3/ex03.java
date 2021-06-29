
package asmt0629.num3;

class Television {
	private String model;

	void setModel(String b) { // 설정자
		model = b;
	}

	String getModel() { // 접근자
		return model;
	} // 값을 리턴받기 위해서는 메서드 이름 앞에 
//	   void 대신 리턴받을 값의 타입을 작성해야합니다.
	
} // Television

class TelevisionTest {
	public static void main(String[] args){
	 Television t = new Television(); 
//	 생성자는 클래스명 뒤에 ()를 붙입니다. 
	 t.setModel("STV-101");
	 String b = t.getModel();
	 }
//	생성한 객체의 메서드를 실행하기 위해서는 메서드 이름 앞에 객체를 지정해야합니다. 

} // TelevisionTest

