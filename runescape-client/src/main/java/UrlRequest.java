import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2013552201
	)
	static int field1355;
	@ObfuscatedName("s")
	@Export("url")
	final URL url;
	@ObfuscatedName("h")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("w")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 118
	} // L: 119

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-104"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 122
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "49"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 126
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "14"
	)
	public String method2528() {
		return this.url.toString(); // L: 130
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;Lls;Lje;I)Z",
		garbageValue = "1932536931"
	)
	public static boolean method2520(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class273.musicPatchesArchive = var0; // L: 26
		class273.musicSamplesArchive = var1; // L: 27
		class273.soundEffectsArchive = var2; // L: 28
		ItemContainer.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "2101377039"
	)
	public static char method2530(byte var0) {
		int var1 = var0 & 255; // L: 66
		if (var1 == 0) { // L: 67
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 68
				char var2 = class341.cp1252AsciiExtension[var1 - 128]; // L: 69
				if (var2 == 0) { // L: 70
					var2 = '?';
				}

				var1 = var2; // L: 71
			}

			return (char)var1; // L: 73
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-137524219"
	)
	public static boolean method2525() {
		return Client.staffModLevel >= 2; // L: 12221
	}
}
