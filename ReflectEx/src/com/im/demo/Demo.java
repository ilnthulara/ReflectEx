package com.im.demo;

import com.im.analyzer.Analyzer;
import com.im.reflect.Boy;
import com.im.reflect.Girl;

public class Demo {
	public static void main(String[] args) {
		Boy obj = new Boy();
		Analyzer.analyze(obj);
	}
}
