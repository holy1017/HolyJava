package holyJava;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeClass gc_ma=new GradeClass();
		
		GradeClass gc_sc=new GradeClass();
		
		gc_ma.setName("����");
		
		gc_sc.setName("����");
		
		GradeClass gc_hi=GradeClass.builder()
				.name("����")
				.score(95)
				.build();
	
		Log(gc_ma.toString());
		Log(gc_sc.toString());
		Log(gc_hi.toString());
		
	}

	private static void Log(String string) {
		System.out.println(string);
	}

}
