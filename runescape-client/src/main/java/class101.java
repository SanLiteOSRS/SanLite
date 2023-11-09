import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class101 extends UrlRequester {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("c")
	final boolean field1349;

	public class101(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1349 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcb;B)V",
		garbageValue = "35"
	)
	void vmethod2629(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19

		try {
			String var3 = var1.url.getProtocol(); // L: 21
			if (var3.equals("http")) { // L: 22
				var2 = this.method2624(var1); // L: 23
			} else {
				if (!var3.equals("https")) { // L: 25
					var1.isDone0 = true; // L: 29
					return; // L: 30
				}

				var2 = this.method2625(var1); // L: 26
			}

			this.method2603(var2, var1); // L: 32
		} catch (IOException var7) {
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)Ljava/net/URLConnection;",
		garbageValue = "2109554710"
	)
	URLConnection method2624(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 49
		this.method2602(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lcb;S)Ljava/net/URLConnection;",
		garbageValue = "21713"
	)
	URLConnection method2625(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 55
		if (!this.field1349) { // L: 56
			var2.setSSLSocketFactory(class15.method190()); // L: 57
		}

		this.method2602(var2); // L: 59
		return var2; // L: 60
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "532547773"
	)
	public static char method2633(byte var0) {
		int var1 = var0 & 255; // L: 66
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16)); // L: 67
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 68
				char var2 = class341.cp1252AsciiExtension[var1 - 128]; // L: 69
				if (var2 == 0) { // L: 70
					var2 = '?';
				}

				var1 = var2; // L: 71
			}

			return (char)var1; // L: 73
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lku;III)V",
		garbageValue = "1606047506"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3794
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3795
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3796
				if (var3 == null) { // L: 3797
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3798
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3799
				if (var3.contains(var4, var5)) { // L: 3800
					var4 -= var3.width / 2; // L: 3801
					var5 -= var3.height / 2; // L: 3802
					int var6 = Client.camAngleY & 2047; // L: 3803
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3804
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3805
					int var9 = var5 * var7 + var8 * var4 >> 11; // L: 3806
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3807
					int var11 = var9 + class28.localPlayer.x >> 7; // L: 3808
					int var12 = class28.localPlayer.y - var10 >> 7; // L: 3809
					PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher); // L: 3811
					var13.packetBuffer.writeByte(18); // L: 3812
					var13.packetBuffer.writeIntME(Message.baseY * 64 + var12); // L: 3813
					var13.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3814
					var13.packetBuffer.method7969(class300.baseX * 64 + var11); // L: 3815
					var13.packetBuffer.writeByte(var4); // L: 3816
					var13.packetBuffer.writeByte(var5); // L: 3817
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3818
					var13.packetBuffer.writeByte(57); // L: 3819
					var13.packetBuffer.writeByte(0); // L: 3820
					var13.packetBuffer.writeByte(0); // L: 3821
					var13.packetBuffer.writeByte(89); // L: 3822
					var13.packetBuffer.writeShort(class28.localPlayer.x); // L: 3823
					var13.packetBuffer.writeShort(class28.localPlayer.y); // L: 3824
					var13.packetBuffer.writeByte(63); // L: 3825
					Client.packetWriter.addNode(var13); // L: 3826
					Client.destinationX = var11; // L: 3827
					Client.destinationY = var12; // L: 3828
				}
			}

		}
	} // L: 3831
}
