package com.ag.Generate;

import java.io.IOException;

import com.ag.Entity.*;

public class GenEvent implements IGenerate<Event>{

	public GenEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Event generate() throws IOException {
		return new Event(new Entity().getRandomId(), new Entity().getRandomDescription(3), new Entity().getRandomSource(), new Event().getRandomLabel());
	}
	
}
