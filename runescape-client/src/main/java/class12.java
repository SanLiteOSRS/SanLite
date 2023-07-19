import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.util.ArrayList;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("as")
class class12 extends SSLSocket {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field59;
	@ObfuscatedName("ai")
	Certificate[] field57;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Laa;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 103
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public boolean getEnableSessionCreation() {
		return false; // L: 121
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 126
	}

	public String[] getEnabledProtocols() {
		return null; // L: 131
	}

	public boolean getNeedClientAuth() {
		return false; // L: 136
	}

	public SSLSession getSession() {
		return new class17(this); // L: 141
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

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 276

	public void setEnabledProtocols(String[] var1) {
	} // L: 279

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	public void setWantClientAuth(boolean var1) {
	} // L: 288

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 117

	public void setEnableSessionCreation(boolean var1) {
	} // L: 273

	public void setUseClientMode(boolean var1) {
	} // L: 285

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 108
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 292
	} // L: 342

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2110753227"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3751
			class90.method2339(0, 0); // L: 3752
		} else if (var0 != -1) { // L: 3754
			boolean var1;
			if (class305.field3398.isEmpty()) { // L: 3757
				var1 = false; // L: 3762
			} else {
				class317 var2 = (class317)class305.field3398.get(0); // L: 3758
				var1 = var2 != null && var0 == var2.field3509; // L: 3759
			}

			if (!var1 && ScriptFrame.clientPreferences.method2516() != 0) { // L: 3764 3765
				ArrayList var3 = new ArrayList(); // L: 3766
				var3.add(new class317(class329.archive11, var0, 0, ScriptFrame.clientPreferences.method2516(), false)); // L: 3767
				if (Client.playingJingle) { // L: 3768
					class305.field3398.clear(); // L: 3770
					class305.field3398.addAll(var3); // L: 3771
					class305.field3401 = 0; // L: 3773
					class305.field3400 = 100; // L: 3774
					class305.field3403 = 100; // L: 3775
					class305.field3402 = 0; // L: 3776
				} else {
					NPCComposition.method3873(var3, 0, 100, 100, 0, false); // L: 3781
				}
			}
		}

	} // L: 3786

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	static void method184() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 5106
			class161.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 5107
		}

	} // L: 5109
}
