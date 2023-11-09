import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class110 extends UrlRequester {
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1817988143
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("an")
	final boolean field1400;

	public class110(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1400 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Leo;I)V",
		garbageValue = "1239593024"
	)
	void vmethod2809(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label136: {
			label128: {
				try {
					label131: {
						var9 = true;
						String var3 = var1.field1405.getProtocol();
						if (var3.equals("http")) {
							var2 = this.method2810(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1402 = UrlRequest.field1404 * -2;
								var9 = false;
								break label131;
							}

							var2 = this.method2808(var1);
						}

						this.method2802(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) { // L: 34
					var1.field1402 = UrlRequest.field1404 * -2;
					var9 = false;
					break label128;
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

				return;
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Leo;I)Ljava/net/URLConnection;",
		garbageValue = "-1488509554"
	)
	URLConnection method2810(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1405.openConnection(); // L: 48
		this.method2791(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Leo;I)Ljava/net/URLConnection;",
		garbageValue = "-26988696"
	)
	URLConnection method2808(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1405.openConnection(); // L: 54
		if (!this.field1400) { // L: 55
			if (class15.field76 == null) { // L: 59
				class15.field76 = new class15(); // L: 60
			}

			class15 var4 = class15.field76;
			var2.setSSLSocketFactory(var4);
		}

		this.method2791(var2);
		return var2;
	}

	@ObfuscatedName("aj")
	public static final int method2818(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "62279651"
	)
	public static String method2819(CharSequence var0) {
		long var3 = 0L; // L: 62
		int var5 = var0.length(); // L: 63

		for (int var6 = 0; var6 < var5; ++var6) { // L: 64
			var3 *= 37L; // L: 65
			char var7 = var0.charAt(var6); // L: 66
			if (var7 >= 'A' && var7 <= 'Z') { // L: 67
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') { // L: 68
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48); // L: 69
			}

			if (var3 >= 177917621779460413L) { // L: 70
				break;
			}
		}

		while (0L == var3 % 37L && var3 != 0L) { // L: 72
			var3 /= 37L;
		}

		String var8 = GrandExchangeOffer.base37DecodeLong(var3); // L: 75
		if (var8 == null) { // L: 76
			var8 = "";
		}

		return var8; // L: 77
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lmy;III)V",
		garbageValue = "73329471"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3726
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3727
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3728
				if (var3 == null) { // L: 3729
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3730
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3731
				if (var3.contains(var4, var5)) { // L: 3732
					var4 -= var3.width / 2; // L: 3733
					var5 -= var3.height / 2; // L: 3734
					int var6 = Client.camAngleY & 2047; // L: 3735
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3736
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3737
					int var9 = var7 * var5 + var4 * var8 >> 11; // L: 3738
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3739
					int var11 = var9 + BuddyRankComparator.localPlayer.x >> 7; // L: 3740
					int var12 = BuddyRankComparator.localPlayer.y - var10 >> 7; // L: 3741
					PacketBufferNode var13 = UserComparator9.getPacketBufferNode(ClientPacket.field3093, Client.packetWriter.isaacCipher); // L: 3743
					var13.packetBuffer.writeByte(18); // L: 3744
					var13.packetBuffer.method8658(class178.baseY * 64 + var12); // L: 3745
					var13.packetBuffer.writeShort(GameEngine.baseX * 64 + var11); // L: 3746
					var13.packetBuffer.method8873(Client.field712.method4074(82) ? (Client.field712.method4074(81) ? 2 : 1) : 0); // L: 3747
					var13.packetBuffer.writeByte(var4); // L: 3748
					var13.packetBuffer.writeByte(var5); // L: 3749
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3750
					var13.packetBuffer.writeByte(57); // L: 3751
					var13.packetBuffer.writeByte(0); // L: 3752
					var13.packetBuffer.writeByte(0); // L: 3753
					var13.packetBuffer.writeByte(89); // L: 3754
					var13.packetBuffer.writeShort(BuddyRankComparator.localPlayer.x); // L: 3755
					var13.packetBuffer.writeShort(BuddyRankComparator.localPlayer.y); // L: 3756
					var13.packetBuffer.writeByte(63); // L: 3757
					Client.packetWriter.addNode(var13); // L: 3758
					Client.destinationX = var11; // L: 3759
					Client.destinationY = var12; // L: 3760
				}
			}

		}
	} // L: 3763

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-726762980"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class351.method6635(var0, var1, var2, var3, var4, var5, -1, false); // L: 9704
	} // L: 9705
}
