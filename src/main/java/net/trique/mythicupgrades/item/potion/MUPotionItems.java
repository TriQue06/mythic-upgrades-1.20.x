package net.trique.mythicupgrades.item.potion;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import net.trique.mythicupgrades.MythicUpgrades;

import static net.trique.mythicupgrades.item.MUItems.MYTHIC_POTION;
import static net.trique.mythicupgrades.item.MUItems.MYTHIC_LINGERING_POTION;
import static net.trique.mythicupgrades.item.MUItems.MYTHIC_SPLASH_POTION;
import static net.trique.mythicupgrades.item.potion.MUPotions.*;


public class MUPotionItems {
    public static final MythicPotionItem BASE_POTION;
    public static final MythicLingeringPotionItem BASE_LINGERING_POTION;
    public static final MythicSplashPotionItem BASE_SPLASH_POTION;

    public static final MythicPotionItem AQUAMARINE_POTION;
    public static final MythicLingeringPotionItem AQUAMARINE_LINGERING_POTION;
    public static final MythicSplashPotionItem AQUAMARINE_SPLASH_POTION;


    public static final MythicPotionItem PERIDOT_POTION;
    public static final MythicLingeringPotionItem PERIDOT_LINGERING_POTION;
    public static final MythicSplashPotionItem PERIDOT_SPLASH_POTION;


    public static final MythicPotionItem RUBY_POTION;
    public static final MythicLingeringPotionItem RUBY_LINGERING_POTION;
    public static final MythicSplashPotionItem RUBY_SPLASH_POTION;

    public static final MythicPotionItem SAPPHIRE_POTION;
    public static final MythicLingeringPotionItem SAPPHIRE_LINGERING_POTION;
    public static final MythicSplashPotionItem SAPPHIRE_SPLASH_POTION;

    public static final MythicPotionItem TOPAZ_POTION;
    public static final MythicLingeringPotionItem TOPAZ_LINGERING_POTION;
    public static final MythicSplashPotionItem TOPAZ_SPLASH_POTION;

    public static final MythicPotionItem AMETRINE_POTION;
    public static final MythicLingeringPotionItem AMETRINE_LINGERING_POTION;
    public static final MythicSplashPotionItem AMETRINE_SPLASH_POTION;

    public static final MythicPotionItem JADE_POTION;
    public static final MythicLingeringPotionItem JADE_LINGERING_POTION;
    public static final MythicSplashPotionItem JADE_SPLASH_POTION;


    public static void setupMythicPotions() {
        MythicUpgrades.LOGGER.info("Setting up potion items...");
    }

    protected static MythicPotionItem asMythicPotion(Holder<Potion> potionHolder) {
        ItemStack stack = PotionContents.createItemStack(MYTHIC_POTION, potionHolder);
        return (MythicPotionItem) stack.getItem();
    }

    protected static MythicLingeringPotionItem asMythicLingeringPotion(Holder<Potion> potionHolder) {
        ItemStack stack = PotionContents.createItemStack(MYTHIC_LINGERING_POTION, potionHolder);
        return (MythicLingeringPotionItem) stack.getItem();
    }

    protected static MythicSplashPotionItem asMythicSplashPotion(Holder<Potion> potionHolder) {
        ItemStack stack = PotionContents.createItemStack(MYTHIC_SPLASH_POTION, potionHolder);
        return (MythicSplashPotionItem) stack.getItem();
    }

    static {
        BASE_POTION = asMythicPotion(BASE);
        BASE_LINGERING_POTION = asMythicLingeringPotion(BASE);
        BASE_SPLASH_POTION = asMythicSplashPotion(BASE);

        AMETRINE_POTION = asMythicPotion(AMETRINE);
        AMETRINE_LINGERING_POTION = asMythicLingeringPotion(AMETRINE);
        AMETRINE_SPLASH_POTION = asMythicSplashPotion(AMETRINE);

        AQUAMARINE_POTION = asMythicPotion(AQUAMARINE);
        AQUAMARINE_LINGERING_POTION = asMythicLingeringPotion(AQUAMARINE);
        AQUAMARINE_SPLASH_POTION = asMythicSplashPotion(AQUAMARINE);

        JADE_POTION = asMythicPotion(JADE);
        JADE_LINGERING_POTION = asMythicLingeringPotion(JADE);
        JADE_SPLASH_POTION = asMythicSplashPotion(JADE);

        PERIDOT_POTION = asMythicPotion(PERIDOT);
        PERIDOT_LINGERING_POTION = asMythicLingeringPotion(PERIDOT);
        PERIDOT_SPLASH_POTION = asMythicSplashPotion(PERIDOT);

        RUBY_POTION = asMythicPotion(RUBY);
        RUBY_LINGERING_POTION = asMythicLingeringPotion(RUBY);
        RUBY_SPLASH_POTION = asMythicSplashPotion(RUBY);

        SAPPHIRE_POTION = asMythicPotion(SAPPHIRE);
        SAPPHIRE_LINGERING_POTION = asMythicLingeringPotion(SAPPHIRE);
        SAPPHIRE_SPLASH_POTION = asMythicSplashPotion(SAPPHIRE);

        TOPAZ_POTION = asMythicPotion(TOPAZ);
        TOPAZ_LINGERING_POTION = asMythicLingeringPotion(TOPAZ);
        TOPAZ_SPLASH_POTION = asMythicSplashPotion(TOPAZ);
    }
}
