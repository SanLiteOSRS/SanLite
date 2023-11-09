import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "[Lrs;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("f")
	@Export("url")
	final URL url;
	@ObfuscatedName("w")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("v")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 118
	} // L: 119

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1746965864"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 122
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "104"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 126
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "988797098"
	)
	public String method2889() {
		return this.url.toString(); // L: 130
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-122"
	)
	public static void method2891() {
		StructComposition.StructDefinition_cached.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1784154993"
	)
	static void method2899(int var0) {
		Client.oculusOrbState = var0; // L: 13322
	} // L: 13323
}
