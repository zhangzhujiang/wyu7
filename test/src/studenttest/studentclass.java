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
			System.out.println("��λͬѧ�������� : " + name ); 
		}
		public String getAge() {
			System.out.println("��λͬѧ��������: " + age );
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
