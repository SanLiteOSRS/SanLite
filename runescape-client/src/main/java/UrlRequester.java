import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1543897929
	)
	static int field1389;
	@ObfuscatedName("a")
	final Thread field1385;
	@ObfuscatedName("f")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("c")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 392198645
	)
	int field1386;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 16
		this.field1385 = new Thread(this); // L: 20
		this.field1385.setPriority(1); // L: 21
		this.field1385.start(); // L: 22
		this.field1386 = var1; // L: 23
	} // L: 24

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "-1777205234"
	)
	abstract void vmethod2700(UrlRequest var1) throws IOException;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-2112853190"
	)
	void method2680(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 52
		var1.setReadTimeout(5000); // L: 53
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close"); // L: 55
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1386); // L: 56
	} // L: 57

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lde;I)V",
		garbageValue = "229890496"
	)
	void method2681(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 60

		try {
			int var5 = var1.getContentLength(); // L: 63
			var3 = new DataInputStream(var1.getInputStream()); // L: 64
			byte[] var4;
			if (var5 >= 0) { // L: 65
				var4 = new byte[var5]; // L: 66
				var3.readFully(var4); // L: 67
			} else {
				var4 = new byte[0]; // L: 70
				byte[] var6 = KeyHandler.ByteArrayPool_getArray(5000); // L: 71

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 72 73 77
					var8 = new byte[var4.length + var7]; // L: 74
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 75
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 76
				}

				class199.ByteArrayPool_release(var6); // L: 79
			}

			var2.response0 = var4; // L: 81
		} catch (IOException var10) { // L: 83
		}

		if (var3 != null) { // L: 84
			try {
				var3.close(); // L: 86
			} catch (IOException var9) { // L: 88
			}
		}

	} // L: 90

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lde;",
		garbageValue = "-77220349"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 93
		synchronized(this) { // L: 94
			this.requests.add(var2); // L: 95
			this.notify(); // L: 96
			return var2; // L: 98
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 102

		try {
			synchronized(this) { // L: 104
				this.notify(); // L: 105
			} // L: 106

			this.field1385.join(); // L: 107
		} catch (InterruptedException var4) { // L: 109
		}

	} // L: 110

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll(); // L: 32
					if (var1 == null) { // L: 33
						try {
							this.wait(); // L: 35
						} catch (InterruptedException var5) { // L: 37
						}
						continue;
					}
				}

				this.vmethod2700(var1); // L: 41
			} catch (Exception var7) { // L: 43
				class421.RunException_sendStackTrace((String)null, var7);
			}
		}

	} // L: 47

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "11"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 58
				} catch (Exception var4) { // L: 34
				}
			}

			if (class32.field176.startsWith("win")) { // L: 36
				class411.method7742(var0, 0, "openjs"); // L: 39
			} else if (class32.field176.startsWith("mac")) { // L: 44
				class411.method7742(var0, 1, "openjs"); // L: 45
			} else {
				class411.method7742(var0, 2, "openjs"); // L: 49
			}
		} else {
			class411.method7742(var0, 3, "openjs"); // L: 54
		}

	}
}
