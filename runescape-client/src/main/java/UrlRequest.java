import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = 264051584
	)
	static int field1298;
	@ObfuscatedName("i")
	@Export("url")
	final URL url;
	@ObfuscatedName("w")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("s")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-2"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1773825191"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Lkd;",
		garbageValue = "0"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, WorldMapID.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, WorldMapArea.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "9"
	)
	static final boolean method2446(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
