
public class Super {
	private int num;
	private String departureTime;
	private String arriveTime;
	private String destination;
	private int costTime;
	private int ticketNum;
	
	public Super(int num, String departureTime2, String arriveTime2, String destination, int costTime, int ticketNum) {
		this.num = num;
		this.departureTime = departureTime2;
		this.arriveTime = arriveTime2;
		this.destination = destination;
		this.costTime = costTime;
		this.ticketNum = ticketNum;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getDepartureTime() {
		return departureTime;
	}
	
	public String getArriveTime() {
		return arriveTime;
	}
	
	public int getCostTime() {
		return costTime;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public int getTicketNum() {
		return ticketNum;
	}
}
