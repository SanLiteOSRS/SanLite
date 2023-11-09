import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("as")
class class12 extends SSLSocket {
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("gg")
	static String field63;
	@ObfuscatedName("jr")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("aj")
	Certificate[] field61;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Laz;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	static void method109() {
		Tiles.Tiles_minPlane = 99; // L: 49
		Tiles.field995 = new short[4][104][104]; // L: 50
		Tiles.field996 = new short[4][104][104]; // L: 51
		class16.field81 = new byte[4][104][104]; // L: 52
		Tiles.field997 = new byte[4][104][104]; // L: 53
		class17.field88 = new int[4][105][105]; // L: 54
		Decimator.field405 = new byte[4][105][105]; // L: 55
		class306.field3445 = new int[105][105]; // L: 56
		Tiles.Tiles_hue = new int[104]; // L: 57
		class134.Tiles_saturation = new int[104]; // L: 58
		Language.Tiles_lightness = new int[104]; // L: 59
		TileItem.Tiles_hueMultiplier = new int[104]; // L: 60
		Interpreter.field840 = new int[104]; // L: 61
	} // L: 62

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-2"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "675774745"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class260.World_worlds[var6]; // L: 180
			class260.World_worlds[var6] = class260.World_worlds[var1]; // L: 181
			class260.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (class60.method1161(class260.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = class260.World_worlds[var9]; // L: 185
					class260.World_worlds[var9] = class260.World_worlds[var7]; // L: 186
					class260.World_worlds[var7++] = var10; // L: 187
				}
			}

			class260.World_worlds[var1] = class260.World_worlds[var7]; // L: 191
			class260.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1142912299"
	)
	static final void method151(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11665
		WorldMapSectionType.clientPreferences.method2443(var0); // L: 11666
	} // L: 11667
}
