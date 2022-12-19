
public class train {
	private String place;
	private int price;
	public int getPrice(String place) {
		switch (place) {
			case "Keelung":
				price = 64;
			case "Taoyuan":
				price = 66;
			case "Hsinchu":
				price = 177;
			case "Miaoli":
				price = 255;
			case "Taichung":
				price = 375;
			case "Changhua":
				price = 415;
			case "Douliou":
				price = 527;
			case "Chiayi":
				price = 598;
			case "Tainan":
				price = 738;
			case "Kaohsiung":
				price = 843;
			case "Yilan":
				price = 218;
			case "Taitung":
				price = 1205;
			case "Hualien":
				price = 440;
		}
		return price;
	}
}
