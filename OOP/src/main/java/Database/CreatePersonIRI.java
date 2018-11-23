package Database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

import Entity.*;

public class CreatePersonIRI extends ConnectDB implements ICreateIRI<Person>{

	public CreatePersonIRI() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Person et) {
		// TODO Auto-generated method stub
		AGRepository myRepo = connectDB();
		ValueFactory f = myRepo.getValueFactory();
		
		IRI person = f.createIRI(PERSON.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		Literal position = f.createLiteral(et.getPostion());
		
		AGRepositoryConnection conn = myRepo.getConnection();
		
		conn.add(person, RDF.TYPE, PERSON);
		conn.add(person, LABEL, label);
		conn.add(person, DESCRIPTION, description);
		conn.add(person, TIME_EXTRACTED, time_extracted);
		conn.add(person, LINK, link);
		conn.add(person, POSITION, position);
		
		return person;
	}

}