import java.util.Scanner;

public class Change {
	Scanner Input=new Scanner(System.in);
	int ChooseNum;
	LinkToMysql ChangeObj=new LinkToMysql();
	SpeakOut SObj=new SpeakOut();
	void ChangeValue()
	{
		while(true) {
			SObj.ChangeText();
			ChooseNum=Input.nextInt();
			switch(ChooseNum)
			{
			case 1:Insert();break;
			case 2:Delete();break;
			case 3:Update();break;
			
			
			}
			if(ChooseNum==0)
			{
				break;
			}
		}
	}
	void Insert()
	{
		String ID;//����һ���ַ���
		String Name;
		int Class;//����һ������
		int ChineseScore;
		int MathScore;
		int EnglishScore;
		System.out.println("������ID���������༶");
		ID=Input.next();
		Name=Input.next();
		Class=Input.nextInt();
		System.out.println("���ĳɼ���");
		ChineseScore=Input.nextInt();
		System.out.println("��ѧ�ɼ���");
		MathScore=Input.nextInt();
		System.out.println("Ӣ��ɼ���");
		EnglishScore=Input.nextInt();
		ChangeObj.Insert(ID, Name, Class, ChineseScore, MathScore, EnglishScore);
	}
	void Delete()
	{
		String Num;
		String Name;
		while(true)
		{
			SObj.ChangeDeleteText();
		int ChooseNum=Input.nextInt();
		switch(ChooseNum) {
		case 1:System.out.println("Please enter a name witch you need to delete.");
			Name=Input.next();
		ChangeObj.DeleteByName(Name);
		break;
		case 2:System.out.println("Please enter a StudentNumber witch you need to delete.");
			Num=Input.next();
		ChangeObj.DeleteByID(Num);
		break;
		}
		if(ChooseNum==0)
		{
			break;
		}
		}
	}
	void Update()
	{
		String Name;
		int Score;
		int StudentNumber;
		while(true)
		{
			SObj.ChangeUpdateText();
			int ChooseNum=Input.nextInt();
			switch(ChooseNum)
			{
			case 1:SObj.ChangeUpdateByNameText();
			ChooseNum=Input.nextInt();
			switch(ChooseNum)
			{
			case 1:System.out.println("Please enter a Name witch you need to update his ChineseScore.");
			Name=Input.next();
			System.out.println("Please enter a Score.");
			Score=Input.nextInt();
			ChangeObj.UpdateChineseScoreByName(Name, Score);break;
			case 2:System.out.println("Please enter a Name witch you need to update his MathScore.");
			Name=Input.next();
			System.out.println("Please enter a Score.");
			Score=Input.nextInt();
				ChangeObj.UpdateMathScoreByName(Name, Score);break;
			case 3:System.out.println("Please enter a Name witch you need to update his EnglishScore.");
			Name=Input.next();
			System.out.println("Please enter a Score.");
			Score=Input.nextInt();
			ChangeObj.UpdateEnglishScoreByName(Name, Score);
			}
			break;
			case 2:SObj.ChangeUpdateByStudentNumberText();
			ChooseNum=Input.nextInt();
			switch(ChooseNum)
			{
			case 1:System.out.println("Please enter a StudentNumber witch you need to update his ChineseScore.");
			StudentNumber=Input.nextInt();
			System.out.println("Please enter a Score.");
			Score=Input.nextInt();
			ChangeObj.UpdateChineseScoreByStudentNumber(StudentNumber, Score);break;
			case 2:System.out.println("Please enter a StudentNumber witch you need to update his MathScore.");
			StudentNumber=Input.nextInt();
			System.out.println("Please enter a Score.");
			Score=Input.nextInt();
				ChangeObj.UpdateMathScoreByStudentNumber(StudentNumber, Score);;break;
			case 3:System.out.println("Please enter a StudentNumber witch you need to update his EnglishScore.");
			StudentNumber=Input.nextInt();
			System.out.println("Please enter a Score.");
			Score=Input.nextInt();
			ChangeObj.UpdateEnglishScoreByStudentNumber(StudentNumber, Score);
			}
			break;
			}
			if(ChooseNum==0)
				break;
		}
	}
		
}
