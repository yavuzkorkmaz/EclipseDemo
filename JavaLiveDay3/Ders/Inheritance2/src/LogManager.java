
public class LogManager {
	public void log(int LogType) {
		if(LogType == 1) {
			System.out.println("Veri Taban�na Logland�");
		}else if(LogType == 2) {
			System.out.println("Dosyaya Logland�");
		}else {
			System.out.println("Maile Logland�");
		}
	}

}


// 1-Database
// 2-File
// 3-Mail