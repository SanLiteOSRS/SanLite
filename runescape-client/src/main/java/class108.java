import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class108 extends UrlRequester {
	@ObfuscatedName("cm")
	static String field1403;
	@ObfuscatedName("au")
	final boolean field1401;

	public class108(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1401 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)V",
		garbageValue = "16"
	)
	void vmethod2842(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label139: {
			label131: {
				try {
					label134: {
						var9 = true; // L: 21
						String var3 = var1.field1408.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2843(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1405 = UrlRequest.field1406; // L: 29
								var9 = false;
								break label134;
							}

							var2 = this.method2844(var1); // L: 26
						}

						this.method2835(var2, var1); // L: 32
						var9 = false;
						break label139;
					}
				} catch (IOException var10) { // L: 34
					var1.field1405 = UrlRequest.field1406; // L: 35
					var9 = false;
					break label131;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return; // L: 30
			}

			if (var2 != null && var2 instanceof HttpURLConnection) { // L: 38 39
				var12 = (HttpURLConnection)var2; // L: 40
				var12.disconnect(); // L: 41
			}

			return; // L: 45
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)Ljava/net/URLConnection;",
		garbageValue = "106"
	)
	URLConnection method2843(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1408.openConnection(); // L: 48
		this.method2832(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)Ljava/net/URLConnection;",
		garbageValue = "241059257"
	)
	URLConnection method2844(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1408.openConnection(); // L: 54
		if (!this.field1401) { // L: 55
			if (class15.field83 == null) { // L: 59
				class15.field83 = new class15(); // L: 60
			}

			class15 var4 = class15.field83; // L: 62
			var2.setSSLSocketFactory(var4); // L: 64
		}

		this.method2832(var2); // L: 66
		return var2; // L: 67
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "2127722280"
	)
	public static Object method2853(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 16
		}
	}
}
