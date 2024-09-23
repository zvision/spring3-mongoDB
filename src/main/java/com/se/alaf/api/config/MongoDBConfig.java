package com.se.alaf.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;

@Configuration
public class MongoDBConfig extends AbstractMongoClientConfiguration {

	@Autowired
	ConfigProperties configProp;

	@Override
	protected String getDatabaseName() {

		return configProp.getConfigValue("spring.data.mongodb.database"); // "posts";
	}

	@Override
	protected void configureClientSettings(MongoClientSettings.Builder builder) {

		String dbUrl = "mongodb://".concat(configProp.getConfigValue("spring.data.mongodb.host")).concat(":")
				.concat(configProp.getConfigValue("spring.data.mongodb.port")); // "mongodb://localhost:27017"
		
		builder.applyConnectionString(new ConnectionString(dbUrl));
	}
}
