package com.ag.Generate;

import java.io.IOException;

import com.ag.Entity.Entity;

public interface IGenerate<T> {
	public T generate() throws IOException;
}
