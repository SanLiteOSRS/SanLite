import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class114 extends UrlRequester {
	@ObfuscatedName("ar")
	final boolean field1444;

	public class114(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1444 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "407769226"
	)
	void vmethod2913(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label139: {
			label131: {
				try {
					label134: {
						var9 = true; // L: 21
						String var3 = var1.field1447.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2914(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1448 = UrlRequest.field1445; // L: 29
								var9 = false;
								break label134;
							}

							var2 = this.method2912(var1); // L: 26
						}

						this.method2897(var2, var1); // L: 32
						var9 = false;
						break label139;
					}
				} catch (IOException var10) { // L: 34
					var1.field1448 = UrlRequest.field1445; // L: 35
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Ljava/net/URLConnection;",
		garbageValue = "-1402377989"
	)
	URLConnection method2914(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1447.openConnection(); // L: 48
		this.method2908(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)Ljava/net/URLConnection;",
		garbageValue = "1"
	)
	URLConnection method2912(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1447.openConnection(); // L: 54
		if (!this.field1444) { // L: 55
			var2.setSSLSocketFactory(class15.method167()); // L: 56
		}

		this.method2908(var2); // L: 58
		return var2; // L: 59
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-80"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1901
		Login.Login_response2 = var1; // L: 1902
		Login.Login_response3 = var2; // L: 1903
	} // L: 1904
}
