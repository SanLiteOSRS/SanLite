import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ao")
class class11 implements TlsAuthentication {
	@ObfuscatedName("ay")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lam;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 313
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 337
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 317
			LinkedList var3 = new LinkedList(); // L: 318
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 320

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 321
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 322
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 324
			}

			this.this$2.this$1.field57 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 328
		} catch (CertificateException var7) { // L: 330
			throw new IOException(var7); // L: 331
		}
	} // L: 333

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Lld;",
		garbageValue = "-1405458613"
	)
	public static ServerPacket[] method128() {
		return new ServerPacket[]{ServerPacket.field3289, ServerPacket.field3303, ServerPacket.field3229, ServerPacket.field3250, ServerPacket.field3347, ServerPacket.field3232, ServerPacket.field3257, ServerPacket.field3234, ServerPacket.field3235, ServerPacket.field3301, ServerPacket.field3237, ServerPacket.field3238, ServerPacket.field3239, ServerPacket.field3240, ServerPacket.field3241, ServerPacket.field3247, ServerPacket.field3243, ServerPacket.field3244, ServerPacket.field3245, ServerPacket.field3246, ServerPacket.field3253, ServerPacket.field3248, ServerPacket.field3249, ServerPacket.field3314, ServerPacket.field3292, ServerPacket.field3252, ServerPacket.field3272, ServerPacket.field3254, ServerPacket.field3267, ServerPacket.field3256, ServerPacket.field3264, ServerPacket.field3258, ServerPacket.field3227, ServerPacket.field3260, ServerPacket.field3261, ServerPacket.field3262, ServerPacket.field3242, ServerPacket.field3255, ServerPacket.field3265, ServerPacket.field3266, ServerPacket.field3311, ServerPacket.field3268, ServerPacket.field3259, ServerPacket.field3270, ServerPacket.field3271, ServerPacket.field3319, ServerPacket.field3288, ServerPacket.field3274, ServerPacket.field3275, ServerPacket.field3276, ServerPacket.field3277, ServerPacket.field3278, ServerPacket.field3279, ServerPacket.field3280, ServerPacket.field3281, ServerPacket.field3299, ServerPacket.field3283, ServerPacket.field3310, ServerPacket.field3322, ServerPacket.field3286, ServerPacket.field3287, ServerPacket.field3231, ServerPacket.field3328, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3306, ServerPacket.field3293, ServerPacket.field3294, ServerPacket.field3295, ServerPacket.field3296, ServerPacket.field3345, ServerPacket.field3298, ServerPacket.field3230, ServerPacket.field3300, ServerPacket.field3308, ServerPacket.field3302, ServerPacket.field3324, ServerPacket.field3273, ServerPacket.field3316, ServerPacket.field3312, ServerPacket.field3282, ServerPacket.field3284, ServerPacket.field3309, ServerPacket.field3228, ServerPacket.field3341, ServerPacket.field3320, ServerPacket.field3313, ServerPacket.field3304, ServerPacket.field3315, ServerPacket.field3307, ServerPacket.field3317, ServerPacket.field3318, ServerPacket.field3334, ServerPacket.field3297, ServerPacket.field3321, ServerPacket.field3305, ServerPacket.field3269, ServerPacket.field3251, ServerPacket.field3325, ServerPacket.field3326, ServerPacket.field3327, ServerPacket.field3285, ServerPacket.field3329, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3236, ServerPacket.field3333, ServerPacket.field3263, ServerPacket.field3335, ServerPacket.field3323, ServerPacket.field3337, ServerPacket.field3338, ServerPacket.field3339, ServerPacket.field3340, ServerPacket.field3336, ServerPacket.field3342, ServerPacket.field3343, ServerPacket.field3344, ServerPacket.field3233, ServerPacket.field3346, ServerPacket.field3350, ServerPacket.field3348}; // L: 131
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2146883949"
	)
	public static void method123() {
		class36.reflectionChecks = new IterableNodeDeque();
	} // L: 25

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ltt;",
		garbageValue = "-746413596"
	)
	public static class502 method129(int var0) {
		int var1 = class500.field5028[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class502.field5037; // L: 21
		} else if (var1 == 2) { // L: 23
			return class502.field5034; // L: 24
		} else {
			return var1 == 3 ? class502.field5031 : null; // L: 26 27 29
		}
	}
}
