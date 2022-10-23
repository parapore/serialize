package tyokuretuka;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Restoration {
	
	/**
	 * オブジェクトの復元を実行する
	 * @param file
	 * @return Wish
	 */
	public Wish executeRestoration(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Wish wish = null;
		try {
			//ファイルから復元
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			//Wishクラスインスタンスを取り出す
			wish = (Wish) ois.readObject();
			
			ois.close();
			
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return wish;
	}
}
