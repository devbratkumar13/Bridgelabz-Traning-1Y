import java.util.scanner;
class ConditionStatement{
	public static void main(String args[])
	{
	 scanner input =new Scanner(System.in);	
	 for(int i=0; i<=10; i++){
		 int marks = input.nextint();
		 if(marks <50){
			 System.out.println("Fail!");
		 }else if(marks>=50&&marks<60){
			 System.out.println("Grade D");
		 }else if(marks>=60&&marks<70){
			 System.out.println("Grade C");
		 }else if(marks>=70&&marks<80){
			 System.out.println("Grade B");
		 }else if(marks>=80&&marks<90){
			 System.out.println("Grade A");
		 }else if(marks>=90&&marks<100){
			 System.out.println("Grade O");
		 }else (invalid marks);l
	 }
	 }
	
}