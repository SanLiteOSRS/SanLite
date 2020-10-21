import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("h")
	static boolean field1986;
	@ObfuscatedName("z")
	@Export("url")
	final URL url;
	@ObfuscatedName("k")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("s")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1064227353"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)[B",
		garbageValue = "524450632"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}
}
