import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1967298029
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("v")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("o")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("h")
	@Export("requests")
	Queue requests;

	UrlRequester() {
		this.requests = new LinkedList();
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-1783154457"
	)
	abstract void vmethod2538(UrlRequest var1) throws IOException;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "4"
	)
	void method2524(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lct;I)V",
		garbageValue = "328398044"
	)
	void method2515(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = class355.ByteArrayPool_getArray(5000);

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
					var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}

				ServerPacket.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var10) {
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var9) {
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lct;",
		garbageValue = "1891707218"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.thread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.vmethod2538(var1);
			} catch (Exception var7) {
				class301.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-106"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class123.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2085317549"
	)
	static void method2533(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
