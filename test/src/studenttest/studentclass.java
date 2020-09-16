package studenttest;

public class studentclass {
	 String name;
	    String age;
	    String classical;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
			System.out.println("这位同学的名字是 : " + name ); 
		}
		public String getAge() {
			System.out.println("这位同学的年龄是: " + age );
			return age;
			
		}
		public void setAge(String age) {
			
			this.age = age;
		
		}
		public String getClassical() {
			return classical;
		}
		public void setClassical(String classical) {
			this.classical = classical;
		}
		  
	    
    
}
