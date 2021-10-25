package oakbricks.oaks_additions.content.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import oakbricks.oaks_additions.common.OaksAdditions;

import static oakbricks.oaks_additions.common.OaksAdditions.CONFIG;
import static oakbricks.oaks_additions.common.OaksAdditions.MODID;

public class ModBlocks {
    public static final Block GLASS_DOOR = new CustomDoorBlock(FabricBlockSettings.copyOf(Blocks.GLASS));
    public static final Block WINDOWED_OAK_TRAPDOOR = new CustomDoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR));
    public static final Block WINDOWED_OAK_DOOR = new CustomDoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR));

    public static final void registerBlocks() {
        if (CONFIG.glassDoorsAndTrapDoorsEnabled) {
            Registry.register(Registry.BLOCK, new Identifier(MODID, "glass_door"), GLASS_DOOR);
            Registry.register(Registry.ITEM, new Identifier(MODID, "glass_door"), new BlockItem(GLASS_DOOR, new FabricItemSettings().group(OaksAdditions.ITEM_GROUP)));
        }
        if (CONFIG.windowedDoorsAndTrapDoorsEnabled) {
            Registry.register(Registry.BLOCK, new Identifier(MODID, "glass_door"), GLASS_DOOR);
            Registry.register(Registry.ITEM, new Identifier(MODID, "glass_door"), new BlockItem(GLASS_DOOR, new FabricItemSettings().group(OaksAdditions.ITEM_GROUP)));
            Registry.register(Registry.BLOCK, new Identifier(MODID, "windowed_oak_door"), WINDOWED_OAK_DOOR);
            Registry.register(Registry.ITEM, new Identifier(MODID, "windowed_oak_door"), new BlockItem(WINDOWED_OAK_DOOR, new FabricItemSettings().group(OaksAdditions.ITEM_GROUP)));
            Registry.register(Registry.BLOCK, new Identifier(MODID, "windowed_oak_trapdoor"), WINDOWED_OAK_TRAPDOOR);
            Registry.register(Registry.ITEM, new Identifier(MODID, "windowed_oak_trapdoor"), new BlockItem(WINDOWED_OAK_TRAPDOOR, new FabricItemSettings().group(OaksAdditions.ITEM_GROUP)));
        }
    }
}
