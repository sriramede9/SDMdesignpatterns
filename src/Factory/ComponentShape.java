package Factory;

import java.util.List;

public interface ComponentShape extends Shape{ //these is our component shape like employee now we need composite
	Iterator1 getCompoundshapes();
	
	void draw();
}
