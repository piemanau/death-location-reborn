package com.limeshulkerbox.deathlocationreborn.commands;

import com.limeshulkerbox.deathlocationreborn.ModInitializer;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;

public final class LocationClearCommand implements Command<FabricClientCommandSource> {
    @Override
    public int run(CommandContext context) {
        ModInitializer.renderOnClient = false;
        return 0;
    }
}
