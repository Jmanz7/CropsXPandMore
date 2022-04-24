package cropsandmore.cropsxp;


import cropsandmore.config.ModConfig;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CropsXP.MOD_ID)
public class CropsXP {


    public static final String MOD_ID = "cropxp";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public CropsXP() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);

        ModLoadingContext.get().registerConfig(Type.COMMON, ModConfig.SPEC, "CropsXP.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupClient(final FMLClientSetupEvent event) {}

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
