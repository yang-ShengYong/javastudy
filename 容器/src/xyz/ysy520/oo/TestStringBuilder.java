package xyz.ysy520.oo;
/**
 * �ɱ��ַ�����
 * StringBuilder �̲߳���ȫ��Ч�ʸ�
 * 		.append()
 * 		.insert()
 * 		.delete()
 * StringBuffer �̰߳�ȫ��Ч�ʵ�
 * @author yangshengyong
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello world");
		
		str.setCharAt(3, 'M'); //����
		str.insert(5, '��').insert(7, '��'); //���룬����ʽ����
		
		System.out.println(str);
		
		StringBuilder str2 = new StringBuilder();
		for(int i=0;i<26;i++) {
			str2.append((char)('a'+i));
		}
		System.out.println(str2);
		str2.delete(15, 23); //ɾ��һ������
		System.out.println(str2.reverse());
	}
}
