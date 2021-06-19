package com.limeshulkerbox.deathlocationreborn;

import com.limeshulkerbox.deathlocationreborn.commands.LocationClearCommand;
import com.limeshulkerbox.deathlocationreborn.config.ConfigStructure;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v1.ClientCommandManager;

@Environment(EnvType.CLIENT)
public class ModInitializer implements ClientModInitializer {

    public static ConfigStructure config;
    public static boolean renderOnClient = true;

    @Override
    public void onInitializeClient() {
        AutoConfig.register(ConfigStructure.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(ConfigStructure.class).getConfig();

         ClientCommandManager.DISPATCHER.register(ClientCommandManager.literal("deathlocation")
                 .then(ClientCommandManager.literal("clear")
                        .executes(new LocationClearCommand())));
    }
}