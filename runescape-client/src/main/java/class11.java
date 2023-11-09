import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("g")
class class11 implements TlsAuthentication {
	@ObfuscatedName("q")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("r")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 310
			LinkedList var3 = new LinkedList(); // L: 311
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 313

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 314
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 315
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 317
			}

			this.this$2.this$1.field69 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "-507085025"
	)
	static final void method105(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 7971

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7972 7973 7978
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 7974
				var10 = var11; // L: 7975
				break;
			}
		}

		if (var10 == null) { // L: 7980
			var10 = new PendingSpawn(); // L: 7981
			var10.plane = var0; // L: 7982
			var10.type = var3; // L: 7983
			var10.x = var1; // L: 7984
			var10.y = var2; // L: 7985
			UserComparator4.method2809(var10); // L: 7986
			Client.pendingSpawns.addFirst(var10); // L: 7987
		}

		var10.field1167 = var4; // L: 7989
		var10.field1169 = var5; // L: 7990
		var10.field1168 = var6; // L: 7991
		var10.delay = var8; // L: 7992
		var10.hitpoints = var9; // L: 7993
		var10.method2338(var7); // L: 7994
	} // L: 7995
}
