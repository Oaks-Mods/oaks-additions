package oakbricks.oaks_additions.common.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import oakbricks.oaks_additions.common.OaksAdditions;

@Config(name = OaksAdditions.MODID + "_config")
public class OaksAdditionsConfig implements ConfigData {
    public boolean mainMenuButtonEnabled = true;
    public boolean woodenAndStoneArmorEnabled = true;
    public boolean glassDoorsAndTrapDoorsEnabled = true;
    public boolean windowedDoorsAndTrapDoorsEnabled = true;
    public boolean copperArmorEnabled = true;
    public boolean copperToolsEnabled = true;
    public boolean moreDoorsEnabled = true;
}
