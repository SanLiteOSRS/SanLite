import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class419 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static final class419 field4596;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static final class419 field4592;
	@ObfuscatedName("ar")
	final String field4593;

	static {
		field4596 = new class419("Basic"); // L: 4
		field4592 = new class419("Bearer"); // L: 5
	}

	class419(String var1) {
		this.field4593 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1786685713"
	)
	String method7752() {
		return this.field4593; // L: 13
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lcr;",
		garbageValue = "1237545484"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class387.World_worlds[++World.World_listCount - 1] : null; // L: 253 254
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "18"
	)
	static final int method7756(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 950
		int var4 = var0 & var2 - 1; // L: 951
		int var5 = var1 / var2; // L: 952
		int var6 = var1 & var2 - 1; // L: 953
		int var7 = WorldMapSprite.method5515(var3, var5); // L: 954
		int var8 = WorldMapSprite.method5515(var3 + 1, var5); // L: 955
		int var9 = WorldMapSprite.method5515(var3, var5 + 1); // L: 956
		int var10 = WorldMapSprite.method5515(var3 + 1, var5 + 1); // L: 957
		int var11 = class128.method2982(var7, var8, var4, var2); // L: 958
		int var12 = class128.method2982(var9, var10, var4, var2); // L: 959
		return class128.method2982(var11, var12, var6, var2); // L: 960
	}
}
