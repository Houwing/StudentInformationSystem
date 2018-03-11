import java.sql.*;
import java.util.*;

public class SearchExecute {
	public void Search() {
		Scanner Input=new Scanner(System.in);
	int ChooseNum;
	
	LinkToMysql SerchObj=new LinkToMysql();
	SpeakOut SObj=new SpeakOut();
	
	while(true) {
		SObj.SearchText();
		ChooseNum=Input.nextInt();
		switch(ChooseNum)
		{
		case 1:SerchObj.SearchByName();break;
		case 2:SerchObj.SearchByNumber();break;
		case 3:SerchObj.SearchByClass();break;
		}
		if(ChooseNum==0)
		{
			break;
		}
	}
	}
	
}
