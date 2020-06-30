
package net.vox.imperialweapons.itemgroup;

import net.vox.imperialweapons.item.LothricKnightSwordItem;
import net.vox.imperialweapons.ImperialweaponsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ImperialweaponsModElements.ModElement.Tag
public class ImperialWeaponryItemGroup extends ImperialweaponsModElements.ModElement {
	public ImperialWeaponryItemGroup(ImperialweaponsModElements instance) {
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
