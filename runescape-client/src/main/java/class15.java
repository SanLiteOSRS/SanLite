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

@ObfuscatedName("ab")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	static class15 field78;
	@ObfuscatedName("au")
	SecureRandom field77;

	static {
		if (Security.getProvider("BC") == null) { // L: 40
			Security.addProvider(new BouncyCastleProvider());
		}

	} // L: 41

	class15() {
		this.field77 = new SecureRandom(); // L: 43
	} // L: 53

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "59"
	)
	SSLSocket method190(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1); // L: 98
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) { // L: 57
			var1 = new Socket(); // L: 58
		}

		if (!var1.isConnected()) { // L: 60
			var1.connect(new InetSocketAddress(var2, var3)); // L: 61
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field77); // L: 63
		return this.method190(var2, var5); // L: 64
	}

	public String[] getDefaultCipherSuites() {
		return null; // L: 69
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 74
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

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null; // L: 94
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lab;",
		garbageValue = "1970056082"
	)
	public static class15 method179() {
		if (field78 == null) { // L: 47
			field78 = new class15(); // L: 48
		}

		return field78; // L: 50
	}
}
