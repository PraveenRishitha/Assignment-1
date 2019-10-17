class Student{
	int rollno;
	String name,course;
	float fee;
	
		Student(int rollno,String name,String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
		Student(int rollno, String name,String course,float fee){
		this(rollno,name,course);
		this.fee=fee;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}

class TestStudent{
	public static void main(String args[]){
		Student S1=  new Student(111,"ankit","java");
		Student S2=  new Student(112,"sumit","java",6000f);	
		S1.display();
		S2.display();
	}
}		
	
