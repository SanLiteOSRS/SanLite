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

@ObfuscatedName("ev")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1638537919
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("au")
	final Thread field1446;
	@ObfuscatedName("ae")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ao")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1715908929
	)
	int field1443;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1446 = new Thread(this); // L: 21
		this.field1446.setPriority(1); // L: 22
		this.field1446.start(); // L: 23
		this.field1443 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Let;B)V",
		garbageValue = "-114"
	)
	abstract void vmethod2839(UrlRequest var1) throws IOException;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "20"
	)
	int method2821(URLConnection var1) {
		int var2 = UrlRequest.field1455; // L: 53
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "61"
	)
	void method2823(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1443); // L: 70
	} // L: 71

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Let;I)V",
		garbageValue = "-703916602"
	)
	void method2812(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class125.ByteArrayPool_getArray(5000); // L: 85

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 86 87 91
					var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
				}

				PlayerType.ByteArrayPool_release(var6); // L: 93
			}

			var2.response0 = var4; // L: 95
		} catch (IOException var14) { // L: 97
			var2.response0 = null; // L: 98
		} finally {
			var2.field1456 = this.method2821(var1); // L: 101
		}

		if (var3 != null) { // L: 103
			try {
				var3.close(); // L: 105
			} catch (IOException var13) { // L: 107
			}
		}

	} // L: 109

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Let;",
		garbageValue = "95"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-710296298"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 121

		try {
			synchronized(this) { // L: 123
				this.notify(); // L: 124
			} // L: 125

			this.field1446.join(); // L: 126
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

				this.vmethod2839(var1); // L: 42
			} catch (Exception var7) { // L: 44
				Messages.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2153026"
	)
	public static void method2829() {
		class305.field3405.clear(); // L: 142
	} // L: 143

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	public static void method2832() {
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 583
	} // L: 584

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "286684178"
	)
	static long method2810() {
		return Client.field656; // L: 2920
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1352739934"
	)
	static boolean method2831() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5212
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1224778546"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12614
			PacketBufferNode var1 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 12616
			var1.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var0)); // L: 12617
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12618
			Client.packetWriter.addNode(var1); // L: 12619
		}
	} // L: 12620
}
