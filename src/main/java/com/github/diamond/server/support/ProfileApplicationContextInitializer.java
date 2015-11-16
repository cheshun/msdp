package com.github.diamond.server.support;

import com.github.diamond.server.utils.EnvUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @author libinsong1204@gmail.com
 *
 */
public class ProfileApplicationContextInitializer implements
		ApplicationContextInitializer<ConfigurableApplicationContext> {

	private static final Logger _logger = LoggerFactory.getLogger(ProfileApplicationContextInitializer.class);

	public void initialize(ConfigurableApplicationContext applicationContext) {
		String profile = EnvUtil.getSpringProfile();
		applicationContext.getEnvironment().setActiveProfiles(profile.split(","));
		_logger.info("Active spring profile: {}", profile);
	}

}