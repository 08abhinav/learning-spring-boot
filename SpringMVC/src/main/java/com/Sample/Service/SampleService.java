package com.Sample.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Sample.Model.Sample;

@Service
public class SampleService {
	
	List<Sample> samples = Arrays.asList(new Sample(101, "SampleEntry1"), new Sample(102, "SampleEntry2")
			, new Sample(103, "SampleEntry3"));
	
	public List<Sample> getSamples(){
		return samples;
	}
}
