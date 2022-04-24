package cropsandmore.event;


import cropsandmore.config.ModConfig;
import cropsandmore.cropsxp.CropsXP;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber
public class EventHandler {


    @SubscribeEvent
    public static void dropExpFromCrops(BlockEvent.BreakEvent event) {
        Block block = event.getState().getBlock();

        if ((block instanceof CropBlock && ((CropBlock) block).isMaxAge(event.getState()))
                || (block instanceof NetherWartBlock && event.getState().getValue(NetherWartBlock.AGE) == 3)
                || (block instanceof MelonBlock)
                || (block instanceof PumpkinBlock))
            event.setExpToDrop(ModConfig.exp_integer.get());
    }
}