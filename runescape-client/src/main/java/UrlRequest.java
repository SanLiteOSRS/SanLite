import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lfp;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("f")
	@Export("url")
	final URL url;
	@ObfuscatedName("o")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("u")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1850686662"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)[B",
		garbageValue = "79"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}
}
