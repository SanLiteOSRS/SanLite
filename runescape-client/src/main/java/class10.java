import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class10 {
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -121467123
	)
	static int field53;
	@ObfuscatedName("aj")
	final HttpsURLConnection field48;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	final class390 field46;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final class9 field47;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	class432 field45;
	@ObfuscatedName("an")
	boolean field52;
	@ObfuscatedName("ao")
	boolean field50;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1952365041
	)
	int field51;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lar;Lpu;Z)V"
	)
	public class10(URL var1, class9 var2, class390 var3, boolean var4) throws IOException {
		this.field52 = false; // L: 17
		this.field50 = false; // L: 18
		this.field51 = 300000; // L: 19
		if (!var2.method62()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method63()); // L: 27
		} else {
			this.field48 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				HttpsURLConnection var5 = this.field48; // L: 31
				if (class15.field76 == null) { // L: 34
					class15.field76 = new class15(); // L: 35
				}

				class15 var6 = class15.field76; // L: 37
				var5.setSSLSocketFactory(var6); // L: 39
			}

			this.field47 = var2; // L: 41
			this.field46 = var3 != null ? var3 : new class390(); // L: 42
		}
	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lar;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class390(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Lpu;",
		garbageValue = "8183"
	)
	public class390 method78() {
		return this.field46; // L: 46
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqb;B)V",
		garbageValue = "121"
	)
	public void method79(class432 var1) {
		if (!this.field52) { // L: 50
			if (var1 == null) { // L: 51
				this.field46.method7358("Content-Type"); // L: 52
				this.field45 = null; // L: 53
			} else {
				this.field45 = var1; // L: 56
				if (this.field45.vmethod7993() != null) { // L: 57
					this.field46.method7362(this.field45.vmethod7993()); // L: 58
				} else {
					this.field46.method7363(); // L: 61
				}

			}
		}
	} // L: 54 63

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1245579304"
	)
	void method80() throws ProtocolException {
		if (!this.field52) { // L: 66
			this.field48.setRequestMethod(this.field47.method63()); // L: 67
			this.field46.method7355(this.field48); // L: 68
			if (this.field47.method64() && this.field45 != null) { // L: 69
				this.field48.setDoOutput(true); // L: 70
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 71

				try {
					var1.write(this.field45.vmethod7994()); // L: 73
					var1.writeTo(this.field48.getOutputStream()); // L: 74
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

			this.field48.setConnectTimeout(this.field51); // L: 88
			this.field48.setInstanceFollowRedirects(this.field50); // L: 89
			this.field52 = true; // L: 90
		}
	} // L: 91

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-105"
	)
	boolean method81() throws IOException {
		if (!this.field52) { // L: 94
			this.method80();
		}

		this.field48.connect(); // L: 95
		return this.field48.getResponseCode() == -1; // L: 96
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Laf;",
		garbageValue = "2110513112"
	)
	class20 method89() {
		try {
			if (!this.field52 || this.field48.getResponseCode() == -1) { // L: 101
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 103
			this.field48.disconnect(); // L: 104
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 105
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field48); // L: 109
			return var1; // L: 117
		} catch (IOException var8) { // L: 111
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field48.disconnect(); // L: 115
		}

		return var3; // L: 112
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIII)V",
		garbageValue = "-793671958"
	)
	static void method91(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && WorldMapSectionType.clientPreferences.method2463() != 0) { // L: 3637
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3638
				int var4 = var0.soundEffects[var1]; // L: 3639
				if (var4 != 0) { // L: 3643
					int var7 = var4 >> 8; // L: 3644
					int var8 = var4 >> 4 & 7; // L: 3645
					int var9 = var4 & 15; // L: 3646
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3647
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3648
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3649
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3650
					int var10 = (var2 - 64) / 128; // L: 3651
					int var11 = (var3 - 64) / 128; // L: 3652
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3653
					++Client.soundEffectCount; // L: 3654
				}

			}
		}
	} // L: 3656
}
