public class Strategy{
	int performOperations(int a, int b, Operations strategy) {
		return strategy.doOperation(a, b);
	}
	
}
