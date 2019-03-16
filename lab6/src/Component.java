
public interface Component {
	void printDescription();
	void printPackingSlip();
	void addChild(Component c);
	void removeChild(Component c);
	Component getChild(int i);
	
}
