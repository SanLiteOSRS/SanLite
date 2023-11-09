import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-470838788"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "56"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return; // L: 37
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "-269996556"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class127.readStringIntParameters(var1, this.params); // L: 40
		}

	} // L: 42

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "23"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 46
		int var3;
		if (var4 == null) { // L: 48
			var3 = var2; // L: 49
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 52
			if (var5 == null) { // L: 53
				var3 = var2; // L: 54
			} else {
				var3 = var5.integer; // L: 57
			}
		}

		return var3; // L: 59
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-811574533"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class145.method3192(this.params, var1, var2); // L: 63
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-684272439"
	)
	public static long method3871(int var0) {
		if (var0 > 63) { // L: 97
			throw new class367("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0}); // L: 98
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L; // L: 100
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1157186816"
	)
	public static void method3868(boolean var0) {
		if (var0 != ItemComposition.ItemComposition_inMembersWorld) { // L: 575
			TaskHandler.method3475(); // L: 576
			ItemComposition.ItemComposition_inMembersWorld = var0; // L: 577
		}

	} // L: 579

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1409796649"
	)
	static int method3869(int var0, Script var1, boolean var2) {
		return 2; // L: 3074
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	static final void method3853() {
		int var0 = class130.menuX; // L: 9240
		int var1 = ModeWhere.menuY; // L: 9241
		int var2 = class7.menuWidth; // L: 9242
		int var3 = PlayerType.menuHeight; // L: 9243
		int var4 = 6116423; // L: 9244
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 9245
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 9246
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 9247
		class19.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 9248
		int var5 = MouseHandler.MouseHandler_x; // L: 9249
		int var6 = MouseHandler.MouseHandler_y; // L: 9250

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 9251
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 9252
			int var9 = 16777215; // L: 9253
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 9254
				var9 = 16776960;
			}

			class19.fontBold12.draw(TriBool.method7753(var7), var0 + 3, var8, var9, 0); // L: 9255
		}

		class7.method70(class130.menuX, ModeWhere.menuY, class7.menuWidth, PlayerType.menuHeight); // L: 9257
	} // L: 9258
}
