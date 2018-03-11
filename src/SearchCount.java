import java.util.Scanner;

public class SearchCount {
	Scanner Input=new Scanner(System.in);
	int ChooseNum;
	String Subject;
	LinkToMysql SearchCountObj=new LinkToMysql();
	SpeakOut SObj=new SpeakOut();
	void SearchExcute() 
	{
		while(true)
		{
			SObj.SearchCountText();
			ChooseNum=Input.nextInt();
			switch(ChooseNum)
			{
			case 1:SObj.SearchCountSecondText();
			Subject=Input.next();
			if(Subject.equals("ChineseScore")||Subject.equals("MathScore")||Subject.equals("EnglishScore"))
			{
				SearchCountObj.SearchExcellent(Subject); 
				break;
			}
		else {
			System.out.println("Please Enter a correct feather.");
				break;
		}
			case 2:SObj.SearchCountSecondText();
			Subject=Input.next();
			if(Subject.equals("ChineseScore")||Subject.equals("MathScore")||Subject.equals("EnglishScore"))
			{
				SearchCountObj.SearchBad(Subject); 
				break;
			}
		else {
			System.out.println("Please Enter a correct feather.");
				break;
		}
	}
			if(ChooseNum==0)
				break;
		}
	}
}
