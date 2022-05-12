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

@ObfuscatedName("g")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("o")
	SecureRandom field78;

	static {
		if (Security.getProvider("BC") == null) { // L: 40
			Security.addProvider(new BouncyCastleProvider());
		}

	} // L: 41

	public class15() {
		this.field78 = new SecureRandom(); // L: 43
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "-2042805034"
	)
	SSLSocket method169(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1); // L: 88
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) { // L: 47
			var1 = new Socket(); // L: 48
		}

		if (!var1.isConnected()) { // L: 50
			var1.connect(new InetSocketAddress(var2, var3)); // L: 51
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field78); // L: 53
		return this.method169(var2, var5); // L: 54
	}

	public String[] getDefaultCipherSuites() {
		return null; // L: 59
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 64
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null; // L: 69
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null; // L: 79
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null; // L: 74
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null; // L: 84
	}
}
