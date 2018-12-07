package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenEvent implements IGenerate<Event>{

	public GenEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Event generate() throws IOException {
		Event et = new Event();
		return new Event(et.getRandomId(), et.getRandomDescription(3), et.getRandomSource(), et.getRandomLabel());
	}
	
}
