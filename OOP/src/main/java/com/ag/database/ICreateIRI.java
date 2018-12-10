package com.ag.database;

import java.io.IOException;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;

public interface ICreateIRI<T> {
	public IRI createIRI(T et) throws IOException;
}
