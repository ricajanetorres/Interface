public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("You can`t insert another quarter");
	}
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	public void turnCrank () {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldOutState());
	}
public void dispense () {
	System.out.println("No Gumball dispensed");
}
public void refill () {}
	
	public String toString() {
			return "waiting for turn of crank";
		}
	
}

