import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class108 extends UrlRequester {
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1494209957
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("h")
	final boolean field1394;

	public class108(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1394 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "-1777205234"
	)
	void vmethod2700(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19

		try {
			try {
				String var3 = var1.url.getProtocol(); // L: 21
				if (var3.equals("http")) { // L: 22
					var2 = this.method2707(var1); // L: 23
				} else {
					if (!var3.equals("https")) { // L: 25
						var1.isDone0 = true; // L: 29
						return; // L: 30
					}

					var2 = this.method2699(var1); // L: 26
				}

				this.method2681(var2, var1); // L: 32
			} catch (IOException var7) {
			}

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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)Ljava/net/URLConnection;",
		garbageValue = "-455993048"
	)
	URLConnection method2707(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 49
		this.method2680(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)Ljava/net/URLConnection;",
		garbageValue = "-1856660904"
	)
	URLConnection method2699(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 55
		if (!this.field1394) { // L: 56
			if (class15.field81 == null) { // L: 60
				class15.field81 = new class15(); // L: 61
			}

			class15 var4 = class15.field81; // L: 63
			var2.setSSLSocketFactory(var4); // L: 65
		}

		this.method2680(var2); // L: 67
		return var2; // L: 68
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIII)V",
		garbageValue = "-1442042247"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12447
		if (var4 != null) { // L: 12448
			if (Client.minimapState < 3) { // L: 12449
				BuddyRankComparator.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12450
			}

		}
	} // L: 12451
}
