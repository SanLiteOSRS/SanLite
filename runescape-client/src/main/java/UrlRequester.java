import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("m")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("mouseRecorder")
	static class96 mouseRecorder;
	@ObfuscatedName("gq")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("f")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("e")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("v")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList();
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Ldc;",
		garbageValue = "-1779738307"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
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
						} catch (InterruptedException var13) {
						}
						continue;
					}
				}

				DataInputStream var2 = null;
				URLConnection var3 = null;

				try {
					var3 = var1.url.openConnection();
					var3.setConnectTimeout(5000);
					var3.setReadTimeout(5000);
					var3.setUseCaches(false);
					var3.setRequestProperty("Connection", "close");
					int var7 = var3.getContentLength();
					if (var7 >= 0) {
						byte[] var5 = new byte[var7];
						var2 = new DataInputStream(var3.getInputStream());
						var2.readFully(var5);
						var1.response0 = var5;
					}

					var1.isDone0 = true;
				} catch (IOException var14) {
					var1.isDone0 = true;
				} finally {
					if (var2 != null) {
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) {
						((HttpURLConnection)var3).disconnect();
					}

				}
			} catch (Exception var17) {
				FriendsChatManager.RunException_sendStackTrace((String)null, var17);
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "117"
	)
	public static int method2504(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "216480272"
	)
	static final int method2509(int var0, int var1) {
		int var2 = AttackOption.method2378(var0 - 1, var1 - 1) + AttackOption.method2378(var0 + 1, var1 - 1) + AttackOption.method2378(var0 - 1, var1 + 1) + AttackOption.method2378(1 + var0, 1 + var1);
		int var3 = AttackOption.method2378(var0 - 1, var1) + AttackOption.method2378(1 + var0, var1) + AttackOption.method2378(var0, var1 - 1) + AttackOption.method2378(var0, var1 + 1);
		int var4 = AttackOption.method2378(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
