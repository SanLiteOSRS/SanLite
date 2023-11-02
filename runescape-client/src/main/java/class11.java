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

@ObfuscatedName("aa")
class class11 implements TlsAuthentication {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	static AbstractSocket field59;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lay;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
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

			this.this$2.this$1.field63 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CLoa;I)I",
		garbageValue = "832566677"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "610139414"
	)
	static void method112() {
		Players.Players_count = 0; // L: 702

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 703
			Players.field1373[var0] = null; // L: 704
			Players.field1370[var0] = class231.field2428; // L: 705
		}

	} // L: 707

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIII)Z",
		garbageValue = "-916093529"
	)
	static final boolean method111(Model var0, int var1, int var2, int var3, int var4) {
		if (!GrandExchangeOfferTotalQuantityComparator.method7050()) { // L: 169
			return false;
		} else {
			TextureProvider.method4886(); // L: 170
			class245 var5 = (class245)var0.field2761.get(var1); // L: 171
			int var6 = var2 + var5.field2652; // L: 172
			int var7 = var3 + var5.field2659; // L: 173
			int var8 = var4 + var5.field2651; // L: 174
			int var9 = var5.field2654; // L: 175
			int var10 = var5.field2655; // L: 176
			int var11 = var5.field2656; // L: 177
			int var12 = ViewportMouse.field2808 - var6; // L: 178
			int var13 = ViewportMouse.field2807 - var7; // L: 179
			int var14 = class286.field3074 - var8; // L: 180
			if (Math.abs(var12) > var9 + class190.field1914) { // L: 181
				return false; // L: 182
			} else if (Math.abs(var13) > var10 + GraphicsObject.field890) { // L: 184
				return false; // L: 185
			} else if (Math.abs(var14) > var11 + HealthBar.field1312) { // L: 187
				return false; // L: 188
			} else if (Math.abs(var14 * ViewportMouse.field2802 - var13 * ViewportMouse.field2809) > var11 * GraphicsObject.field890 + var10 * HealthBar.field1312) { // L: 190
				return false; // L: 191
			} else if (Math.abs(var12 * ViewportMouse.field2809 - var14 * class180.field1865) > var11 * class190.field1914 + var9 * HealthBar.field1312) { // L: 193
				return false; // L: 194
			} else {
				return Math.abs(var13 * class180.field1865 - var12 * ViewportMouse.field2802) <= var9 * GraphicsObject.field890 + var10 * class190.field1914; // L: 196
			}
		}
	}
}
