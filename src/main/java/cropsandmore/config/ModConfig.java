package cropsandmore.config;

import net.minecraftforge.common.ForgeConfigSpec;


public class ModConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> exp_integer;

    static {

        BUILDER.push("EXP Crop Config");

        exp_integer = BUILDER.comment("Default Value is 1, The Value size can range between 0 to 2147483647").define("Crops XP Amount:", 1);

        BUILDER.pop();
        SPEC =  BUILDER.build();
    }
}
