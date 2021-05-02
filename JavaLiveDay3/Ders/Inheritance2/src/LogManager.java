
public class LogManager {
	public void log(int LogType) {
		if(LogType == 1) {
			System.out.println("Veri Tabanýna Loglandý");
		}else if(LogType == 2) {
			System.out.println("Dosyaya Loglandý");
		}else {
			System.out.println("Maile Loglandý");
		}
	}

}


// 1-Database
// 2-File
// 3-Mail