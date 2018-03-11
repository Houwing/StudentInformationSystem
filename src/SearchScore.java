import java.util.Scanner;

public class SearchScore {
	Scanner Input=new Scanner(System.in);
	int ChooseNum;
	String Subject;
	LinkToMysql SearchScoreObj=new LinkToMysql();
	SpeakOut SObj=new SpeakOut();
	void SearchScoreExecute()
	{
		while(true)
		{
			SObj.SearchScoreText();
		ChooseNum=Input.nextInt();
		switch(ChooseNum)
		{
		case 1:SObj.SearchScoreSecondText();
			Subject=Input.next();
			if(Subject.equals("ChineseScore")||Subject.equals("MathScore")||Subject.equals("EnglishScore"))
				{
					SearchScoreObj.SearchMaxScore(Subject); 
					break;
				}
			else {
				System.out.println("Please Enter a correct feather.");
					break;
			}
		case 2:SObj.SearchScoreSecondText();
		Subject=Input.next();
		if(Subject.equals("ChineseScore")||Subject.equals("MathScore")||Subject.equals("EnglishScore"))//equal≈–∂œ¿®∫≈
			{
				SearchScoreObj.SearchMinScore(Subject); 
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
