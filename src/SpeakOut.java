import java.sql.*;
import java.util.Scanner;

public class SpeakOut extends LinkToMysql{
	void Index()
	{
		System.out.println("���ݿ�����5���༶��ÿ���༶��10��ѧ��");
		System.out.println("1.�ؼ��ֲ�ѯ��ѧ������ ��ѧ�š��༶���γ����ƣ�");
		System.out.println("2.���յ��Ƴɼ����ܳɼ���ƽ���ɼ���ѧ������");
		System.out.println("3.ѧ����Ϣ�Ĳ��롢ɾ�����޸�");
		System.out.println("4.��ѯÿ���γ̵���߷֡���ͷּ���Ӧѧ���������༶��ѧ��");
		System.out.println("5.��ѯÿ���༶ĳ�ſγ̵������ʣ�90�ּ����ϣ����������ʣ�����������   ");
		System.out.println("0.�˳�   ");
		System.out.println("��������Ҫ�Ĺ��ܣ�");
	}
	void SearchText()
	{
		System.out.println("��ѡ����Ҫ��ѯ����");
		System.out.println("1.����������ѯ");
		System.out.println("2.����ѧ�Ų�ѯ");
		System.out.println("3.���ݰ༶��ѯ");
		System.out.println("0.�˳�");
	}
	void SortText()
	{
		System.out.println("��ѡ������Ҫ�Ĺ���");
		System.out.println("1.���յ��Ƴɼ�����");
		System.out.println("2.�����ܳɼ�����");
		System.out.println("3.����ƽ���ɼ�����");
		System.out.println("4.����ѧ������");
		System.out.println("0.�˳�");
	}
	void SortByScoreText()
	{
		System.out.println("��ѡ������Ҫ����Ŀ�Ŀ");
		System.out.println("1.���ĳɼ�");
		System.out.println("2.��ѧ�ɼ�");
		System.out.println("3.Ӣ��ɼ�");
		System.out.println("0.�˳�");
	}
	void ChangeText()
	{
		System.out.println("��ѡ������Ҫ�Ĺ���");
		System.out.println("1.����");
		System.out.println("2.ɾ��");
		System.out.println("3.����");
		//System.out.println("4.����ѧ������");
		System.out.println("0.�˳�");
	}
	void ChangeDeleteText()
	{
		System.out.println("��ѡ������Ҫ�Ĺ���");
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
