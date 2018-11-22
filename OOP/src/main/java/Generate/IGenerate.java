package Generate;

import java.io.IOException;

import Entity.Entity;

public interface IGenerate<T> {
	public T generate() throws IOException;
}
