import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public abstract class class160 extends Node {
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -104164111
	)
	static int field1748;

	class160() {
	} // L: 51

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1810249387"
	)
	abstract void vmethod3497(Buffer var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-75"
	)
	abstract void vmethod3501(ClanChannel var1);

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILnn;IIIII[FI)Lnn;",
		garbageValue = "-1576492439"
	)
	static Widget method3433(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 800
		var8.type = var0; // L: 801
		var8.parentId = var1.id; // L: 802
		var8.childIndex = var2; // L: 803
		var8.isIf3 = true; // L: 804
		var8.xAlignment = var3; // L: 805
		var8.yAlignment = var4; // L: 806
		var8.widthAlignment = var5; // L: 807
		var8.heightAlignment = var6; // L: 808
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 809
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 810
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 811
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 812
		return var8; // L: 813
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1322800179"
	)
	static void method3434() {
		Client.menuOptionsCount = 0; // L: 9260
		Client.isMenuOpen = false; // L: 9261
	} // L: 9262
}
