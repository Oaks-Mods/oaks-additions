package oakbricks.oaks_additions.content.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import oakbricks.oaks_additions.common.OaksAdditions;

import static oakbricks.oaks_additions.common.OaksAdditions.MODID;

public class ModItems {
    public static final Item GLASS_SHARD = new Item(new FabricItemSettings().group(OaksAdditions.ITEM_GROUP).maxCount(16));

    public static final void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "glass_shard"), GLASS_SHARD);
    }
}
