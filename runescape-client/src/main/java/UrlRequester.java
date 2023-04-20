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

@ObfuscatedName("et")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("af")
	final Thread field1399;
	@ObfuscatedName("an")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("aw")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1429112917
	)
	int field1398;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1399 = new Thread(this); // L: 21
		this.field1399.setPriority(1); // L: 22
		this.field1399.start(); // L: 23
		this.field1398 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)V",
		garbageValue = "16"
	)
	abstract void vmethod2842(UrlRequest var1) throws IOException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "-996917348"
	)
	int method2816(URLConnection var1) {
		int var2 = UrlRequest.field1406;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-218004174"
	)
	void method2832(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1398); // L: 70
	} // L: 71

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lez;B)V",
		garbageValue = "1"
	)
	void method2835(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = AbstractWorldMapData.ByteArrayPool_getArray(5000); // L: 85

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 86 87 91
					var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
				}

				InterfaceParent.ByteArrayPool_release(var6); // L: 93
			}

			var2.response0 = var4; // L: 95
		} catch (IOException var14) { // L: 97
			var2.response0 = null; // L: 98
		} finally {
			var2.field1405 = this.method2816(var1); // L: 101
		}

		if (var3 != null) { // L: 103
			try {
				var3.close(); // L: 105
			} catch (IOException var13) { // L: 107
			}
		}

	} // L: 109

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lez;",
		garbageValue = "-73486264"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1770460847"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 121

		try {
			synchronized(this) { // L: 123
				this.notify(); // L: 124
			} // L: 125

			this.field1399.join(); // L: 126
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

				this.vmethod2842(var1);
			} catch (Exception var7) {
				class387.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "46"
	)
	static boolean method2840(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 39
			boolean var3 = false; // L: 40
			boolean var4 = false; // L: 41
			int var5 = 0; // L: 42
			int var6 = var0.length(); // L: 43

			for (int var7 = 0; var7 < var6; ++var7) { // L: 44
				char var8 = var0.charAt(var7); // L: 45
				if (var7 == 0) { // L: 46
					if (var8 == '-') { // L: 47
						var3 = true; // L: 48
						continue;
					}

					if (var8 == '+') { // L: 51
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 53
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 54
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 55
						return false; // L: 56
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 57
					return false;
				}

				if (var3) { // L: 58
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 59
				if (var9 / var1 != var5) { // L: 60
					return false;
				}

				var5 = var9; // L: 61
				var4 = true; // L: 62
			}

			return var4; // L: 64
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-166868527"
	)
	static void method2839(float[] var0) {
		if (class121.field1462 + var0[0] < 1.3333334F) { // L: 317
			float var1 = var0[0] - 2.0F; // L: 318
			float var2 = var0[0] - 1.0F; // L: 319
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F)); // L: 320
			float var4 = 0.5F * (-var1 + var3); // L: 321
			if (class121.field1462 + var0[1] > var4) { // L: 322
				var0[1] = var4 - class121.field1462; // L: 323
			} else {
				var4 = 0.5F * (-var1 - var3); // L: 326
				if (var0[1] < class121.field1462 + var4) { // L: 327
					var0[1] = var4 + class121.field1462; // L: 328
				}
			}
		} else {
			var0[0] = 1.3333334F - class121.field1462; // L: 333
			var0[1] = 0.33333334F - class121.field1462; // L: 334
		}

	} // L: 336
}
