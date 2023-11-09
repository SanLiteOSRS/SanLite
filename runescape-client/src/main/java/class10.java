import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class10 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1672977445
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	static Archive field45;
	@ObfuscatedName("ay")
	final HttpsURLConnection field39;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class407 field38;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final class9 field44;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	class449 field41;
	@ObfuscatedName("at")
	boolean field42;
	@ObfuscatedName("ax")
	boolean field40;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1948104561
	)
	int field43;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lag;Lpn;Z)V"
	)
	public class10(URL var1, class9 var2, class407 var3, boolean var4) throws IOException {
		this.field42 = false; // L: 17
		this.field40 = false; // L: 18
		this.field43 = 300000; // L: 19
		if (!var2.method70()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method79()); // L: 27
		} else {
			this.field39 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				HttpsURLConnection var5 = this.field39; // L: 31
				if (class15.field64 == null) { // L: 34
					class15.field64 = new class15(); // L: 35
				}

				class15 var6 = class15.field64; // L: 37
				var5.setSSLSocketFactory(var6); // L: 39
			}

			this.field44 = var2; // L: 41
			this.field38 = var3 != null ? var3 : new class407(); // L: 42
		}
	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lag;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class407(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lpn;",
		garbageValue = "1"
	)
	public class407 method84() {
		return this.field38; // L: 46
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrj;B)V",
		garbageValue = "-60"
	)
	public void method85(class449 var1) {
		if (!this.field42) { // L: 50
			if (var1 == null) { // L: 51
				this.field38.method7658("Content-Type"); // L: 52
				this.field41 = null; // L: 53
			} else {
				this.field41 = var1; // L: 56
				if (this.field41.vmethod8317() != null) { // L: 57
					this.field38.method7628(this.field41.vmethod8317()); // L: 58
				} else {
					this.field38.method7629(); // L: 61
				}

			}
		}
	} // L: 54 63

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "204241505"
	)
	void method86() throws ProtocolException {
		if (!this.field42) { // L: 66
			this.field39.setRequestMethod(this.field44.method79()); // L: 67
			this.field38.method7655(this.field39); // L: 68
			if (this.field44.method72() && this.field41 != null) { // L: 69
				this.field39.setDoOutput(true); // L: 70
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 71

				try {
					var1.write(this.field41.vmethod8318()); // L: 73
					var1.writeTo(this.field39.getOutputStream()); // L: 74
				} catch (IOException var11) { // L: 76
					var11.printStackTrace(); // L: 77
				} finally {
					try {
						var1.close(); // L: 81
					} catch (IOException var10) { // L: 83
						var10.printStackTrace(); // L: 84
					}

				}
			}

			this.field39.setConnectTimeout(this.field43); // L: 88
			this.field39.setInstanceFollowRedirects(this.field40); // L: 89
			this.field42 = true; // L: 90
		}
	} // L: 91

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-299259250"
	)
	boolean method96() throws IOException {
		if (!this.field42) { // L: 94
			this.method86();
		}

		this.field39.connect(); // L: 95
		return this.field39.getResponseCode() == -1; // L: 96
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Laq;",
		garbageValue = "-994108625"
	)
	class20 method88() {
		try {
			if (!this.field42 || this.field39.getResponseCode() == -1) { // L: 101
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 103
			this.field39.disconnect(); // L: 104
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 105
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field39); // L: 109
			return var1; // L: 117
		} catch (IOException var8) { // L: 111
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field39.disconnect(); // L: 115
		}

		return var3; // L: 112
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IB)V",
		garbageValue = "-120"
	)
	static final void method101(Actor var0, int var1) {
		GrandExchangeOffer.worldToScreen(var0.x, var0.y, var1); // L: 5655
	} // L: 5656

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "94474654"
	)
	static final boolean method89() {
		return Client.isMenuOpen; // L: 8923
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Ldq;ZB)V",
		garbageValue = "-33"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12189
		int var3 = (int)var0.key; // L: 12190
		var0.remove(); // L: 12191
		if (var1 && var2 != -1 && WorldMapDecoration.Widget_loadedInterfaces[var2]) { // L: 12192 12193 12194
			ArchiveLoader.Widget_archive.clearFilesGroup(var2); // L: 12195
			if (UserComparator6.Widget_interfaceComponents[var2] != null) { // L: 12196
				for (int var4 = 0; var4 < UserComparator6.Widget_interfaceComponents[var2].length; ++var4) { // L: 12197
					if (UserComparator6.Widget_interfaceComponents[var2][var4] != null) { // L: 12198
						UserComparator6.Widget_interfaceComponents[var2][var4] = null; // L: 12199
					}
				}

				UserComparator6.Widget_interfaceComponents[var2] = null; // L: 12202
				WorldMapDecoration.Widget_loadedInterfaces[var2] = false; // L: 12203
			}
		}

		for (IntegerNode var5 = (IntegerNode)Client.widgetFlags.first(); var5 != null; var5 = (IntegerNode)Client.widgetFlags.next()) { // L: 12206
			if ((var5.key >> 48 & 65535L) == (long)var2) { // L: 12207
				var5.remove(); // L: 12208
			}
		}

		Widget var6 = ArchiveDiskActionHandler.getWidget(var3); // L: 12212
		if (var6 != null) {
			HorizontalAlignment.invalidateWidget(var6); // L: 12213
		}

		if (Client.rootInterface != -1) { // L: 12214
			SpotAnimationDefinition.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12215

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	static void method100() {
		if (Client.field579 && HitSplatDefinition.localPlayer != null) { // L: 12588
			int var0 = HitSplatDefinition.localPlayer.pathX[0]; // L: 12589
			int var1 = HitSplatDefinition.localPlayer.pathY[0]; // L: 12590
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12591
				return;
			}

			WorldMapSection0.oculusOrbFocalPointX = HitSplatDefinition.localPlayer.x; // L: 12592
			int var2 = class208.getTileHeight(HitSplatDefinition.localPlayer.x, HitSplatDefinition.localPlayer.y, NetFileRequest.Client_plane) - Client.camFollowHeight; // L: 12593
			if (var2 < Decimator.field400) { // L: 12594
				Decimator.field400 = var2;
			}

			TextureProvider.oculusOrbFocalPointY = HitSplatDefinition.localPlayer.y; // L: 12595
			Client.field579 = false; // L: 12596
		}

	} // L: 12598
}
