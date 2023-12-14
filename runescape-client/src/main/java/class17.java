import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
class class17 implements SSLSession {
	@ObfuscatedName("ah")
	public static String field77;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field52; // L: 182
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-1889470685"
	)
	public static char method262(byte var0) {
		int var1 = var0 & 255; // L: 79
		if (var1 == 0) { // L: 80
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 81
				char var2 = class396.cp1252AsciiExtension[var1 - 128]; // L: 82
				if (var2 == 0) { // L: 83
					var2 = '?';
				}

				var1 = var2; // L: 84
			}

			return (char)var1; // L: 86
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-81"
	)
	static int method248(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5100
			int var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5101
			ObjectComposition var4 = WorldMapSection2.getObjectDefinition(var3); // L: 5102
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5103
			return 1; // L: 5104
		} else {
			return 2; // L: 5106
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1059264411"
	)
	static void method263() {
		Client.packetWriter.clearBuffer(); // L: 2705
		Client.packetWriter.packetBuffer.offset = 0; // L: 2706
		Client.packetWriter.serverPacket = null; // L: 2707
		Client.packetWriter.field1414 = null; // L: 2708
		Client.packetWriter.field1409 = null; // L: 2709
		Client.packetWriter.field1416 = null; // L: 2710
		Client.packetWriter.serverPacketLength = 0; // L: 2711
		Client.packetWriter.field1412 = 0; // L: 2712
		Client.rebootTimer = 0; // L: 2713
		class160.method3434(); // L: 2714
		Client.minimapState = 0; // L: 2715
		Client.destinationX = 0; // L: 2716

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2717
			Client.players[var0] = null;
		}

		class229.localPlayer = null; // L: 2718

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2719
			NPC var1 = Client.npcs[var0]; // L: 2720
			if (var1 != null) { // L: 2721
				var1.targetIndex = -1; // L: 2722
				var1.false0 = false; // L: 2723
			}
		}

		class59.method1185(); // L: 2726
		WorldMapSection2.method4516(30); // L: 2727

		for (var0 = 0; var0 < 100; ++var0) { // L: 2728
			Client.field708[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 2730
			PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher); // L: 2732
			var2.packetBuffer.writeByte(ApproximateRouteStrategy.getWindowedMode()); // L: 2733
			var2.packetBuffer.writeShort(Language.canvasWidth); // L: 2734
			var2.packetBuffer.writeShort(class47.canvasHeight); // L: 2735
			Client.packetWriter.addNode(var2); // L: 2736
		}

	} // L: 2738

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIIIIII)V",
		garbageValue = "-1558777613"
	)
	static final void method245(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field569) { // L: 11253
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11254
		}

		Client.field569 = false; // L: 11255
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11256
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11257
				var0.scrollY -= 4; // L: 11258
				class159.invalidateWidget(var0); // L: 11259
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11261
				var0.scrollY += 4; // L: 11262
				class159.invalidateWidget(var0); // L: 11263
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11265
				var7 = var3 * (var3 - 32) / var4; // L: 11266
				if (var7 < 8) { // L: 11267
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11268
				int var9 = var3 - 32 - var7; // L: 11269
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11270
				class159.invalidateWidget(var0); // L: 11271
				Client.field569 = true; // L: 11272
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11275
			var7 = var0.width; // L: 11276
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11277
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11278
				class159.invalidateWidget(var0); // L: 11279
			}
		}

	} // L: 11282
}
