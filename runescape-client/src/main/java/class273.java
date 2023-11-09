import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class273 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1061705243
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1839188705
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1593333275
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([FIFB)F",
		garbageValue = "-14"
	)
	static float method5265(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var2 * var3 + var0[var4]; // L: 110
		}

		return var3; // L: 112
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(S)Lot;",
		garbageValue = "30033"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class344.worldMap; // L: 701
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1459993777"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4599
			byte var2 = 4; // L: 4600
			int var3 = var2 + 6; // L: 4601
			int var4 = var2 + 6; // L: 4602
			int var5 = class149.fontPlain12.lineWidth(var0, 250); // L: 4603
			int var6 = class149.fontPlain12.lineCount(var0, 250) * 13; // L: 4604
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6, 0); // L: 4605
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215); // L: 4606
			class149.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4607
			class16.method214(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2); // L: 4608
			if (var1) { // L: 4609
				class268.rasterProvider.drawFull(0, 0); // L: 4610
			} else {
				class28.method387(var3, var4, var5, var6); // L: 4613
			}

		}
	} // L: 4615
}
