import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class113 extends UrlRequester {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2047133239
	)
	static int field1452;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -674991707
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ac")
	final boolean field1451;

	public class113(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1451 = var1;
	} // L: 15

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Let;B)V",
		garbageValue = "-114"
	)
	void vmethod2839(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		label130: {
			HttpURLConnection var12;
			label131: {
				try {
					var9 = true; // L: 21
					String var3 = var1.field1453.getProtocol(); // L: 22
					if (var3.equals("http")) {
						var2 = this.method2835(var1); // L: 23
					} else {
						if (!var3.equals("https")) { // L: 25
							var1.field1456 = UrlRequest.field1455; // L: 29
							var9 = false;
							break label130;
						}

						var2 = this.method2836(var1); // L: 26
					}

					this.method2812(var2, var1); // L: 32
					var9 = false;
					break label131;
				} catch (IOException var10) { // L: 34
					var1.field1456 = UrlRequest.field1455; // L: 35
					var9 = false;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
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

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			HttpURLConnection var4 = (HttpURLConnection)var2;
			var4.disconnect();
		}

	} // L: 30

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Let;B)Ljava/net/URLConnection;",
		garbageValue = "46"
	)
	URLConnection method2835(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1453.openConnection(); // L: 48
		this.method2823(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Let;B)Ljava/net/URLConnection;",
		garbageValue = "-94"
	)
	URLConnection method2836(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1453.openConnection(); // L: 54
		if (!this.field1451) { // L: 55
			var2.setSSLSocketFactory(class15.method179()); // L: 56
		}

		this.method2823(var2); // L: 58
		return var2; // L: 59
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhe;",
		garbageValue = "-242071193"
	)
	static HorizontalAlignment[] method2844() {
		return new HorizontalAlignment[]{HorizontalAlignment.field2018, HorizontalAlignment.field2016, HorizontalAlignment.HorizontalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1761588634"
	)
	static void method2843() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12105
			int var1 = var0.group; // L: 12106
			if (ModeWhere.loadInterface(var1)) { // L: 12107
				boolean var2 = true; // L: 12108
				Widget[] var3 = PacketBufferNode.Widget_interfaceComponents[var1]; // L: 12109

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12110
					if (var3[var4] != null) { // L: 12111
						var2 = var3[var4].isIf3; // L: 12112
						break;
					}
				}

				if (!var2) { // L: 12116
					var4 = (int)var0.key; // L: 12117
					Widget var5 = class92.getWidget(var4); // L: 12118
					if (var5 != null) { // L: 12119
						class218.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12123

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1946244652"
	)
	static final void method2845() {
		Client.field732 = Client.cycleCntr; // L: 12597
	} // L: 12598
}
