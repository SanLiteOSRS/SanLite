import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1301376859
	)
	static int field1441;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1712855317
	)
	static int field1440;
	@ObfuscatedName("ai")
	final URL field1442;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 680423851
	)
	volatile int field1443;
	@ObfuscatedName("ay")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1441 = -1; // L: 133
		field1440 = -2; // L: 134
	}

	UrlRequest(URL var1) {
		this.field1443 = field1441; // L: 135
		this.field1442 = var1; // L: 139
	} // L: 140

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1693986434"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1443 != field1441; // L: 143
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1110449656"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 147
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "17"
	)
	public String method2912() {
		return this.field1442.toString(); // L: 151
	}
}
