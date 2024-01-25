/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.freezesmp.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.freezesmp.item.IceShardsItem;
import net.mcreator.freezesmp.FreezeSmpMod;

public class FreezeSmpModItems {
	public static Item ICE_SHARD;

	public static void load() {
		ICE_SHARD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FreezeSmpMod.MODID, "ice_shard"), new IceShardsItem());
	}

	public static void clientLoad() {
	}
}
