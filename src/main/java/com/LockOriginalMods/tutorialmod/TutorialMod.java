package com.LockOriginalMods.tutorialmod;


import com.LockOriginalMods.tutorialmod.init.BlockInit;
import com.LockOriginalMods.tutorialmod.init.ItemInit;
import com.LockOriginalMods.tutorialmod.list.BlockList;
import com.LockOriginalMods.tutorialmod.list.ItemList;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod("tutorial")
public class TutorialMod
{
    public static final String MOD_ID = "tutorial";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final CreativeModeTab CUSTOMFANTASY_GROUP = new CustomFantasyGroup("customfantasytab");

    public TutorialMod() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);
        BlockList.BLOCKS.register(modEventBus);
        BlockList.NO_ITEM_BLOCK.register(modEventBus);
        ItemList.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }


    public static class CustomFantasyGroup extends CreativeModeTab {

        public CustomFantasyGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {

            return ItemList.NEZERITE.get().getDefaultInstance();
        }

    }

    private void clientSetup(final FMLClientSetupEvent event)
    {

        ItemBlockRenderTypes.setRenderLayer(BlockList.NEZERITE_BUSH.get(), RenderType.cutout());

    }

}



