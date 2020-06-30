
package net.vox.imperialcreatures.itemgroup;

import net.vox.imperialcreatures.item.LothricKnightSwordItem;
import net.vox.imperialcreatures.ImperialcreaturesModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ImperialcreaturesModElements.ModElement.Tag
public class ImperialWeaponryItemGroup extends ImperialcreaturesModElements.ModElement {
	public ImperialWeaponryItemGroup(ImperialcreaturesModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabimperial_weaponry") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LothricKnightSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
