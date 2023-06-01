import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 246757409
	)
	static int field1409;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 967513831
	)
	static int field1412;
	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	static Widget[] field1414;
	@ObfuscatedName("ay")
	final URL field1410;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1641149811
	)
	volatile int field1411;
	@ObfuscatedName("at")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1409 = -1; // L: 133
		field1412 = -2; // L: 134
	}

	UrlRequest(URL var1) {
		this.field1411 = field1409; // L: 135
		this.field1410 = var1; // L: 139
	} // L: 140

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-108743000"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1411 != field1409; // L: 143
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "86504040"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 147
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-56256868"
	)
	public String method2824() {
		return this.field1410.toString(); // L: 151
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "46"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 2112
		Login.Login_response2 = var1; // L: 2113
		Login.Login_response3 = var2; // L: 2114
	} // L: 2115
}
