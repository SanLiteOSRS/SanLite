import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class239 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 144345413
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILmt;IIIII[FB)Lmt;",
		garbageValue = "-37"
	)
	static Widget method4787(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 838
		var8.type = var0; // L: 839
		var8.parentId = var1.id; // L: 840
		var8.childIndex = var2; // L: 841
		var8.isIf3 = true; // L: 842
		var8.xAlignment = var3; // L: 843
		var8.yAlignment = var4; // L: 844
		var8.widthAlignment = var5; // L: 845
		var8.heightAlignment = var6; // L: 846
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 847
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 848
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 849
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 850
		return var8; // L: 851
	}
}
