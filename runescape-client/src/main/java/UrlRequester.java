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

@ObfuscatedName("en")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1161613517
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	static StudioGame field1436;
	@ObfuscatedName("ac")
	final Thread field1440;
	@ObfuscatedName("al")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ak")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1671444091
	)
	int field1437;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1440 = new Thread(this); // L: 21
		this.field1440.setPriority(1); // L: 22
		this.field1440.start(); // L: 23
		this.field1437 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "1796222901"
	)
	abstract void vmethod2859(UrlRequest var1) throws IOException;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "127"
	)
	int method2844(URLConnection var1) {
		int var2 = UrlRequest.field1446; // L: 53
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-1572559727"
	)
	void method2847(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1437); // L: 70
	} // L: 71

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Leq;S)V",
		garbageValue = "32767"
	)
	void method2840(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class148.ByteArrayPool_getArray(5000); // L: 85

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) { // L: 86 87 92
					byte[] var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
					var4 = var8; // L: 91
				}

				MenuAction.ByteArrayPool_release(var6); // L: 94
			}

			var2.response0 = var4; // L: 96
		} catch (IOException var14) { // L: 98
			var2.response0 = null; // L: 99
		} finally {
			var2.field1445 = this.method2844(var1); // L: 102
		}

		if (var3 != null) { // L: 104
			try {
				var3.close(); // L: 106
			} catch (IOException var13) { // L: 108
			}
		}

	} // L: 110

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Leq;",
		garbageValue = "511979680"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1319494381"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 122

		try {
			synchronized(this) { // L: 124
				this.notify(); // L: 125
			} // L: 126

			this.field1440.join(); // L: 127
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

				this.vmethod2859(var1); // L: 42
			} catch (Exception var7) { // L: 44
				class190.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)V",
		garbageValue = "1281314063"
	)
	public static void method2842(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3734; // L: 985
		boolean var4 = var2 != var3.field3611; // L: 986
		var3.field3611 = var2; // L: 987
		if (var4) { // L: 988
			int var5;
			int var6;
			if (var3.field3611 == var1) { // L: 989
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 990
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 991
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 992
						var3.equipment[var6] = var3.field3619[var6]; // L: 993
					}
				}
			} else {
				if (var3.equipment[0] < 512 || class286.method5662(var3)) { // L: 998
					var3.equipment[class223.field2348.field2342] = 1; // L: 999
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1001
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 1002
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 1003
						int[] var7 = var3.equipment; // L: 1004

						for (int var8 = 0; var8 < class403.field4489; ++var8) { // L: 1006
							KitDefinition var9 = class73.KitDefinition_get(var8); // L: 1007
							if (var9 != null && !var9.nonSelectable && var9.bodypartID == (var2 == 1 ? 7 : 0) + var5) { // L: 1008
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256; // L: 1009
								break; // L: 1010
							}
						}
					}
				}
			}
		}

		var3.method6291(); // L: 1018
	} // L: 1019
}
