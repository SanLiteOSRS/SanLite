import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("aa")
class class11 implements TlsAuthentication {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 706410807
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lad;)V"
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

			this.this$2.this$1.field59 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 328
		} catch (CertificateException var7) { // L: 330
			throw new IOException(var7); // L: 331
		}
	} // L: 333

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 337
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "-790604853"
	)
	static void method105(GameEngine var0) {
		class211 var1 = class350.method6624(); // L: 1944

		while (var1.method4133()) { // L: 1945
			if (var1.field2349 == 13) { // L: 1946
				class9.method66(); // L: 1947
				return; // L: 1948
			}

			if (var1.field2349 == 96) { // L: 1950
				if (Login.worldSelectPage > 0 && class299.worldSelectLeftSprite != null) { // L: 1951
					--Login.worldSelectPage; // L: 1952
				}
			} else if (var1.field2349 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class128.worldSelectRightSprite != null) { // L: 1955 1956
				++Login.worldSelectPage; // L: 1957
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1961
			int var2 = Login.xPadding + 280; // L: 1962
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1963
				ScriptFrame.changeWorldSelectSorting(0, 0); // L: 1964
				return; // L: 1965
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1967
				ScriptFrame.changeWorldSelectSorting(0, 1); // L: 1968
				return; // L: 1969
			}

			int var3 = Login.xPadding + 390; // L: 1971
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1972
				ScriptFrame.changeWorldSelectSorting(1, 0); // L: 1973
				return; // L: 1974
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1976
				ScriptFrame.changeWorldSelectSorting(1, 1); // L: 1977
				return; // L: 1978
			}

			int var4 = Login.xPadding + 500; // L: 1980
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1981
				ScriptFrame.changeWorldSelectSorting(2, 0); // L: 1982
				return; // L: 1983
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1985
				ScriptFrame.changeWorldSelectSorting(2, 1); // L: 1986
				return; // L: 1987
			}

			int var5 = Login.xPadding + 610; // L: 1989
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1990
				ScriptFrame.changeWorldSelectSorting(3, 0); // L: 1991
				return; // L: 1992
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1994
				ScriptFrame.changeWorldSelectSorting(3, 1); // L: 1995
				return; // L: 1996
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1998
				class9.method66(); // L: 1999
				return; // L: 2000
			}

			if (Login.hoveredWorldIndex != -1) { // L: 2002
				World var6 = World.World_worlds[Login.hoveredWorldIndex]; // L: 2003
				class14.changeWorld(var6); // L: 2004
				class9.method66(); // L: 2005
				return; // L: 2006
			}

			if (Login.worldSelectPage > 0 && class299.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class299.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapID.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapID.canvasHeight / 2 + 50) { // L: 2008
				--Login.worldSelectPage; // L: 2009
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class128.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class448.canvasWidth - class128.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class448.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapID.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapID.canvasHeight / 2 + 50) { // L: 2011
				++Login.worldSelectPage; // L: 2012
			}
		}

	} // L: 2015

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-109"
	)
	static int method111(int var0, Script var1, boolean var2) {
		return 2; // L: 5053
	}
}
