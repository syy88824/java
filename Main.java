import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException{
		File hsrSchedule = new File("HSR.txt");
		//File trainSchedule = new File("");
		Scanner hsrReader = new Scanner(hsrSchedule);
		//Scanner trainReader = new Scanner(trainSchedule);
		//int tsrCount = 0;
		//int trainCount = 0;
		String content = hsrReader.nextLine();
		System.out.println(content);
		
		/*
		while(hsrReader.hasNextLine()) {
			//用陣列值當成參數、建立n個新高鐵物件
			tsrCount += 1;
		}
		while(trainReader.hasNextLine()) {
			//用陣列值當成參數、建立n個新火車物件
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
		
		*/
	}

}
