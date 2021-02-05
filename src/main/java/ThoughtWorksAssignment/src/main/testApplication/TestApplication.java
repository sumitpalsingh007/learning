package main.testApplication;

import java.util.List;

import main.data.Talk;
import main.data.Tracks;
import main.processingEngine.TalkProcessor;
import main.utilPackage.InputParser;

public class TestApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TalkProcessor processor = new TalkProcessor();
		InputParser parser = new InputParser();

		System.out.println("                              Welcome to Talk Managment System");
		System.out.println("Talks to be arranged:-");
		System.out.println("");
		System.out.println("Writing Fast Tests Against Enterprise Rails 60min");
		System.out.println("Overdoing it in Python 45min");
		System.out.println("Lua for the Masses 30min");
		System.out.println("Ruby Errors from Mismatched Gem Versions 45min");
		System.out.println("Common Ruby Errors 45min");
		System.out.println("Rails for Python Developers lightning");
		System.out.println("Communicating Over Distance 60min");
		System.out.println("Accounting-Driven Development 45min");
		System.out.println("Woah 30min");
		System.out.println("Sit Down and Write 30min");
		System.out.println("Pair Programming vs Noise 45min");
		System.out.println("Rails Magic 60min");
		System.out.println("Ruby on Rails: Why We Should Move On 60min");
		System.out.println("Clojure Ate Scala (on my project) 45min");
		System.out.println("Programming in the Boondocks of Seattle 30min");
		System.out.println("Ruby vs. Clojure for Back-End Development 30min");
		System.out.println("Ruby on Rails Legacy App Maintenance 60min");
		System.out.println("A World Without HackerNews 30min");
		System.out.println("User Interface CSS in Rails Apps 30min");
		System.out.println("");
		System.out.println("Here are the Tracks:-");

		processor.processTask(parser.parseInput("Writing Fast Tests Against Enterprise Rails 60min"));
		processor.processTask(parser.parseInput("Overdoing it in Python 45min"));
		processor.processTask(parser.parseInput("Lua for the Masses 30min"));
		processor.processTask(parser.parseInput("Ruby Errors from Mismatched Gem Versions 45min"));
		processor.processTask(parser.parseInput("Common Ruby Errors 45min"));
		processor.processTask(parser.parseInput("Rails for Python Developers lightning"));
		processor.processTask(parser.parseInput("Communicating Over Distance 60min"));
		processor.processTask(parser.parseInput("Accounting-Driven Development 45min"));
		processor.processTask(parser.parseInput("Woah 30min"));
		processor.processTask(parser.parseInput("Sit Down and Write 30min"));
		processor.processTask(parser.parseInput("Pair Programming vs Noise 45min"));
		processor.processTask(parser.parseInput("Rails Magic 60min"));
		processor.processTask(parser.parseInput("Ruby on Rails: Why We Should Move On 60min"));
		processor.processTask(parser.parseInput("Clojure Ate Scala (on my project) 45min"));
		processor.processTask(parser.parseInput("Programming in the Boondocks of Seattle 30min"));
		processor.processTask(parser.parseInput("Ruby vs. Clojure for Back-End Development 30min"));
		processor.processTask(parser.parseInput("Ruby on Rails Legacy App Maintenance 60min"));
		processor.processTask(parser.parseInput("A World Without HackerNews 30min"));
		processor.processTask(parser.parseInput("User Interface CSS in Rails Apps 30min"));

		System.out.println("Total no of Tracks--"+processor.getTracks().size());
		List<Tracks> tracksFinal =processor.getTracks();
		int trackNo=1;
		for(Tracks track:tracksFinal){
			List<Talk> talks = track.getTalks();
			System.out.println("                                                  Welcome to Track No--"+trackNo);
			System.out.println("");
			for(Talk talk:talks){
				System.out.println(talk.getTitle());
			}
			trackNo++;
			System.out.println("");
		}
	}

}
