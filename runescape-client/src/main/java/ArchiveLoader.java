import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	static SpritePixels[] field1063;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -161989157
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1196292575
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lnk;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-533040087"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method6660(var1) || this.archive.method6659(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IZB)Ljt;",
		garbageValue = "14"
	)
	public static Frames method2254(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("au")
	public static final int method2248(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var4 * var2; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = var0 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = (var12 - var14) * (0.6666666666666666D - var0) * 6.0D + var14;
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var20 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lew;",
		garbageValue = "-1390229612"
	)
	static class128 method2253(int var0) {
		class128 var1 = (class128)class25.findEnumerated(FileSystem.method3487(), var0); // L: 130
		if (var1 == null) {
			var1 = class128.field1530; // L: 131
		}

		return var1; // L: 132
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmi;II)V",
		garbageValue = "468246736"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3697 == null) { // L: 1237
			throw new RuntimeException(); // L: 1238
		} else {
			if (var0.field3792 == null) { // L: 1240
				var0.field3792 = new int[var0.field3697.length]; // L: 1241
			}

			var0.field3792[var1] = Integer.MAX_VALUE; // L: 1243
		}
	} // L: 1244
}
