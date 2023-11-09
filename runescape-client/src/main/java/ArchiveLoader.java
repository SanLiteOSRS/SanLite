import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 149147227
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 907880421
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1364636276"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5722(var1) || this.archive.method5719(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CLlv;B)I",
		garbageValue = "37"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "973373705"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10319

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10320
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10321
		}

		if (var1.length() > 9) { // L: 10323
			return " " + Clock.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + Clock.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + Clock.colorStartTag(16776960) + var1 + "</col>"; // L: 10324 10325
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIILqn;Lkl;B)V",
		garbageValue = "62"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11925
		if (var6 > 4225 && var6 < 90000) { // L: 11926
			int var7 = Client.camAngleY & 2047; // L: 11927
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11928
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11929
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11930
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11931
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11932
			int var14 = var5.width / 2 - 25; // L: 11933
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11934
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11935
			byte var17 = 20; // L: 11936
			MouseRecorder.redHintArrowSprite.method8093(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11937
		} else {
			SecureRandomCallable.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11939
		}

	} // L: 11940
}
