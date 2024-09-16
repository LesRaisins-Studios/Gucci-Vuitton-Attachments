package me.xjqsh.gucci;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import com.tacz.guns.api.resource.ResourceManager;

@Mod(AttachmentMod.MOD_ID)
public class AttachmentMod {
    public static final String MOD_ID = "guccivuitton";
    public static final String DEFAULT_PACK_NAME = "gucci_vuitton_attachment";
    public static final Logger LOGGER = LogUtils.getLogger();


    public AttachmentMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        registerDefaultExtraGunPack();
    }

    private static void registerDefaultExtraGunPack() {
        String jarDefaultPackPath = String.format("/assets/%s/custom/%s", MOD_ID, DEFAULT_PACK_NAME);
        ResourceManager.registerExtraGunPack(AttachmentMod.class, jarDefaultPackPath);
    }
}
