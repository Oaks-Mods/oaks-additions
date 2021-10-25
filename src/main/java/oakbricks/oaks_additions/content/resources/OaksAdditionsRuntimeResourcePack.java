package oakbricks.oaks_additions.content.resources;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.devtech.arrp.json.loot.JEntry;
import net.devtech.arrp.json.loot.JLootTable;
import net.devtech.arrp.json.recipe.JIngredient;
import net.devtech.arrp.json.recipe.JIngredients;
import net.devtech.arrp.json.recipe.JRecipe;
import net.devtech.arrp.json.recipe.JResult;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static net.devtech.arrp.api.RuntimeResourcePack.*;
import static net.devtech.arrp.json.loot.JLootTable.*;

public class OaksAdditionsRuntimeResourcePack {
    public static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create("oaks_additions:arrp_data");

    public void init() {
        RESOURCE_PACK.addRecipe(new Identifier("oaks_additions", "shapeless_windowed_oak_door"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(
                                JIngredient.ingredient()
                                        .item(Items.GLASS_PANE)
                        )
                        .add(
                                JIngredient.ingredient()
                                        .item(Items.OAK_DOOR)
                        ),
                JResult.result("oaks_additions:windowed_oak_door")
        ));
        RESOURCE_PACK.addLootTable(id("minecraft:blocks/acacia_fence"),
                loot("minecraft:block")
                        .pool(pool()
                                .rolls(1)
                                .entry(entry()
                                        .type("minecraft:item")
                                        .name("minecraft:diamond"))
                                .condition(predicate("minecraft:survives_explosion")))
        );
        RRPCallback.AFTER_VANILLA.register(deez -> deez.add(RESOURCE_PACK)); // MAKE SURE TO REGISTER YOUR PACK!!!
    }
}
