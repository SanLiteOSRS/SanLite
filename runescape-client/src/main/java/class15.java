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

@ObfuscatedName("aa")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static class15 field73;
	@ObfuscatedName("ai")
	SecureRandom field74;

	static {
		if (Security.getProvider("BC") == null) { // L: 40
			Security.addProvider(new BouncyCastleProvider());
		}

	} // L: 41

	class15() {
		this.field74 = new SecureRandom(); // L: 43
	} // L: 53

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "-2035247577"
	)
	SSLSocket method207(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1); // L: 98
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null; // L: 94
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

	public String[] getDefaultCipherSuites() {
		return null; // L: 69
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) { // L: 57
			var1 = new Socket(); // L: 58
		}

		if (!var1.isConnected()) { // L: 60
			var1.connect(new InetSocketAddress(var2, var3)); // L: 61
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field74); // L: 63
		return this.method207(var2, var5); // L: 64
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Laa;",
		garbageValue = "6"
	)
	public static class15 method205() {
		if (field73 == null) { // L: 47
			field73 = new class15(); // L: 48
		}

		return field73; // L: 50
	}
}
