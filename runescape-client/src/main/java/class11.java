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

@ObfuscatedName("u")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lq;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lq;)V"
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

			this.this$2.this$1.field71 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZS)I",
		garbageValue = "2225"
	)
	static int method110(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class120.method2698(var0, var1, var2);
		} else if (var0 < 1100) {
			return WorldMapSection0.method4714(var0, var1, var2);
		} else if (var0 < 1200) {
			return class1.method4(var0, var1, var2);
		} else if (var0 < 1300) {
			return class20.method289(var0, var1, var2);
		} else if (var0 < 1400) {
			return Tiles.method2052(var0, var1, var2);
		} else if (var0 < 1500) {
			return GrandExchangeOfferAgeComparator.method5707(var0, var1, var2);
		} else if (var0 < 1600) {
			return ScriptFrame.method1077(var0, var1, var2);
		} else if (var0 < 1700) {
			return Canvas.method364(var0, var1, var2);
		} else if (var0 < 1800) {
			return class282.method5358(var0, var1, var2);
		} else if (var0 < 1900) {
			return WorldMapLabelSize.method4322(var0, var1, var2);
		} else if (var0 < 2000) {
			return ClanChannelMember.method2772(var0, var1, var2);
		} else if (var0 < 2100) {
			return WorldMapSection0.method4714(var0, var1, var2);
		} else if (var0 < 2200) {
			return class1.method4(var0, var1, var2);
		} else if (var0 < 2300) {
			return class20.method289(var0, var1, var2);
		} else if (var0 < 2400) {
			return Tiles.method2052(var0, var1, var2);
		} else if (var0 < 2500) {
			return GrandExchangeOfferAgeComparator.method5707(var0, var1, var2);
		} else if (var0 < 2600) {
			return class21.method292(var0, var1, var2);
		} else if (var0 < 2700) {
			return GrandExchangeOfferOwnWorldComparator.method1115(var0, var1, var2);
		} else if (var0 < 2800) {
			return FriendsList.method6283(var0, var1, var2);
		} else if (var0 < 2900) {
			return class131.method2795(var0, var1, var2);
		} else if (var0 < 3000) {
			return ClanChannelMember.method2772(var0, var1, var2);
		} else if (var0 < 3200) {
			return class115.method2637(var0, var1, var2);
		} else if (var0 < 3300) {
			return Client.method1630(var0, var1, var2);
		} else if (var0 < 3400) {
			return class317.method5768(var0, var1, var2);
		} else if (var0 < 3500) {
			return ParamComposition.method3370(var0, var1, var2);
		} else if (var0 < 3600) {
			return Skeleton.method3893(var0, var1, var2);
		} else if (var0 < 3700) {
			return Actor.method2176(var0, var1, var2);
		} else if (var0 < 3800) {
			return class21.method303(var0, var1, var2);
		} else if (var0 < 3900) {
			return GrandExchangeOfferWorldComparator.method5724(var0, var1, var2);
		} else if (var0 < 4000) {
			return class141.method2944(var0, var1, var2);
		} else if (var0 < 4100) {
			return ReflectionCheck.method629(var0, var1, var2);
		} else if (var0 < 4200) {
			return ItemComposition.method3572(var0, var1, var2);
		} else if (var0 < 4300) {
			return Skills.method5476(var0, var1, var2);
		} else if (var0 < 5100) {
			return ClanChannelMember.method2771(var0, var1, var2);
		} else if (var0 < 5400) {
			return ClientPacket.method4976(var0, var1, var2);
		} else if (var0 < 5600) {
			return class185.method3686(var0, var1, var2);
		} else if (var0 < 5700) {
			return WorldMapData_1.method4635(var0, var1, var2);
		} else if (var0 < 6300) {
			return class16.method203(var0, var1, var2);
		} else if (var0 < 6600) {
			return Players.method2305(var0, var1, var2);
		} else if (var0 < 6700) {
			return class160.method3129(var0, var1, var2);
		} else if (var0 < 6800) {
			return WorldMapID.method4767(var0, var1, var2);
		} else if (var0 < 6900) {
			return class334.method6130(var0, var1, var2);
		} else if (var0 < 7000) {
			return FriendLoginUpdate.method6332(var0, var1, var2);
		} else if (var0 < 7100) {
			return WorldMapCacheName.method4830(var0, var1, var2);
		} else if (var0 < 7200) {
			return MusicPatch.method5236(var0, var1, var2);
		} else if (var0 < 7300) {
			return class117.method2655(var0, var1, var2);
		} else {
			return var0 < 7500 ? MusicPatchNode.method5277(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIII)V",
		garbageValue = "1741316466"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3341 == null) {
			throw new RuntimeException();
		} else {
			var0.field3341[var1] = var2;
			var0.field3342[var1] = var3;
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "9"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		ArchiveLoader.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ljz;III)V",
		garbageValue = "-744040878"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var6 = GrandExchangeOfferOwnWorldComparator.method1118(Language.getWidgetFlags(var0));
				Widget var4;
				int var7;
				if (var6 == 0) {
					var4 = null;
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5;
							break;
						}

						var5 = class130.getWidget(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}

						++var7;
					}
				}

				Widget var8 = var4;
				if (var4 == null) {
					var8 = var0.parent;
				}

				if (var8 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var6 = GrandExchangeOfferOwnWorldComparator.method1118(Language.getWidgetFlags(var0));
					if (var6 == 0) {
						var4 = null;
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5;
								break;
							}

							var5 = class130.getWidget(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var7;
						}
					}

					var8 = var4;
					if (var4 == null) {
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					ByteArrayPool.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var9 = Client.menuOptionsCount - 1;
					if (var9 != -1) {
						GrandExchangeEvents.tempMenuAction = new MenuAction();
						GrandExchangeEvents.tempMenuAction.param0 = Client.menuArguments1[var9];
						GrandExchangeEvents.tempMenuAction.param1 = Client.menuArguments2[var9];
						GrandExchangeEvents.tempMenuAction.opcode = Client.menuOpcodes[var9];
						GrandExchangeEvents.tempMenuAction.identifier = Client.menuIdentifiers[var9];
						GrandExchangeEvents.tempMenuAction.action = Client.menuActions[var9];
					}

					return;
				}
			}

		}
	}
}
