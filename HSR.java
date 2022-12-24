
public class HSR {
	private int price;
	private boolean isReservedSeat;
	
	
	public int getPrice(String place,boolean isReservedSeats) {
		if(isReservedSeat) {
			switch(place) {
			case "Nangang":
				price = 40;
			case "Banqiao":
				price = 40;
			case "Taoyuan":
				price = 160;
			case "Hsinchu":
				price = 290;
			case "Miaoli":
				price = 430;
			case "Taichung":
				price = 700;
			case "Changhua":
				price = 820;
			case "Yunlin":
				price = 930;
			case "Chiayi":
				price = 1080;
			case "Tainan":
				price = 1350;
			case "Zuoying":
				price = 1490;
			}
			}else if(!isReservedSeat) {
				switch(place) {
				case "Nangang":
					price = 35;
				case "Banqiao":
					price = 35;
				case "Taoyuan":
					price = 155;
				case "Hsinchu":
					price = 280;
				case "Miaoli":
					price = 415;
				case "Taichung":
					price = 675;
				case "Changhua":
					price = 795;
				case "Yunlin":
					price = 900;
				case "Chiayi":
					price = 1045;
				case "Tainan":
					price = 1305;
				case "Zuoying":
					price = 1445;
				
			}
		}
		return price;
	}
	
	public boolean checkSeats(String seatType) {
		
		if(seatType.equals("reservedSeat")) {
			isReservedSeat=true;
		}else if(seatType.equals("nonReservedSeat")){
			isReservedSeat=false;
		}else {
			System.out.println("Please try again.");
		}
	return isReservedSeat;
	}
}
