import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public abstract class class269 implements class271 {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -119126719
	)
	static int field3033;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -466561369
	)
	protected int field3035;

	@ObfuscatedSignature(
		descriptor = "(Lml;Lnq;I)V"
	)
	protected class269(StudioGame var1, Language var2, int var3) {
		this.field3035 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhm;",
		garbageValue = "-111"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lne;II)V",
		garbageValue = "-690030829"
	)
	static void method5378(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 347
			Login.logoSprite = class368.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 348
		} else if ((var1 & 1073741824) != 0) { // L: 350
			Login.logoSprite = class368.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 351
		} else if ((var1 & 256) != 0) { // L: 353
			Login.logoSprite = class368.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 354
		} else {
			Login.logoSprite = class368.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 357
		}

	} // L: 359

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IILis;I)V",
		garbageValue = "941778768"
	)
	static final void method5379(Player var0, int var1, int var2, class211 var3) {
		int var4 = var0.pathX[0]; // L: 8647
		int var5 = var0.pathY[0]; // L: 8648
		int var6 = var0.transformedSize(); // L: 8649
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8650
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8651
				int var9 = var0.transformedSize(); // L: 8654
				Client.field571.approxDestinationX = var1; // L: 8657
				Client.field571.approxDestinationY = var2; // L: 8658
				Client.field571.approxDestinationSizeX = 1; // L: 8659
				Client.field571.approxDestinationSizeY = 1; // L: 8660
				ApproximateRouteStrategy var10 = Client.field571; // L: 8661
				int var11 = class16.method207(var4, var5, var9, var10, Client.collisionMaps[var0.plane], true, Client.field542, Client.field773); // L: 8663
				if (var11 >= 1) { // L: 8664
					for (int var12 = 0; var12 < var11 - 1; ++var12) { // L: 8665
						var0.method2309(Client.field542[var12], Client.field773[var12], var3);
					}

				}
			}
		}
	} // L: 8666
}
