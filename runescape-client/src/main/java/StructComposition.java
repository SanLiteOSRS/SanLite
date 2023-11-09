import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-2027295953"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 37
			if (var2 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class131.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "79"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class184.method3664(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-7306"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 54
		String var3;
		if (var4 == null) { // L: 56
			var3 = var2; // L: 57
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 60
			if (var5 == null) { // L: 61
				var3 = var2; // L: 62
			} else {
				var3 = (String)var5.obj; // L: 65
			}
		}

		return var3; // L: 67
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "432685936"
	)
	static final void method3990(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10183
			if (Client.menuOptionsCount < 500) { // L: 10184
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10185
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10186
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10187
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10188
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10189
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10190
				Client.field663[Client.menuOptionsCount] = var6; // L: 10191
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10192
				++Client.menuOptionsCount; // L: 10193
			}

		}
	} // L: 10195

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IIIILuq;Lmo;I)V",
		garbageValue = "730666598"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12523
		if (var6 > 4225 && var6 < 90000) { // L: 12524
			int var7 = Client.camAngleY & 2047; // L: 12525
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12526
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12527
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12528
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12529
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12530
			int var14 = var5.width / 2 - 25; // L: 12531
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12532
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12533
			byte var17 = 20; // L: 12534
			class1.redHintArrowSprite.method9532(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12535
		} else {
			UserComparator4.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12537
		}

	} // L: 12538
}
