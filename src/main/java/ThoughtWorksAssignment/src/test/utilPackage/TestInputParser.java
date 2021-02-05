package test.utilPackage;

import main.data.Talk;
import main.utilPackage.InputParser;

import org.junit.Test;

public class TestInputParser {

	@Test
	public void test() {
		//fail("Not yet implemented");
		InputParser inp = new InputParser();
		Talk t =inp.parseInput("Writing Fast Tests Against Enterprise Rails 60min");
		System.out.println(t.getTitle());
		System.out.println(t.getDuration());
		
		Talk t1 =inp.parseInput("Rails for Python Developers lightning");
		System.out.println(t1.getTitle());
		System.out.println(t1.getDuration());
		
	}

}
