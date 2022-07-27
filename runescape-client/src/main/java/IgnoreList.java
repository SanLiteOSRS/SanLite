import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -676945199
	)
	static int field4293;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lpa;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 13
		this.loginType = var1; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lnd;",
		garbageValue = "12"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored(); // L: 19
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnd;",
		garbageValue = "-1607059691"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IB)V",
		garbageValue = "-9"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 28
				int var3 = var1.readUnsignedByte(); // L: 29
				boolean var4 = (var3 & 1) == 1; // L: 30
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 31
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 32
				var1.readStringCp1252NullTerminated(); // L: 33
				if (var5 != null && var5.hasCleanName()) { // L: 34
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 35
					if (var4) { // L: 36
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 37
						if (var8 != null && var7 != var8) { // L: 38
							if (var7 != null) { // L: 39
								this.remove(var8); // L: 40
							} else {
								var7 = var8; // L: 43
							}
						}
					}

					if (var7 != null) { // L: 47
						this.changeName(var7, var5, var6); // L: 48
						continue;
					}

					if (this.getSize() < 400) { // L: 50
						int var9 = this.getSize(); // L: 51
						var7 = (Ignored)this.addLast(var5, var6); // L: 52
						var7.id = var9; // L: 53
					}
					continue;
				}

				throw new IllegalStateException(); // L: 56
			}

			return; // L: 57
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1968612284"
	)
	static void method6630() {
		class267.SpriteBuffer_xOffsets = null; // L: 243
		class457.SpriteBuffer_yOffsets = null; // L: 244
		class457.SpriteBuffer_spriteWidths = null; // L: 245
		Decimator.SpriteBuffer_spriteHeights = null; // L: 246
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null; // L: 247
		class436.SpriteBuffer_pixels = null; // L: 248
	} // L: 249

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)Ljava/lang/String;",
		garbageValue = "2090269770"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WallObject.Widget_unpackTargetMask(class67.getWidgetFlags(var0)) == 0) { // L: 12280
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12281 12282 12284
		}
	}
}
