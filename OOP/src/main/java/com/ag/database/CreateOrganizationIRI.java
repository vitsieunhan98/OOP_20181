package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.ag.entity.Organization;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

public class CreateOrganizationIRI extends ConnectDB implements ICreateIRI<Organization>{

	public CreateOrganizationIRI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Organization et, Model model) {
		// TODO Auto-generated method stub
		
		IRI organization = f.createIRI(ORGANIZATION.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		Literal headquarter = f.createLiteral(et.getHeadquarter());
		
		model.add(organization, RDF.TYPE, ORGANIZATION);
		model.add(organization, LABEL, label);
		model.add(organization, DESCRIPTION, description);
		model.add(organization, TIME_EXTRACTED, time_extracted);
		model.add(organization, LINK, link);
		model.add(organization, HEADQUARTER, headquarter);
		
		return organization;
	}

}
