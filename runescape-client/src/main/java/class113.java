import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class113 extends UrlRequester {
	@ObfuscatedName("ay")
	final boolean field1439;

	public class113(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1439 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ler;S)V",
		garbageValue = "-23389"
	)
	void vmethod2893(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label139: {
			label131: {
				try {
					label134: {
						var9 = true; // L: 21
						String var3 = var1.field1442.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2894(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1443 = UrlRequest.field1440; // L: 29
								var9 = false;
								break label134;
							}

							var2 = this.method2896(var1); // L: 26
						}

						this.method2876(var2, var1); // L: 32
						var9 = false;
						break label139;
					}
				} catch (IOException var10) { // L: 34
					var1.field1443 = UrlRequest.field1440; // L: 35
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)Ljava/net/URLConnection;",
		garbageValue = "104"
	)
	URLConnection method2894(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1442.openConnection(); // L: 48
		this.method2878(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)Ljava/net/URLConnection;",
		garbageValue = "19"
	)
	URLConnection method2896(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1442.openConnection(); // L: 54
		if (!this.field1439) { // L: 55
			var2.setSSLSocketFactory(class15.method205()); // L: 56
		}

		this.method2878(var2); // L: 58
		return var2; // L: 59
	}
}
