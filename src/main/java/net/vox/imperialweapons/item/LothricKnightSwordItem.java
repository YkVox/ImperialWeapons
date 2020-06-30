
package net.vox.imperialweapons.item;

import net.vox.imperialweapons.itemgroup.ImperialWeaponryItemGroup;
import net.vox.imperialweapons.ImperialweaponsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ImperialweaponsModElements.ModElement.Tag
public class LothricKnightSwordItem extends ImperialweaponsModElements.ModElement {
	@ObjectHolder("imperialweapons:lothric_knight_sword")
	public static final Item block = null;
	public LothricKnightSwordItem(ImperialweaponsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ImperialWeaponryItemGroup.tab)) {
		}.setRegistryName("lothric_knight_sword"));
	}
}
