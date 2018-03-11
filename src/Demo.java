import java.sql.Connection;
import java.sql.Statement;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		
		LinkToMysql LTY=new LinkToMysql();//创建类的对象
		SearchExecute SE=new SearchExecute();
		SortExecute SoE=new SortExecute();
		Change CH=new Change();
		SearchScore SS=new SearchScore();
		SearchCount SC=new SearchCount();
		LTY.LoadDrive();
		LTY.LinkToDatabase();//加载驱动
		SpeakOut SO=new SpeakOut();
		Scanner InPut=new Scanner(System.in);//创建输入
		
		while(true){  //无限循环
			SO.Index();
			int scan=InPut.nextInt();
			
			switch(scan)//选择语句
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
