import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class108 extends UrlRequester {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -1191559168
	)
	static int field1416;
	@ObfuscatedName("z")
	final boolean field1414;

	public class108(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1414 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ldg;I)V",
		garbageValue = "1626777935"
	)
	void vmethod2875(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19

		try {
			String var3 = var1.url.getProtocol(); // L: 21
			if (var3.equals("http")) { // L: 22
				var2 = this.method2877(var1); // L: 23
			} else {
				if (!var3.equals("https")) { // L: 25
					var1.isDone0 = true; // L: 29
					return; // L: 30
				}

				var2 = this.method2876(var1); // L: 26
			}

			this.method2859(var2, var1); // L: 32
		} catch (IOException var7) {
		} finally {
			var1.isDone0 = true; // L: 36
			if (var2 != null) { // L: 37
				if (var2 instanceof HttpURLConnection) { // L: 38
					((HttpURLConnection)var2).disconnect(); // L: 39
				} else if (var2 instanceof HttpsURLConnection) { // L: 41
					((HttpsURLConnection)var2).disconnect(); // L: 42
				}
			}

		}

	} // L: 46

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ldg;I)Ljava/net/URLConnection;",
		garbageValue = "1410297707"
	)
	URLConnection method2877(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 49
		this.method2855(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ldg;I)Ljava/net/URLConnection;",
		garbageValue = "-989705862"
	)
	URLConnection method2876(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 55
		if (!this.field1414) { // L: 56
			var2.setSSLSocketFactory(class15.method190()); // L: 57
		}

		this.method2855(var2); // L: 59
		return var2; // L: 60
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-32"
	)
	public static int method2884(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 87 88 91
			var2 = var2 << 1 | var0 & 1; // L: 89
			var0 >>>= 1; // L: 90
		}

		return var2; // L: 93
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lbw;",
		garbageValue = "-2142388319"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 247
		return TileItem.getNextWorldListWorld(); // L: 248
	}
}
