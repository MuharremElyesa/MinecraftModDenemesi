package io.github.muharremelyesa.ilkminecraftmodpaketim.init;

import io.github.muharremelyesa.ilkminecraftmodpaketim.IlkModDenemesi;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IlkModDenemesi.MODID);

    public static final RegistryObject<Item> DENEME_ESYASI = ITEMS.register("deneme_esyasi",
            ()->new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .rarity(Rarity.EPIC)
            ));
}