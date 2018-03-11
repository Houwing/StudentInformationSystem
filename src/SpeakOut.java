import java.sql.*;
import java.util.Scanner;

public class SpeakOut extends LinkToMysql{
	void Index()
	{
		System.out.println("数据库内有5个班级，每个班级有10名学生");
		System.out.println("1.关键字查询（学生姓名 、学号、班级、课程名称）");
		System.out.println("2.按照单科成绩、总成绩、平均成绩、学号排序");
		System.out.println("3.学生信息的插入、删除和修改");
		System.out.println("4.查询每个课程的最高分、最低分及相应学生姓名、班级和学号");
		System.out.println("5.查询每个班级某门课程的优秀率（90分及以上）、不及格率，并进行排序。   ");
		System.out.println("0.退出   ");
		System.out.println("请输入你要的功能：");
	}
	void SearchText()
	{
		System.out.println("请选择你要查询内容");
		System.out.println("1.根据姓名查询");
		System.out.println("2.根据学号查询");
		System.out.println("3.根据班级查询");
		System.out.println("0.退出");
	}
	void SortText()
	{
		System.out.println("请选择你需要的功能");
		System.out.println("1.按照单科成绩排序");
		System.out.println("2.按照总成绩排序");
		System.out.println("3.按照平均成绩排序");
		System.out.println("4.按照学号排序");
		System.out.println("0.退出");
	}
	void SortByScoreText()
	{
		System.out.println("请选择你需要排序的科目");
		System.out.println("1.语文成绩");
		System.out.println("2.数学成绩");
		System.out.println("3.英语成绩");
		System.out.println("0.退出");
	}
	void ChangeText()
	{
		System.out.println("请选择你需要的功能");
		System.out.println("1.插入");
		System.out.println("2.删除");
		System.out.println("3.更新");
		//System.out.println("4.按照学号排序");
		System.out.println("0.退出");
	}
	void ChangeDeleteText()
	{
		System.out.println("请选择你需要的功能");
		System.out.println("1.delete by Name");
		System.out.println("2.delete by StudentNumber");
		System.out.println("0.exit");
	}
	void ChangeUpdateText()
	{
		System.out.println("Please choose feature you need.");
		System.out.println("1.Update by Name");
		System.out.println("2.Update by StudentNumber");
		System.out.println("0.exit");
	}
	void ChangeUpdateByNameText()
	{
		System.out.println("Please choose feature you need.");
		System.out.println("1.Update ChineseScore");
		System.out.println("2.Update MathScore");
		System.out.println("3.Update EnglishScore");
		System.out.println("0.exit");
	}
	void ChangeUpdateByStudentNumberText()
	{
		System.out.println("Please choose feature you need.");
		System.out.println("1.Update ChineseScore");
		System.out.println("2.Update MathScore");
		System.out.println("3.Update EnglishScore");
		System.out.println("0.exit");
	}
	void SearchScoreText()
	{
		System.out.println("Please choose feature you need.");
		System.out.println("1.Search max Score");
		System.out.println("2.Search min Score");
		System.out.println("0.exit");
	}
	void SearchScoreSecondText()
	{
		System.out.println("Please enter witch subject you want to search.");
		System.out.println("ChineseScore,MathScore,EnglishScore");
		System.out.println("Enter '#' exit.");
	}
	void SearchCountText()
	{
		System.out.println("Please choose feature you need.");
		System.out.println("1.Search excellent");
		System.out.println("2.Search Bad");
		System.out.println("0.exit");
	}
	void SearchCountSecondText()
	{
		System.out.println("Please enter witch subject you want to search.");
		System.out.println("ChineseScore,MathScore,EnglishScore");
		System.out.println("Enter '#' exit.");
	}
	
	
	
}
