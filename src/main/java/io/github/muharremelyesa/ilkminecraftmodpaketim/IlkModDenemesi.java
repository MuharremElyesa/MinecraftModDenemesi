package io.github.muharremelyesa.ilkminecraftmodpaketim;

import io.github.muharremelyesa.ilkminecraftmodpaketim.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IlkModDenemesi.MODID)
public class IlkModDenemesi {
    public static final String MODID = "totorialmod";

    public IlkModDenemesi(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
