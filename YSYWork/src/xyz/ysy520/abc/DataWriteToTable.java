package xyz.ysy520.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * ���ܣ���Data������Ϣд�롰TEST_BREAKER����
 * @author yangshengyong
 *
 */
public class DataWriteToTable {
	public static void main(String[] args) {
		//�ж�e:\breakerdata���Ƿ����ļ�
		String path = "e:\\breakerdata";
		File dir = new File(path);
		
		//����Ŀ¼
		if (!dir.exists()) {
			try {
				dir.mkdirs();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		operateFileFromDir(dir);
	}
	
	//��������ָ��Ŀ¼���ļ�
	public static void operateFileFromDir (File dir) {
		File fArr[] = dir.listFiles();
		
		for (int i = 0;i<fArr.length;i++) {
			//��ÿ���ļ����
			try {
				BufferedReader bufr = new BufferedReader(
						new InputStreamReader(
								new FileInputStream(fArr[i]), "UTF-8")
						);
				String s = null;
				int index = 1;
				Data data = new Data();
				
				while ((s = bufr.readLine()) != null) {
					if (s.startsWith("#")) {
						String arr[] = s.split("\\s+");
						
						if(index == 1) {
							data.setType(arr[2]);
						} else {
							data.setCode(arr[1]);
							data.setDescription(arr[2]);
							data.setNormalOpen(Integer.parseInt(arr[3]));
							data.setEqcontainer(arr[4]);
							data.setBaseVoltage(arr[5]);
							if (arr.length>6) {
								data.setIpAddr(arr[6]);
							} else {
								data.setIpAddr(null);
							}
							//�����ѽ�һ�����ݴ���data����
							System.out.println(data.getType());
							System.out.println(data.getCode());
							System.out.println(data.getDescription());
							System.out.println(data.getNormalOpen());
							System.out.println(data.getEqcontainer());
							System.out.println(data.getBaseVoltage());
							System.out.println(data.getIpAddr());
							
							//�������������ݿ�
							operateDB(data);
						}
				
						index++;
					}
					
				}
				
				bufr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//����data�������ݿ�
	public static void operateDB (Data data) {
		if (data.getType().equals("FULL")) {
//			System.out.println("full");
			operateFull(data);
		}
		
		if (data.getType().equals("DIFF")) {
//			System.out.println("diff");
			operateDiff (data);
		}
		
		
	}
	
	//ȫ������
	public static void operateFull (Data data) {
		
	}
	
	//��������
	public static void operateDiff (Data data) {
		
	}
}



class Data {
	private String type;
	private String code;
	private String description;
	private int normalOpen;
	private String eqcontainer;
	private String baseVoltage;
	private String ipAddr;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNormalOpen() {
		return normalOpen;
	}
	public void setNormalOpen(int normalOpen) {
		this.normalOpen = normalOpen;
	}
	public String getEqcontainer() {
		return eqcontainer;
	}
	public void setEqcontainer(String eqcontainer) {
		this.eqcontainer = eqcontainer;
	}
	public String getBaseVoltage() {
		return baseVoltage;
	}
	public void setBaseVoltage(String baseVoltage) {
		this.baseVoltage = baseVoltage;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	
}