import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("aw")
	final Thread field1424;
	@ObfuscatedName("ay")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ar")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 639596187
	)
	int field1427;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1424 = new Thread(this); // L: 21
		this.field1424.setPriority(1); // L: 22
		this.field1424.start(); // L: 23
		this.field1427 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V",
		garbageValue = "-1617729938"
	)
	abstract void vmethod2826(UrlRequest var1) throws IOException;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "380423751"
	)
	int method2805(URLConnection var1) {
		int var2 = UrlRequest.field1441; // L: 53
		if (var1 != null) { // L: 54
			try {
				if (var1 instanceof HttpURLConnection) { // L: 56
					var2 = ((HttpURLConnection)var1).getResponseCode(); // L: 57
				}
			} catch (IOException var4) { // L: 60
			}
		}

		return var2; // L: 62
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "396426494"
	)
	void method2806(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1427); // L: 70
	} // L: 71

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lei;I)V",
		garbageValue = "-1316938585"
	)
	void method2807(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 74

		try {
			int var5 = var1.getContentLength(); // L: 77
			var3 = new DataInputStream(var1.getInputStream()); // L: 78
			byte[] var4;
			if (var5 >= 0) { // L: 79
				var4 = new byte[var5]; // L: 80
				var3.readFully(var4); // L: 81
			} else {
				var4 = new byte[0]; // L: 84
				byte[] var6 = SpriteMask.ByteArrayPool_getArray(5000); // L: 85

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 86 87 91
					var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
				}

				GrandExchangeOfferUnitPriceComparator.ByteArrayPool_release(var6); // L: 93
			}

			var2.response0 = var4; // L: 95
		} catch (IOException var14) { // L: 97
			var2.response0 = null; // L: 98
		} finally {
			var2.field1437 = this.method2805(var1); // L: 101
		}

		if (var3 != null) { // L: 103
			try {
				var3.close(); // L: 105
			} catch (IOException var13) { // L: 107
			}
		}

	} // L: 109

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lei;",
		garbageValue = "1908448074"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 112
		synchronized(this) { // L: 113
			this.requests.add(var2); // L: 114
			this.notify(); // L: 115
			return var2; // L: 117
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "29176"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 121

		try {
			synchronized(this) { // L: 123
				this.notify(); // L: 124
			} // L: 125

			this.field1424.join(); // L: 126
		} catch (InterruptedException var4) { // L: 128
		}

	} // L: 129

	public void run() {
		while (!this.isClosed) { // L: 29
			try {
				UrlRequest var1;
				synchronized(this) { // L: 32
					var1 = (UrlRequest)this.requests.poll(); // L: 33
					if (var1 == null) { // L: 34
						try {
							this.wait(); // L: 36
						} catch (InterruptedException var5) { // L: 38
						}
						continue;
					}
				}

				this.vmethod2826(var1); // L: 42
			} catch (Exception var7) { // L: 44
				class317.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[Lrr;",
		garbageValue = "55"
	)
	static class454[] method2824() {
		return new class454[]{class454.field4766, class454.field4761, class454.field4763, class454.field4762}; // L: 16
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "975652572"
	)
	static final void method2823(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12231
		var0 = 100 - var0; // L: 12232
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12233
		Rasterizer3D.Rasterizer3D_setBrightness((double)var1); // L: 12235
		((TextureProvider)Rasterizer3D.field2510.Rasterizer3D_textureLoader).setBrightness((double)var1); // L: 12236
		HealthBar.method2579(); // L: 12237
		class150.clientPreferences.method2475((double)var1); // L: 12238
	} // L: 12240
}
