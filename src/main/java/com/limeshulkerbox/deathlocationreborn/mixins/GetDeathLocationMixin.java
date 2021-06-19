package com.limeshulkerbox.deathlocationreborn.mixins;

import com.limeshulkerbox.deathlocationreborn.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
abstract class GetDeathLocationMixin {
    @Inject(method = "onDeath", at = @At("HEAD"))
    public void onDeath(DamageSource source, CallbackInfo ci) {

        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        ModInitializer.renderOnClient = true;
        ModInitializer.config.deathMessage = "Death X: " + (int)player.getX() + " Y: " + (int)player.getY() + " Z: " + (int)player.getZ();
    }
}
