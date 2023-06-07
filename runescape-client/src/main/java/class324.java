import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class324 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	UrlRequest field3526;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	SpritePixels field3527;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;)V"
	)
	class324(String var1, UrlRequester var2) {
		try {
			this.field3526 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3526 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class324(UrlRequest var1) {
		this.field3526 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-1022014310"
	)
	SpritePixels method6005() {
		if (this.field3527 == null && this.field3526 != null && this.field3526.isDone()) { // L: 28
			if (this.field3526.getResponse() != null) { // L: 29
				this.field3527 = Interpreter.method2032(this.field3526.getResponse()); // L: 30
			}

			this.field3526 = null; // L: 32
		}

		return this.field3527; // L: 34
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;Ljava/lang/String;B)I",
		garbageValue = "73"
	)
	public static int method6006(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		byte[] var3 = class60.method1132(var1); // L: 15
		var0.writeSmartByteShort(var3.length); // L: 16
		var0.offset += class332.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 17
		return var0.offset - var2; // L: 18
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2103724368"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3882
			class10.clientPreferences.method2489(!class10.clientPreferences.method2434()); // L: 3883
			if (class10.clientPreferences.method2434()) { // L: 3884
				class59.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3885
			} else {
				class59.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3888
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3891
			boolean var1 = TextureProvider.method4744(var0.substring(5).trim()) == 1; // L: 3892
			class347.client.method512(var1); // L: 3893
			Rasterizer3D.method4416(var1); // L: 3894
		}

		if (var0.equalsIgnoreCase("z")) { // L: 3896
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3897
			class10.clientPreferences.method2439();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3898
			Client.field751 = !Client.field751;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3899
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3900
			if (var0.equalsIgnoreCase("errortest")) { // L: 3901
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				ScriptFrame.worldMap.showCoord = !ScriptFrame.worldMap.showCoord; // L: 3902
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3903
				class10.clientPreferences.method2438(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3904
				class10.clientPreferences.method2438(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3905
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3906
				Interpreter.method2034();
			}
		}

		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 3909
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 3910
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3911
		Client.packetWriter.addNode(var2); // L: 3912
	} // L: 3913
}
