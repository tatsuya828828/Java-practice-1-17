import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello!");
		} catch(IOException e) {
			// getMessage()で例外的状況のエラー文を取得
			System.out.println("エラー"+e.getMessage());
			// printStackTrace()でスタックトレースの内容を出力
			e.printStackTrace();
		}
	}
}
