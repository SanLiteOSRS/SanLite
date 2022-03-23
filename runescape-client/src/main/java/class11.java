import java.awt.Desktop;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
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

@ObfuscatedName("x")
class class11 implements TlsAuthentication {
	@ObfuscatedName("ab")
	static Image field56;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -1629123777
	)
	@Export("menuWidth")
	static int menuWidth;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lj;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field65 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZS)V",
		garbageValue = "18142"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class29.field169.startsWith("win")) {
				LoginScreenAnimation.method2247(var0, 0);
			} else if (class29.field169.startsWith("mac")) {
				class154.method3128(var0, 1, "openjs");
			} else {
				LoginScreenAnimation.method2247(var0, 2);
			}
		} else {
			LoginScreenAnimation.method2247(var0, 3);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-710158938"
	)
	static void method116(Float var0, Float var1) {
		var1 = 1.0F - var1;
		if (var0 < 0.0F) {
			var0 = 0.0F;
		}

		if (var1 < 0.0F) {
			var1 = 0.0F;
		}

		if (var0 > 1.0F || var1 > 1.0F) {
			float var2 = (float)((double)(var0 * (var0 - 2.0F + var1)) + (double)var1 * ((double)var1 - 2.0D) + 1.0D);
			if (class114.field1396 + var2 > 0.0F) {
				class144.method3022(var0, var1);
			}
		}

		var1 = 1.0F - var1;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1930297149"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = FriendSystem.scene.getWallObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) {
			var7 = FriendSystem.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (class162.method3274(var5)) {
				var10 = var4;
			}

			int[] var11 = MusicPatchNode2.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = class121.Entity_unpackID(var5);
			ObjectComposition var14 = class116.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = Message.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = FriendSystem.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = FriendSystem.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = class121.Entity_unpackID(var5);
			ObjectComposition var24 = class116.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = Message.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (class162.method3274(var5)) {
					var12 = 15597568;
				}

				int[] var18 = MusicPatchNode2.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}

		var5 = FriendSystem.scene.getGroundObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = class121.Entity_unpackID(var5);
			ObjectComposition var21 = class116.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = Message.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
				}
			}
		}

	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1139609562"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (MusicPatchNode2.loadInterface(var0)) {
			ClanSettings.field1622 = null;
			InterfaceParent.drawInterface(EnumComposition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (ClanSettings.field1622 != null) {
				InterfaceParent.drawInterface(ClanSettings.field1622, -1412584499, var1, var2, var3, var4, NPC.field1253, Projectile.field944, var7);
				ClanSettings.field1622 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field564[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field564[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkn;I)Ljava/lang/String;",
		garbageValue = "1166958975"
	)
	static String method114(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + NPC.method2367(WorldMapAreaData.method5086(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "831054462"
	)
	static void method115() {
		if (Client.oculusOrbState == 1) {
			Client.field602 = true;
		}

	}
}
