package com.ag.generate;

import java.io.IOException;

import com.ag.entity.Entity;

public interface IGenerate<T> {
	public T generate() throws IOException;
}
