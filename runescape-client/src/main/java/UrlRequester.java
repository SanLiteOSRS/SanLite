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
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("at")
	final Thread field1395;
	@ObfuscatedName("an")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("av")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2102049249
	)
	int field1397;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1395 = new Thread(this); // L: 21
		this.field1395.setPriority(1); // L: 22
		this.field1395.start(); // L: 23
		this.field1397 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "2051535253"
	)
	abstract void vmethod2824(UrlRequest var1) throws IOException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "601333595"
	)
	int method2801(URLConnection var1) {
		int var2 = UrlRequest.field1405; // L: 53
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "20210019"
	)
	void method2802(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1397); // L: 70
	} // L: 71

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Let;I)V",
		garbageValue = "-916847883"
	)
	void method2803(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = WorldMapSection1.ByteArrayPool_getArray(5000); // L: 85

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 86 87 91
					var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
				}

				MusicPatchPcmStream.ByteArrayPool_release(var6); // L: 93
			}

			var2.response0 = var4; // L: 95
		} catch (IOException var14) { // L: 97
			var2.response0 = null; // L: 98
		} finally {
			var2.field1403 = this.method2801(var1); // L: 101
		}

		if (var3 != null) { // L: 103
			try {
				var3.close(); // L: 105
			} catch (IOException var13) { // L: 107
			}
		}

	} // L: 109

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Let;",
		garbageValue = "-1833072628"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "562063725"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field1395.join();
		} catch (InterruptedException var4) {
		}

	}

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

				this.vmethod2824(var1); // L: 42
			} catch (Exception var7) { // L: 44
				class260.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "2051956986"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 112

		for (int var6 = 0; var6 < var5; ++var6) { // L: 113
			char var7 = var0.charAt(var6 + var1); // L: 114
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 115
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 116
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 117
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 118
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 119
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 120
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 121
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 122
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 123
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) { // L: 124
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 125
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 126
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 127
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 128
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 129
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 130
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 131
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 132
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 133
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 134
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 135
			} else if (var7 == 732) { // L: 136
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 137
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 138
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 139
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 140
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 141
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 142
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 143
			}
		}

		return var5; // L: 145
	}
}
