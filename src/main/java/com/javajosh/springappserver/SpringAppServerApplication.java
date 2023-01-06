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

		// Print out all available environment variables
		Environment springEnv = ctx.getEnvironment();
		TreeMap<String, String> props = new TreeMap<String, String>();
		MutablePropertySources propSrcs = ((AbstractEnvironment) springEnv).getPropertySources();
		StreamSupport.stream(propSrcs.spliterator(), false)
				.filter(ps -> ps instanceof EnumerablePropertySource)
				.map(ps -> ((EnumerablePropertySource<?>) ps).getPropertyNames())
				.flatMap(Arrays::<String>stream)
				.forEach(propName -> props.put(propName, springEnv.getProperty(propName)));

		props.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));

		System.out.println("Your Spring AppServer booted, congrats!");
	}

}
