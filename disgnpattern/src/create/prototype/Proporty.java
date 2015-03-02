package prototype;

import java.io.IOException;

public interface Proporty {

	Proporty deepClone() throws IOException, ClassNotFoundException;

	Proporty clone();

	void say();
}
