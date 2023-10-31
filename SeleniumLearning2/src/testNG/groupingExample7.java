package testNG;

import org.testng.annotations.Test;

public class groupingExample7 {

	@Test(groups= {"apple"})
	public void apple1(){
		System.out.println("Apple testing");
	}

	@Test(groups= {"apple"})
	public void apple2(){
		System.out.println("Apple2testing");
	}

	@Test(groups= {"redMe"})
	public void redMe1(){
		System.out.println("redMe1 testing");
	}

	@Test(groups= {"redMe"})
	public void redMe2(){
		System.out.println("redMe2 testing");
	}

	@Test(groups= {"realMe"})
	public void vivo1(){
		System.out.println("vivo1 testing");
	}

	@Test(groups= {"realMe"})
	public void vivo2(){
		System.out.println("vivo2 testing");
	}



































































}
