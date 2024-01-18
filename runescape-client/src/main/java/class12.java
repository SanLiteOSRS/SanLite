import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ad")
class class12 extends SSLSocket {
	@ObfuscatedName("am")
	Certificate[] field48;
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
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 103
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 108
	}

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

	public String[] getSupportedProtocols() {
		return null; // L: 251
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 256
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

	public boolean getUseClientMode() {
		return false; // L: 261
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public void setUseClientMode(boolean var1) {
	} // L: 285

	public void setWantClientAuth(boolean var1) {
	} // L: 288

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 117

	public void setEnabledProtocols(String[] var1) {
	} // L: 279

	public SSLSession getSession() {
		return new class17(this); // L: 141
	}

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lek;",
		garbageValue = "11"
	)
	static class129 method169(int var0) {
		class129[] var1 = new class129[]{class129.field1513, class129.field1510, class129.field1512, class129.field1515, class129.field1514}; // L: 142
		class129 var2 = (class129)GrandExchangeEvents.findEnumerated(var1, var0); // L: 144
		if (var2 == null) { // L: 145
			var2 = class129.field1513;
		}

		return var2; // L: 146
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1131405522"
	)
	public static void method146() {
		FloorUnderlayDefinition.field2039.clear(); // L: 86
	} // L: 87

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2045206106"
	)
	static void method168() {
		for (class225 var0 = (class225)Client.field716.last(); var0 != null; var0 = (class225)Client.field716.previous()) { // L: 5141
			var0.remove(); // L: 5142
		}

	} // L: 5144

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-669266989"
	)
	static void method170(Buffer var0) {
		if (Client.randomDatData != null) { // L: 12664
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 12665
		} else {
			byte[] var1 = class135.method3147(); // L: 12668
			var0.writeBytes(var1, 0, var1.length); // L: 12669
		}
	} // L: 12666 12670
}
