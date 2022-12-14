import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class109 extends UrlRequester {
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = -1571751296
	)
	static int field1442;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -903100173
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("m")
	final boolean field1447;

	public class109(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1447 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "756674113"
	)
	void vmethod2773(UrlRequest var1) throws IOException {
		URLConnection var2 = null;

		try {
			try {
				String var3 = var1.url.getProtocol();
				if (var3.equals("http")) {
					var2 = this.method2777(var1);
				} else {
					if (!var3.equals("https")) { // L: 25
						var1.isDone0 = true; // L: 29
						return; // L: 30
					}

					var2 = this.method2775(var1); // L: 26
				}

				this.method2754(var2, var1); // L: 32
			} catch (IOException var7) {
			}

		} finally {
			var1.isDone0 = true; // L: 36
			if (var2 != null) { // L: 37
				if (var2 instanceof HttpURLConnection) { // L: 38
					((HttpURLConnection)var2).disconnect(); // L: 39
				} else if (var2 instanceof HttpsURLConnection) { // L: 41
					((HttpsURLConnection)var2).disconnect(); // L: 42
				}
			}

		}
	} // L: 46

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldm;B)Ljava/net/URLConnection;",
		garbageValue = "-106"
	)
	URLConnection method2777(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 49
		this.method2747(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ldm;B)Ljava/net/URLConnection;",
		garbageValue = "54"
	)
	URLConnection method2775(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 55
		if (!this.field1447) { // L: 56
			if (class15.field90 == null) { // L: 60
				class15.field90 = new class15(); // L: 61
			}

			class15 var4 = class15.field90; // L: 63
			var2.setSSLSocketFactory(var4); // L: 65
		}

		this.method2747(var2); // L: 67
		return var2; // L: 68
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "65"
	)
	public static PacketBufferNode method2781() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfi;",
		garbageValue = "-388064227"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lbz;Lbz;IZI)I",
		garbageValue = "1199021579"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1748() ? (var1.method1748() ? 0 : 1) : (var1.method1748() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1785() ? (var1.method1785() ? 0 : 1) : (var1.method1785() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-182594335"
	)
	public static String method2782(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 151
		int var2 = 0; // L: 152
		int var3 = -1; // L: 153

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 154
			char var5 = var0.charAt(var4); // L: 155
			if (var5 == '<') { // L: 156
				var1.append(var0.substring(var2, var4)); // L: 157
				var3 = var4; // L: 158
			} else if (var5 == '>' && var3 != -1) { // L: 161
				String var6 = var0.substring(var3 + 1, var4); // L: 162
				var3 = -1; // L: 163
				if (var6.equals("lt")) { // L: 164
					var1.append("<"); // L: 165
				} else if (var6.equals("gt")) { // L: 167
					var1.append(">"); // L: 168
				} else if (var6.equals("br")) { // L: 170
					var1.append("\n"); // L: 171
				}

				var2 = var4 + 1; // L: 173
			}
		}

		if (var2 < var0.length()) { // L: 176
			var1.append(var0.substring(var2, var0.length())); // L: 177
		}

		return var1.toString(); // L: 179
	}
}
