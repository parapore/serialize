package tyokuretuka;

import java.io.Serializable;

/**
 * 直列化可能なクラス
 */
public class Wish implements Serializable{
	private static final long serialVersionUID = 651987625L;
	
	private String[] wishList;
	
	public Wish(String[] wishList) {
		this.wishList = wishList;
	}

	public String[] getWishList() {
		return wishList;
	}
}