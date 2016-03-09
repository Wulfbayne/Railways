package com.railways.mod.handler;

import com.railways.mod.RWGlobal;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class RWConfigHandler {

	public static void RWConfigManger(FMLPreInitializationEvent preEvent){
		
		Configuration config = new Configuration(preEvent.getSuggestedConfigurationFile());
		config.load();		
		
		RWGlobal.EmpoweredTrackEnabled = config.getBoolean("Empowered Track", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Empowered Track. -- This object is currently under development.");		
		RWGlobal.EnergizedTrackEnabeld = config.getBoolean("Energized Track", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Energized Track. -- This object is currently under development.");
		RWGlobal.OreCrusherEnabled = config.getBoolean("Ore Crusher", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of the Ore Crusher. -- This object is currently under development.");
			
		config.save();
		
	}
	
}
