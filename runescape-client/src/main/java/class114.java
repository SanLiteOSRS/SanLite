import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class114 extends UrlRequester {
	@ObfuscatedName("an")
	final boolean field1461;

	public class114(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1461 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "1625450923"
	)
	void vmethod2837(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label135: {
			label127: {
				try {
					label130: {
						var9 = true; // L: 21
						String var3 = var1.field1469.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2836(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1465 = UrlRequest.field1464; // L: 29
								var9 = false;
								break label130;
							}

							var2 = this.method2844(var1); // L: 26
						}

						this.method2806(var2, var1); // L: 32
						var9 = false;
						break label135;
					}
				} catch (IOException var10) { // L: 34
					var1.field1465 = UrlRequest.field1464; // L: 35
					var9 = false;
					break label127;
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Ljava/net/URLConnection;",
		garbageValue = "-1804346988"
	)
	URLConnection method2836(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1469.openConnection(); // L: 48
		this.method2805(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Ljava/net/URLConnection;",
		garbageValue = "-958310751"
	)
	URLConnection method2844(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1469.openConnection(); // L: 54
		if (!this.field1461) { // L: 55
			if (class15.field68 == null) { // L: 59
				class15.field68 = new class15(); // L: 60
			}

			class15 var4 = class15.field68; // L: 62
			var2.setSSLSocketFactory(var4); // L: 64
		}

		this.method2805(var2); // L: 66
		return var2; // L: 67
	}
}
