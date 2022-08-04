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
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("x")
class class12 extends SSLSocket {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("o")
	Certificate[] field64;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lb;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 126
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 108
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public boolean getEnableSessionCreation() {
		return false; // L: 121
	}

	public String[] getEnabledProtocols() {
		return null; // L: 131
	}

	public boolean getNeedClientAuth() {
		return false; // L: 136
	}

	public String[] getSupportedProtocols() {
		return null; // L: 251
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 256
	}

	public boolean getUseClientMode() {
		return false; // L: 261
	}

	public boolean getWantClientAuth() {
		return false; // L: 266
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 270

	public void setEnableSessionCreation(boolean var1) {
	} // L: 273

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 276

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 292
	} // L: 342

	public void setUseClientMode(boolean var1) {
	} // L: 285

	public void setWantClientAuth(boolean var1) {
	} // L: 288

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 103
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 117

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	public SSLSession getSession() {
		return new class17(this); // L: 141
	}

	public void setEnabledProtocols(String[] var1) {
	} // L: 279

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "110"
	)
	static int method141(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1459
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1460
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WallObject.Widget_unpackTargetMask(class67.getWidgetFlags(var3)); // L: 1461
			return 1; // L: 1462
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1464
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1471
				if (var3.dataText == null) { // L: 1472
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1473
				}

				return 1; // L: 1474
			} else {
				return 2; // L: 1476
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1465
			--var4; // L: 1466
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1467
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1468
			} else {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1469
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2091367691"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (SequenceDefinition.pcmPlayer1 != null) { // L: 3632
			SequenceDefinition.pcmPlayer1.run();
		}

		if (class192.pcmPlayer0 != null) { // L: 3633
			class192.pcmPlayer0.run();
		}

	} // L: 3634

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1124248487"
	)
	public static boolean method161() {
		return Client.clickedWidget != null; // L: 12454
	}
}
