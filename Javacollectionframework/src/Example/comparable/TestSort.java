package Example.comparable;

class TestSort implements Comparable<TestSort>{
	
	// Data Members
	int rollNo;
	String name;
	int age;
	
	public TestSort(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(TestSort o) {
		if(age==o.age) {
			return 0;
		}else if(age>o.age) {
			return 1;
		}else
			return -1;  // -1 > 0 > 1  // assending order
	}

}