package workout;

public class ConstructorOverloading {
	int length;
	int breadth;
	int height;
	
	ConstructorOverloading(){
		length=0;
		breadth=0;
		height=0;
	}
	ConstructorOverloading(int l,int b,int h){
		length=l;
		breadth=b;
		height=h;
	}
	ConstructorOverloading(int s){
		length=breadth=height=s;
	}
	
	int volume() {
		return length*breadth*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading constructorOverloading=new ConstructorOverloading(5,4,3);
		ConstructorOverloading constructorOverloading1=new ConstructorOverloading(4);
		ConstructorOverloading constructorOverloading2=new ConstructorOverloading();
		
		System.out.println(constructorOverloading.volume());
		System.out.println(constructorOverloading1.volume());
		System.out.println(constructorOverloading2.volume());
	}

}
