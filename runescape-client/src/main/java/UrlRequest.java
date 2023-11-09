import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -912482897
	)
	static int field1435;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1301970509
	)
	static int field1441;
	@ObfuscatedName("aw")
	final URL field1436;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 872753895
	)
	volatile int field1437;
	@ObfuscatedName("as")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1435 = -1; // L: 133
		field1441 = -2; // L: 134
	}

	UrlRequest(URL var1) {
		this.field1437 = field1435; // L: 135
		this.field1436 = var1; // L: 139
	} // L: 140

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1097483800"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1437 != field1435; // L: 143
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "114961803"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 147
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1911821505"
	)
	public String method2839() {
		return this.field1436.toString(); // L: 151
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "12"
	)
	public static int method2837(int var0) {
		--var0; // L: 63
		var0 |= var0 >>> 1; // L: 64
		var0 |= var0 >>> 2; // L: 65
		var0 |= var0 >>> 4; // L: 66
		var0 |= var0 >>> 8; // L: 67
		var0 |= var0 >>> 16; // L: 68
		return var0 + 1; // L: 69
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "80"
	)
	static String method2850(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12748
		if (Client.gameBuild == 1) { // L: 12749
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12750
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12751
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12752
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12753
			var0 = "local";
		}

		String var3 = ""; // L: 12754
		if (class36.field263 != null) { // L: 12755
			var3 = "/p=" + class36.field263;
		}

		String var4 = "runescape.com"; // L: 12756
		return var2 + var0 + "." + var4 + "/l=" + Interpreter.clientLanguage + "/a=" + PcmPlayer.field299 + var3 + "/"; // L: 12757
	}
}
