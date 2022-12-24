import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException{
		File hsrSchedule = new File("HSR.txt");
		File trainSchedule = new File("train.txt");
		Scanner hsrReader = new Scanner(hsrSchedule);
		Scanner trainReader = new Scanner(trainSchedule);
		int hsrCount = 0;
		int trainCount = 0;
		
		
		
		while(hsrReader.hasNextLine()) {
			boolean found = false;
			if(!found) {
				String[] hsr = hsrReader.nextLine().split(" ");
				int hsrNum = Integer.parseInt(hsr[0]);
				int departureTime = Integer.parseInt(hsr[1]);
				int arriveTime = Integer.parseInt(hsr[2]);
				String destination = hsr[3];
				int costTime = Integer.parseInt(hsr[4]);
				HSR hsr = new HSR(hsrNum, departureTime, arriveTime, destination);
			}
			hsrCount += 1;
		}
		while(trainReader.hasNextLine()) {
			boolean found = false;
			if(!found) {
				String[] train = trainReader.nextLine().split(" ");
				int hsrNum = Integer.parseInt(train[0]);
				int departureTime = Integer.parseInt(train[1]);
				int arriveTime = Integer.parseInt(train[2]);
				String destination = train[3];
				int costTime = Integer.parseInt(train[4]);
				Train hsr = new Train(hsrNum, departureTime, arriveTime, destination);
			}
			trainCount += 1;
		}
		
		ArrayList<HSR> hsrList = new ArrayList<HSR>;
		ArrayList<Train> trainList = new ArrayList<Train>;
		
		for(int i = 0; i < tsrCount; i++) {
			hsrList.add(HSR);
		}
		for(int i = 0; i < trainCount; i++) {
			trainList.add(Train);
		}
		
		
	}
