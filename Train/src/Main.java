import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args)throws IOException, NumberFormatException, NoSuchElementException{
		File hsrSchedule = new File("HSR.txt");
		File trainSchedule = new File("Train.txt");
		Scanner sc = new Scanner(System.in);
		Scanner hsrReader = new Scanner(hsrSchedule);
		Scanner trainReader = new Scanner(trainSchedule);
		
		System.out.println("Please enter your destination: (Country name)");
		String goal = sc.next();
		System.out.println("Please enter your budget for one ticket: ");
		int budget = sc.nextInt();
		System.out.println("How many ticket do you want?");
		int ticketNum = sc.nextInt();
		
		ArrayList<HSR> hsrList = new ArrayList<HSR>();
		ArrayList<Train> trainList = new ArrayList<Train>();
		
		for(int i = 0; i < 453; i++) {
			int hsrNum = Integer.parseInt(hsrReader.next());
			int departureTime = Integer.parseInt(hsrReader.next());
			int arriveTime = Integer.parseInt(hsrReader.next());
			String destination = hsrReader.next();
			int costTime = Integer.parseInt(hsrReader.next());
			String seatType = hsrReader.next();
			HSR newHSR = new HSR(hsrNum, departureTime, arriveTime, destination, costTime, seatType, ticketNum);
			hsrList.add(newHSR);
		}//新增高鐵物件
		
		for(int i = 0; i < 76; i++) {
			int trainNum = Integer.parseInt(trainReader.next());
			int departureTime = Integer.parseInt(trainReader.next());
			int arriveTime = Integer.parseInt(trainReader.next());
			String destination = trainReader.next();
			int costTime = Integer.parseInt(trainReader.next());
			Train newTrain = new Train(trainNum, departureTime, arriveTime, destination, costTime, ticketNum);
			trainList.add(newTrain);
		}//新增火車物件
		
		ArrayList<HSR> trueDestinationHSR = new ArrayList<HSR>();
		ArrayList<Train> trueDestinationTrain = new ArrayList<Train>();
		ArrayList<HSR> budgetOKHSR = new ArrayList<HSR>();
		ArrayList<Train> budgetOKTrain = new ArrayList<Train>();
		
		//判斷車次的目的地
		for(HSR hsr: hsrList) {
			if(hsr.getDestination().equals(goal)) {
				trueDestinationHSR.add(hsr);
			}
		}
		
		for(Train train: trainList) {
			if(train.getDestination().equals(goal)) {
				trueDestinationTrain.add(train);
			}
		}
		
		
		//從目的地裡撈出預算符合的
		for(HSR hsr: trueDestinationHSR) {
			if(hsr.getPrice(goal, hsr.checkSeats(hsr.getSeatType())) <= budget) {
				budgetOKHSR.add(hsr);
			}
		}
		if(budgetOKHSR.isEmpty()) {
			budgetOKHSR.add(null);
		}
		
		for(Train train: trueDestinationTrain) {
			if(train.getPrice(goal) <= budget) {
				budgetOKTrain.add(train);
			}
		}
		if(budgetOKTrain.isEmpty()){
			budgetOKTrain.add(null);
		}
		
		
		//找出符合預算中最快的
		HSR fastestHSR = budgetOKHSR.get(0);
		Train fastestTrain = budgetOKTrain.get(0);
		
		if(fastestHSR != null && fastestTrain != null) {
			for(HSR hsr: budgetOKHSR) {
				if(hsr.getCostTime() < fastestHSR.getCostTime()) {
					fastestHSR = hsr;
				}
			}
			for(Train train: budgetOKTrain) {
				if(train.getCostTime() < fastestTrain.getCostTime()) {
					fastestTrain = train;
				}
			}
			
			if(fastestTrain.getCostTime() < fastestHSR.getCostTime()) {
				fastestTrain.getSummary();
			}else if(fastestTrain.getCostTime() == fastestHSR.getCostTime()) {
				fastestTrain.getSummary();
				System.out.print("Also, there's a HSR option: ");
				fastestHSR.getSummary();
			}else {
				fastestHSR.getSummary();
			}
			
		}else if(fastestHSR != null && fastestTrain == null) {
			for(HSR hsr: budgetOKHSR) {
				if(hsr.getCostTime() < fastestHSR.getCostTime()) {
					fastestHSR = hsr;
				}
			}
			fastestHSR.getSummary();
		}else if(fastestHSR == null && fastestTrain != null) {
			for(Train train: budgetOKTrain) {
				if(train.getCostTime() < fastestTrain.getCostTime()) {
					fastestTrain = train;
				}
			}
			fastestTrain.getSummary();
		}else if(fastestHSR == null && fastestTrain == null){
			System.out.printf("Sorry, there are no matching options.\nTry increasing your budget.");
		}
		
		hsrReader.close();
		trainReader.close();
		sc.close();
	}
}
