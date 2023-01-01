public class Train extends Super{
	private int price;
	
	public Train(int trainNum, int departureTime, int arriveTime, String destination, int costTime, int ticketNum) {
		super(trainNum, departureTime, arriveTime, destination, costTime, ticketNum);
	}
	
	public int getPrice(String destination) {
		switch (destination) {
			case "Keelung":
				price = 64;
				break;
			case "Taoyuan":
				price = 66;
				break;
			case "Hsinchu":
				price = 177;
				break;
			case "Miaoli":
				price = 255;
				break;
			case "Taichung":
				price = 375;
				break;
			case "Changhua":
				price = 415;
				break;
			case "Douliou":
				price = 527;
				break;
			case "Chiayi":
				price = 598;
				break;
			case "Tainan":
				price = 738;
				break;
			case "Kaohsiung":
				price = 843;
				break;
			case "Yilan":
				price = 218;
				break;
			case "Taitung":
				price = 1205;
				break;
			case "Hualien":
				price = 440;
				break;
		}
		return price;
	}
	
	public void getSummary() {
		int total = getPrice(getDestination()) * getTicketNum();
		System.out.printf("The recommended Train number is %d.\nDepart at: %d, Arrive at: %d in %s\n"
				+ "Total time: %d minutes\nTotal ticket fare is $%d",getNum(), getDepartureTime(), getArriveTime(), getDestination(), getCostTime(), total);
	}
}
