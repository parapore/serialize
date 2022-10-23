package tyokuretuka;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		//Serializeクラスのインスタンス化
		Wish wish = new Wish(new String[] {"5000兆円ほしい", "本当に!"});
		
		//直列化＆テキストファイルに保存
		Serialization serialize = new Serialization();
		File file = serialize.executeSerialise(wish);
		
		//復元
		Restoration restoration = new Restoration();
		wish = restoration.executeRestoration(file);
		
		for(String s : wish.getWishList())
		System.out.println(s);
	}

}
