package xyz.ysy520.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 功能：将Data部分信息写入“TEST_BREAKER”表
 * @author yangshengyong
 *
 */
public class DataWriteToTable {
	public static void main(String[] args) {
		//判断e:\breakerdata下是否有文件
		String path = "e:\\breakerdata";
		File dir = new File(path);
		
		//创建目录
		if (!dir.exists()) {
			try {
				dir.mkdirs();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		operateFileFromDir(dir);
	}
	
	//操作来自指定目录的文件
	public static void operateFileFromDir (File dir) {
		File fArr[] = dir.listFiles();
		
		for (int i = 0;i<fArr.length;i++) {
			//将每个文件输出
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
							//到此已将一行数据存入data对象
							System.out.println(data.getType());
							System.out.println(data.getCode());
							System.out.println(data.getDescription());
							System.out.println(data.getNormalOpen());
							System.out.println(data.getEqcontainer());
							System.out.println(data.getBaseVoltage());
							System.out.println(data.getIpAddr());
							
							//接下来操作数据库
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
	
	//根据data操作数据库
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
	
	//全量操作
	public static void operateFull (Data data) {
		
	}
	
	//增量操作
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
