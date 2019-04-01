package dailyHomeWork;

import org.testng.annotations.Test;

public class DailyHomeWork {
	
	//To learn testNG attribute depends on method
	
	@Test
	public void a() {
		System.out.println("A");
	}
	
	@Test(dependsOnMethods="c")
	public void b() {
		System.out.println("b");
	}
	
	@Test(dependsOnMethods="a")
	public void c() {
		System.out.println("c");
	}
	
	@Test
	public void d() {
		System.out.println("d");
	}

}
