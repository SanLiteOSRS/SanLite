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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("cc")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("o")
	final Thread field1345;
	@ObfuscatedName("q")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("f")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 877694689
	)
	int field1342;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 16
		this.field1345 = new Thread(this); // L: 20
		this.field1345.setPriority(1); // L: 21
		this.field1345.start(); // L: 22
		this.field1342 = var1; // L: 23
	} // L: 24

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcb;B)V",
		garbageValue = "35"
	)
	abstract void vmethod2629(UrlRequest var1) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "1250753273"
	)
	void method2602(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 52
		var1.setReadTimeout(5000); // L: 53
		var1.setUseCaches(false); // L: 54
		var1.setRequestProperty("Connection", "close"); // L: 55
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1342); // L: 56
	} // L: 57

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lcb;B)V",
		garbageValue = "65"
	)
	void method2603(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class17.ByteArrayPool_getArray(5000); // L: 71

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 72 73 77
					var8 = new byte[var4.length + var7]; // L: 74
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 75
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 76
				}

				StudioGame.ByteArrayPool_release(var6); // L: 79
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lcb;",
		garbageValue = "-1581137343"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1359380152"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 102

		try {
			synchronized(this) { // L: 104
				this.notify(); // L: 105
			} // L: 106

			this.field1345.join(); // L: 107
		} catch (InterruptedException var4) { // L: 109
		}

	} // L: 110

	public void run() {
		while (!this.isClosed) { // L: 28
			try {
				UrlRequest var1;
				synchronized(this) { // L: 31
					var1 = (UrlRequest)this.requests.poll(); // L: 32
					if (var1 == null) { // L: 33
						try {
							this.wait(); // L: 35
						} catch (InterruptedException var5) { // L: 37
						}
						continue;
					}
				}

				this.vmethod2629(var1); // L: 41
			} catch (Exception var7) { // L: 43
				class359.RunException_sendStackTrace((String)null, var7); // L: 44
			}
		}

	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1859481438"
	)
	static String method2619(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "-2042908579"
	)
	static float[] method2614(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 279

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 281
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 282
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 283
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 284
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 285
		} catch (JSONException var4) { // L: 287
			var2[0] = 0.0F; // L: 288
			var2[1] = 0.0F; // L: 289
			var2[2] = 1.0F; // L: 290
			var2[3] = 1.0F; // L: 291
		}

		return var2; // L: 293
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lck;I)V",
		garbageValue = "1694192029"
	)
	static final void method2621(PendingSpawn var0) {
		long var1 = 0L; // L: 7900
		int var3 = -1; // L: 7901
		int var4 = 0; // L: 7902
		int var5 = 0; // L: 7903
		if (var0.type == 0) { // L: 7904
			var1 = Decimator.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7905
			var1 = Decimator.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7906
			var1 = Decimator.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = Decimator.scene.getGroundObjectTag(var0.plane, var0.x, var0.y); // L: 7907
		}

		if (var1 != 0L) { // L: 7908
			int var6 = Decimator.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7909
			var3 = class141.Entity_unpackID(var1); // L: 7910
			var4 = var6 & 31; // L: 7911
			var5 = var6 >> 6 & 3; // L: 7912
		}

		var0.objectId = var3; // L: 7914
		var0.field1120 = var4; // L: 7915
		var0.field1122 = var5; // L: 7916
	} // L: 7917
}
