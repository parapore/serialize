package tyokuretuka;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	/**
	 * オブジェクトを直列化する
	 * @param wish
	 * @return File
	 */
	public File executeSerialise(Wish wish) {
		String filePath = "C:/Test/sample.txt";
		File file = new File(filePath);
		FileOutputStream fos;
		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			//テキストファイルにWishクラスインスタンスを保存
			oos.writeObject(wish);
			
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
}
