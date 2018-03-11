import java.util.Scanner;

public class SortExecute {
	LinkToMysql SortObj=new LinkToMysql();
		SpeakOut SObj=new SpeakOut();
		Scanner Input=new Scanner(System.in);
		int ChooseNum;
	public void Sort() {
		while(true) {
			SObj.SortText();
			ChooseNum=Input.nextInt();
			switch(ChooseNum)
			{
			case 1:SortByScore();break;
			case 2:SortObj.SortByTotal();break;
			case 3:SortObj.SortByAverage();break;
			case 4:SortObj.SortByID();break;
			
			}
			if(ChooseNum==0)
			{
				break;
			}
		}
	}
	public void SortByScore()
	{
		while(true) {
			SObj.SortByScoreText();
			ChooseNum=Input.nextInt();
			switch(ChooseNum) {
			case 1:SortObj.SortByChineseScore();break;
			case 2:SortObj.SortByMathScore();break;
			case 3:SortObj.SortByEnglishScore();break;
			}
			if(ChooseNum==0)
			{
				ChooseNum=1;
				break;
			}
		}
	}
}
