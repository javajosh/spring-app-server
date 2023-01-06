package com.javajosh.springappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.StreamSupport;

@SpringBootApplication
public class SpringAppServerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringAppServerApplication.class, args);
	}

}
