import java.sql.Connection;
import java.sql.Statement;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		
		LinkToMysql LTY=new LinkToMysql();//������Ķ���
		SearchExecute SE=new SearchExecute();
		SortExecute SoE=new SortExecute();
		Change CH=new Change();
		SearchScore SS=new SearchScore();
		SearchCount SC=new SearchCount();
		LTY.LoadDrive();
		LTY.LinkToDatabase();//��������
		SpeakOut SO=new SpeakOut();
		Scanner InPut=new Scanner(System.in);//��������
		
		while(true){  //����ѭ��
			SO.Index();
			int scan=InPut.nextInt();
			
			switch(scan)//ѡ�����
			{
			case 1:SE.Search(); break;
			case 2:SoE.Sort();break;
			case 3:CH.ChangeValue();break;
			case 4:SS.SearchScoreExecute();break;
			case 5:SC.SearchExcute();break;
			case 0:System.exit(0);

			}
		}
	}
}
