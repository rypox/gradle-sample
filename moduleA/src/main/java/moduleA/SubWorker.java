package moduleA;

public class SubWorker {

	public boolean doIt(final int times) {
		for (int index = 0; index < times; index++) {
			System.out.println("doIt:" + index);
		}
		return true;
	}
}
