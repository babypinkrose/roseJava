package com.kh.day08.oop.abstractpkg;

class line extends Shape{
	// 4. The type line must implement the inherited abstract method Shape.draw()
	// => 추상메소드 오버라이딩해!! 안할거면 class 앞에 abstract 붙여!! 
	@Override
	public void draw() {
		
	}

}


public abstract class Shape {
	public Shape() {}
	
	public void paint() {}
	abstract public void draw();
	// 1. Abstract methods do not specify a body
	// => {} 없애!
	// 2. The abstract method draw in type shape can only be defined by an abstract class
	// => 추상클래스 아니라서 추상메서드 쓸 수 없음
	// 3. The type Shape must be an abstract class to define abstract methods
	// => class 앞에 abstract 붙여!
	
}
