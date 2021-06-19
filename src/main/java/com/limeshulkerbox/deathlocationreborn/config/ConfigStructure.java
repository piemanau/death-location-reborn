package com.limeshulkerbox.deathlocationreborn.config;


import com.limeshulkerbox.deathlocationreborn.enums.WhatCorner;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "deathlocation")
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")
public class ConfigStructure implements ConfigData {

    public boolean messageEnabled = true;

    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    public WhatCorner whatCorner = WhatCorner.TOPR;

    @ConfigEntry.ColorPicker
    public int textColor = 0xFFFFFF;

    public String deathMessage = "";

    public int xOffset = 2;

    public int yOffset = 2;
}