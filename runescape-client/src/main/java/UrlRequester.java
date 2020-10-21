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

@ObfuscatedName("es")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2009862837
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("f")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("b")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("l")
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
		signature = "(Ljava/net/URL;B)Leg;",
		garbageValue = "70"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1551713219"
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
				PacketWriter.RunException_sendStackTrace((String)null, var17);
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I[BLlt;I)V",
		garbageValue = "300500560"
	)
	static void method3417(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3176 == 0) {
				class105.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				class105.ArchiveDiskActionHandler_thread.setDaemon(true);
				class105.ArchiveDiskActionHandler_thread.start();
				class105.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3176 = 600;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-25"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class219.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "([BB)Lkq;",
		garbageValue = "98"
	)
	public static Font method3430(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, class336.SpriteBuffer_xOffsets, class225.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class336.SpriteBuffer_spriteHeights, WorldMapID.SpriteBuffer_spritePalette, class13.SpriteBuffer_pixels);
			class336.SpriteBuffer_xOffsets = null;
			class225.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			WorldMapID.SpriteBuffer_spritePalette = null;
			class13.SpriteBuffer_pixels = null;
			return var1;
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-4"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
