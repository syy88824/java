
public class Super {
	private int num;
	private int departureTime;
	private int arriveTime;
	private String destination;
	private int costTime;
	private int ticketNum;
	
	public Super(int num, int departureTime, int arriveTime, String destination, int costTime, int ticketNum) {
		this.num = num;
		this.departureTime = departureTime;
		this.arriveTime = arriveTime;
		this.destination = destination;
		this.costTime = costTime;
		this.ticketNum = ticketNum;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDepartureTime() {
		return departureTime;
	}
	
	public int getArriveTime() {
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
