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

@ObfuscatedName("aq")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lan;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 313
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

			this.this$2.this$1.field63 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 328
		} catch (CertificateException var7) { // L: 330
			throw new IOException(var7); // L: 331
		}
	} // L: 333

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 337
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "591994113"
	)
	public static String method97(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class385.field4428[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class385.field4428[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class385.field4428[(var6 & 15) << 2 | var7 >>> 6]).append(class385.field4428[var7 & 63]); // L: 67
				} else {
					var3.append(class385.field4428[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class385.field4428[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "18671"
	)
	static final void method96() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 97
			int var0 = Scene.Scene_cameraPitchSine; // L: 98
			int var1 = Scene.Scene_cameraPitchCosine; // L: 99
			int var2 = Scene.Scene_cameraYawSine; // L: 100
			int var3 = Scene.Scene_cameraYawCosine; // L: 101
			byte var4 = 50; // L: 102
			short var5 = 3500; // L: 103
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4380()) * var4 / Rasterizer3D.method4386(); // L: 104
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4381()) * var4 / Rasterizer3D.method4386(); // L: 105
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4380()) * var5 / Rasterizer3D.method4386(); // L: 106
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4381()) * var5 / Rasterizer3D.method4386(); // L: 107
			int var10 = class33.method492(var7, var4, var1, var0); // L: 109
			int var11 = var4 * var1 - var0 * var7 >> 16; // L: 112
			var7 = var10; // L: 115
			var10 = class33.method492(var9, var5, var1, var0); // L: 116
			int var12 = var5 * var1 - var0 * var9 >> 16; // L: 119
			var9 = var10; // L: 122
			var10 = Tiles.method2241(var6, var11, var3, var2); // L: 123
			int var13 = ClanChannelMember.method3121(var6, var11, var3, var2); // L: 124
			var6 = var10; // L: 125
			var10 = Tiles.method2241(var8, var12, var3, var2); // L: 126
			int var14 = ClanChannelMember.method3121(var8, var12, var3, var2); // L: 127
			ViewportMouse.field2779 = (var10 + var6) / 2; // L: 129
			ViewportMouse.field2793 = (var7 + var9) / 2; // L: 130
			ViewportMouse.field2785 = (var13 + var14) / 2; // L: 131
			class261.field2967 = (var10 - var6) / 2; // L: 132
			ViewportMouse.field2781 = (var9 - var7) / 2; // L: 133
			Frames.field2642 = (var14 - var13) / 2; // L: 134
			ViewportMouse.field2787 = Math.abs(class261.field2967); // L: 135
			class7.field25 = Math.abs(ViewportMouse.field2781); // L: 136
			class30.field167 = Math.abs(Frames.field2642); // L: 137
		}
	} // L: 138

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IIII)V",
		garbageValue = "1018529135"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12545
		if (var4 != null) { // L: 12546
			if (Client.minimapState < 3) { // L: 12547
				Client.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12548
			}

		}
	} // L: 12549
}
