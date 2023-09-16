package com.chimericdream.pannotiacompanion;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PannotiaCompanionModClient implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(ModInfo.MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Hello Fabric client world!");
	}
}