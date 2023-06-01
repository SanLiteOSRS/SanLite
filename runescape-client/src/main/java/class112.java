import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class112 extends UrlRequester {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 360321783
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("at")
	final boolean field1406;

	public class112(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1406 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)V",
		garbageValue = "-2030459341"
	)
	void vmethod2808(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label131: {
			label125: {
				try {
					label115: {
						var9 = true; // L: 21
						String var3 = var1.field1410.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2817(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1411 = UrlRequest.field1412; // L: 29
								var9 = false;
								break label115;
							}

							var2 = this.method2807(var1); // L: 26
						}

						this.method2795(var2, var1); // L: 32
						var9 = false;
						break label131;
					}
				} catch (IOException var10) { // L: 34
					var1.field1411 = UrlRequest.field1412; // L: 35
					var9 = false;
					break label125;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return; // L: 30
			}

			if (var2 != null && var2 instanceof HttpURLConnection) { // L: 38 39
				var12 = (HttpURLConnection)var2; // L: 40
				var12.disconnect(); // L: 41
			}

			return; // L: 45
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)Ljava/net/URLConnection;",
		garbageValue = "-394294612"
	)
	URLConnection method2817(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1410.openConnection(); // L: 48
		this.method2781(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lev;S)Ljava/net/URLConnection;",
		garbageValue = "256"
	)
	URLConnection method2807(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1410.openConnection(); // L: 54
		if (!this.field1406) { // L: 55
			if (class15.field64 == null) { // L: 59
				class15.field64 = new class15(); // L: 60
			}

			class15 var4 = class15.field64; // L: 62
			var2.setSSLSocketFactory(var4); // L: 64
		}

		this.method2781(var2); // L: 66
		return var2; // L: 67
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltn;II)V",
		garbageValue = "-597306900"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		class33.method465(var0); // L: 74

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 76
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 77
			Player var5 = Client.players[var4]; // L: 78
			int var6 = var0.readUnsignedByte(); // L: 79
			if ((var6 & 8) != 0) { // L: 80
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 512) != 0) {
				var6 += var0.readUnsignedByte() << 16; // L: 81
			}

			class19.method272(var0, var4, var5, var6); // L: 82
		}

		if (var0.offset - var2 != var1) { // L: 85
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 86
		}
	} // L: 88
}
