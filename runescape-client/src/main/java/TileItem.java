import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Low;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Low;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -52258563
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -438803775
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Lgv;",
		garbageValue = "1835906978"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class23.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "936749737"
	)
	static int method2266(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
