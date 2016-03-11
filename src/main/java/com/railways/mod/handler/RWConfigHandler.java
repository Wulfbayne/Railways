package com.railways.mod.handler;

import com.railways.mod.RWGlobal;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class RWConfigHandler {

	public static void RWConfigManger(FMLPreInitializationEvent preEvent){
		
		Configuration config = new Configuration(preEvent.getSuggestedConfigurationFile());
		config.load();		
		
		// Tracks
		RWGlobal.EmpoweredTrackEnabled = config.getBoolean("Empowered Track", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Empowered Track. -- This object is currently under development.");		
		RWGlobal.EnergizedTrackEnabeld = config.getBoolean("Energized Track", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Energized Track. -- This object is currently under development.");
		RWGlobal.EndericTrackEnabled = config.getBoolean("Enderic Track", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Enderic Track. -- This object is currently under development.");
		
		// Carts
		RWGlobal.BeyronCart = config.getBoolean("Beyron Cart", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Beyron Cart. -- This object is NYI.");
		RWGlobal.BeyronFreightCart = config.getBoolean("Beyron Freight Cart", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Beyron Freight Cart. -- This object is NYI.");
		
		config.save();
		
	}
	
}