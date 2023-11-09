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

@ObfuscatedName("ea")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ai")
	final Thread field1435;
	@ObfuscatedName("aj")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ac")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 849416047
	)
	int field1433;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1435 = new Thread(this); // L: 21
		this.field1435.setPriority(1); // L: 22
		this.field1435.start(); // L: 23
		this.field1433 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ler;S)V",
		garbageValue = "-23389"
	)
	abstract void vmethod2893(UrlRequest var1) throws IOException;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "-104"
	)
	int method2874(URLConnection var1) {
		int var2 = UrlRequest.field1440; // L: 53
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "2003886583"
	)
	void method2878(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1433); // L: 70
	} // L: 71

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Ler;I)V",
		garbageValue = "-1599596174"
	)
	void method2876(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = HealthBar.ByteArrayPool_getArray(5000); // L: 85

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 86 87 91
					var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
				}

				UserComparator7.ByteArrayPool_release(var6); // L: 93
			}

			var2.response0 = var4; // L: 95
		} catch (IOException var14) { // L: 97
			var2.response0 = null;
		} finally {
			var2.field1443 = this.method2874(var1);
		}

		if (var3 != null) { // L: 103
			try {
				var3.close(); // L: 105
			} catch (IOException var13) { // L: 107
			}
		}

	} // L: 109

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Ler;",
		garbageValue = "0"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1493788437"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 121

		try {
			synchronized(this) { // L: 123
				this.notify(); // L: 124
			} // L: 125

			this.field1435.join(); // L: 126
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

				this.vmethod2893(var1); // L: 42
			} catch (Exception var7) { // L: 44
				MusicPatchNode.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1715489156"
	)
	public static int method2892(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 98 99 102
			var2 = var2 << 1 | var0 & 1; // L: 100
			var0 >>>= 1; // L: 101
		}

		return var2; // L: 104
	}
}
