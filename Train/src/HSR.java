
public class HSR {
	private int price;
	private String seatType;
	private boolean isReservedSeat;
	
	public HSR(int num, int departureTime, int arriveTime, String destination, int costTime, String seatType, int ticketNum){
		super(num, departureTime, arriveTime, destination, costTime, ticketNum);
		this.seatType = seatType;
	}
	
	public int getPrice(String place,boolean isReservedSeats) {
		if(isReservedSeat) {
			switch(place) {
			case "Nangang":
				price = 40;
				break;
			case "Banqiao":
				price = 40;
				break;
			case "Taoyuan":
				price = 160;
				break;
			case "Hsinchu":
				price = 290;
				break;
			case "Miaoli":
				price = 430;
				break;
			case "Taichung":
				price = 700;
				break;
			case "Changhua":
				price = 820;
				break;
			case "Yunlin":
				price = 930;
				break;
			case "Chiayi":
				price = 1080
				break;
			case "Tainan":
				price = 1350;
				break;
			case "Zuoying":
				price = 1490;
				break;
			}
		}else if(!isReservedSeat) {
			switch(place) {
			case "Nangang":
				price = 35;
				break;
			case "Banqiao":
				price = 35;
				break;
			case "Taoyuan":
				price = 155;
				break;
			case "Hsinchu":
				price = 280;
				break;
			case "Miaoli":
				price = 415;
				break;
			case "Taichung":
				price = 675;
				break;
			case "Changhua":
				price = 795;
				break;
			case "Yunlin":
				price = 900;
				break;
			case "Chiayi":
				price = 1045;
				break;
			case "Tainan":
				price = 1305;
				break;
			case "Zuoying":
				price = 1445;
				break;
			}
		}
		return price;
	}
	
	public String getSeatType() {
		return seatType;
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
