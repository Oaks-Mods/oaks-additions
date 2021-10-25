package oakbricks.oaks_additions.common;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import oakbricks.oaks_additions.content.blocks.ModBlocks;
import oakbricks.oaks_additions.common.config.OaksAdditionsConfig;
import oakbricks.oaks_additions.content.items.ModItems;
import oakbricks.oaks_additions.content.resources.OaksAdditionsRuntimeResourcePack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OaksAdditions implements ModInitializer {
    public static final String MODID = "oaks_additions";
    public static final OaksAdditionsConfig CONFIG = AutoConfig.register(OaksAdditionsConfig.class, GsonConfigSerializer::new).getConfig();
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("tutorial", "general"),
            () -> new ItemStack(ModItems.GLASS_SHARD));
    public static final Logger LOGGER = LogManager.getLogger("Oaks Additions");
    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        LOGGER.info("Mod loaded!");
        new OaksAdditionsRuntimeResourcePack().init();
    }
}
