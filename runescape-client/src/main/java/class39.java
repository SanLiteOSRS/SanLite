import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class39 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lah;"
	)
	static final class39 field279;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lah;"
	)
	static final class39 field280;
	@ObfuscatedName("g")
	static int[][] field282;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lds;"
	)
	@Export("soundCache")
	static SoundCache soundCache;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -812273923
	)
	@Export("value")
	final int value;

	static {
		field279 = new class39(0);
		field280 = new class39(1);
	}

	class39(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([BB)Lat;",
		garbageValue = "87"
	)
	static WorldMapSprite method613(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(MouseHandler.convertJpgToSprite(var0).pixels);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "91"
	)
	public static boolean method614(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "488436516"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
