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

@ObfuscatedName("el")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = 1230446191
	)
	static int field1442;
	@ObfuscatedName("aq")
	final Thread field1439;
	@ObfuscatedName("aw")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("al")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 850496283
	)
	int field1441;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1439 = new Thread(this); // L: 21
		this.field1439.setPriority(1); // L: 22
		this.field1439.start(); // L: 23
		this.field1441 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "407769226"
	)
	abstract void vmethod2913(UrlRequest var1) throws IOException;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "14"
	)
	int method2896(URLConnection var1) {
		int var2 = UrlRequest.field1445; // L: 53
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-541443087"
	)
	void method2908(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1441); // L: 70
	} // L: 71

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Leb;B)V",
		garbageValue = "14"
	)
	void method2897(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class342.ByteArrayPool_getArray(5000); // L: 85

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) { // L: 86 87 92
					byte[] var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
					var4 = var8; // L: 91
				}

				ClanChannelMember.ByteArrayPool_release(var6); // L: 94
			}

			var2.response0 = var4; // L: 96
		} catch (IOException var14) { // L: 98
			var2.response0 = null; // L: 99
		} finally {
			var2.field1448 = this.method2896(var1); // L: 102
		}

		if (var3 != null) { // L: 104
			try {
				var3.close(); // L: 106
			} catch (IOException var13) { // L: 108
			}
		}

	} // L: 110

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Leb;",
		garbageValue = "25"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 113
		synchronized(this) { // L: 114
			this.requests.add(var2); // L: 115
			this.notify(); // L: 116
			return var2; // L: 118
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1990531541"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 122

		try {
			synchronized(this) { // L: 124
				this.notify(); // L: 125
			} // L: 126

			this.field1439.join(); // L: 127
		} catch (InterruptedException var4) { // L: 129
		}

	} // L: 130

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

				this.vmethod2913(var1); // L: 42
			} catch (Exception var7) { // L: 44
				class315.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48
}
