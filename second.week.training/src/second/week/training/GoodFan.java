package second.week.training;

public class GoodFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectedMode mode = new SelectedMode();
		High H=new High();
		Medium M=new Medium();
		Low L=new Low();
		Off O = new Off();
		mode.m=M;
		mode.run();
	}
}

class SelectedMode{
	Mode m;
	public void run() {
		System.out.println(m);
	}
}

class Mode{
	
}
class High extends Mode{
	
}
class Medium extends Mode{
	
}
class Low extends Mode{
	
}
class Off extends Mode{
	
}