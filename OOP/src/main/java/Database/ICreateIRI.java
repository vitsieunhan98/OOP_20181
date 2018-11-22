package Database;

import java.io.IOException;

import org.eclipse.rdf4j.model.IRI;

public interface ICreateIRI<T> {
	public IRI createIRI(T et) throws IOException;
}
