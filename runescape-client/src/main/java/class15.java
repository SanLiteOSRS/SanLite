import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName("an")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	static class15 field74;
	@ObfuscatedName("aq")
	SecureRandom field73;

	static {
		if (Security.getProvider("BC") == null) { // L: 40
			Security.addProvider(new BouncyCastleProvider());
		}

	} // L: 41

	class15() {
		this.field73 = new SecureRandom(); // L: 43
	} // L: 53

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "-76"
	)
	SSLSocket method170(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1); // L: 98
	}

	public String[] getDefaultCipherSuites() {
		return null; // L: 69
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null; // L: 79
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null; // L: 84
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null; // L: 89
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 74
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) { // L: 57
			var1 = new Socket(); // L: 58
		}

		if (!var1.isConnected()) { // L: 60
			var1.connect(new InetSocketAddress(var2, var3)); // L: 61
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field73); // L: 63
		return this.method170(var2, var5); // L: 64
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null; // L: 94
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lan;",
		garbageValue = "-26245534"
	)
	public static class15 method167() {
		if (field74 == null) { // L: 47
			field74 = new class15(); // L: 48
		}

		return field74; // L: 50
	}
}
