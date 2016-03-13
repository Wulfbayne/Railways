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
		RWGlobal.EmpoweredTrackEnabled = config.getBoolean("Empowered Track", Configuration.CATEGORY_GENERAL, true, "Enable/Disable the use of Empowered Track. -- This object is experimental.");		
		RWGlobal.EnergizedTrackEnabeld = config.getBoolean("Energized Track", Configuration.CATEGORY_GENERAL, true, "Enable/Disable the use of Energized Track. -- This object is experimental.");
		RWGlobal.EndericTrackEnabled = config.getBoolean("Enderic Track", Configuration.CATEGORY_GENERAL, true, "Enable/Disable the use of Enderic Track. -- This object is experimental.");
		
		// Carts
		RWGlobal.BeyronCartEnabled = config.getBoolean("Beyron Cart", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Beyron Cart. -- This object is NYI.");
		RWGlobal.BeyronFreightCartEnabled = config.getBoolean("Beyron Freight Cart", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Beyron Freight Cart. -- This object is NYI.");
		
		RWGlobal.FabricatorEnabled = config.getBoolean("Fabricator", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Fabricator. -- This object is NYI.");
		RWGlobal.WorkbenchEnabled = config.getBoolean("Workbench", Configuration.CATEGORY_GENERAL, false, "Enable/Disable the use of Workbench. -- This object is NYI.");
		
		config.save();
		
	}
	
}