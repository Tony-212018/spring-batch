package com.dataextractor.config;

import java.util.Collections;
import java.util.List;

import org.springframework.batch.item.file.transform.AbstractLineTokenizer;

public class SingleLineTokenizer extends AbstractLineTokenizer {

	

	@Override
	protected List<String> doTokenize(String line) {
		// TODO Auto-generated method stub
		return Collections.singletonList(line);
	}

}
